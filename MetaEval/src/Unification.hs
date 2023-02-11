{-# LANGUAGE MultiParamTypeClasses, TypeSynonymInstances, FlexibleInstances, FlexibleContexts #-}
module Unification (CVars(..), Clash(..), SubstApp(..), SubstUpd(..), unify, unify', (.*.), cleanRestr) where

import Lib ( nub, isEmpty )
import Lang (Term(..), Cond(..), Bind(..), Restr(..), Subst(..), Contr(..), CExp, InEq(..), CBind, dom, domEnv)

-- Извлечение списка c-переменных из c-конструкции
class CVars a where cvars :: a -> [CExp]
instance CVars CExp where
   cvars (ALT  c t1 t2)  = nub (cvars c ++ cvars t1 ++ cvars t2)
   cvars (CALL _ ps)   = cvars ps
   cvars (PVA  _)        = []
   cvars (PVE  _)        = []
   cvars (ATOM  _  )     = []
   cvars cvar@(CVA _)    = [cvar]
   cvars cvar@(CVE _)    = [cvar]
   cvars (CONS h t)      = nub (cvars h ++ cvars t)

instance CVars Cond where
   cvars (EQA  a1 a2)   = nub (cvars a1 ++ cvars a2)
   cvars (MATCH e h t a) = nub (cvars e ++ cvars h ++ cvars t ++ cvars a)

instance CVars InEq where
   cvars (ax :=/=: bx) = nub (cvars ax ++ cvars bx)

instance CVars CBind where
   cvars (_ := cx)  = cvars cx
instance CVars c => CVars [c] where
   cvars cxs           = nub (concat (map cvars cxs))
instance CVars Restr where
   cvars (INCONSISTENT _) = []
   cvars (RESTR ineqs) = cvars ineqs
instance (CVars a, CVars b) => CVars (a, b) where
   cvars (ax, bx)      = nub (cvars ax ++ cvars bx)

-- cvars для подстановки
instance CVars Subst where
   cvars (ax :-> bx)   = nub (cvars ax ++ cvars bx)

-- oсновные функции работы с рестрикциями
isContradiction, isTautology :: InEq -> Bool
isContradiction   (left   :=/=: right)  = left == right

isTautology       (ATOM a :=/=: ATOM b) = a /= b
isTautology       (_   :=/=: _)  = False

cleanRestr :: Restr -> Restr
cleanRestr  (INCONSISTENT ineqs) = INCONSISTENT ineqs
cleanRestr  (RESTR ineqs) 
  | isEmpty ineqs = RESTR []
  | any isContradiction ineqs = INCONSISTENT ineqs
  | otherwise = RESTR (nub (filter (not.isTautology) ineqs))

-- (a/.b) применить "a" к "b". Для начала, определяем, что такое применить Env к Exp
infixl 8 /.
class SubstApp a b where (/.) :: a -> b -> a
instance SubstApp Term [Bind] where
  (ATOM a)            /. _ = ATOM a
  (CONS h t)          /. env = CONS (h/.env) (t/.env)
  var                 /. env = 
    if var `notElem` domEnv env then var
    else head [ x | (v := x) <- env, v == var ]

-- общие правила расширения: умеем x/.y => умеем [x,...]/.y
instance SubstApp a subst => SubstApp [a] subst where
    cxs /. subst = map (/.subst) cxs

instance SubstApp Clash [Subst] where
    (l :=: r) /. subst = (l /. subst) :=: (r/.subst)

-- умеем a/.y и b/.y => умеем (a,b)/.y
instance {-# OVERLAPS #-} (SubstApp a subst, SubstApp b subst) => SubstApp (a, b) subst where
    (ax, bx) /. subst = ( ax/.subst, bx/.subst )

-- и описание понятия "применить подстановку к ... "
instance SubstApp Term [Subst] where
  (ALT   cnd t1 t2)  /.s = ALT   (cnd/.s) (t1/.s) (t2/.s)
  (CALL  fn exps)    /.s = CALL  fn (exps/.s)
  (ATOM a)           /._ = ATOM a
  (CONS h t)         /.s = CONS (h/.s) (t/.s)
  cvar               /.s = 
    if cvar `notElem` dom s 
      then cvar
    else head[cexp | (cv :-> cexp) <- s, cv == cvar ]

instance SubstApp Cond [Subst] where
  (EQA  a1 a2)   /. s = EQA  (a1/.s) (a2/.s)
  (MATCH e h t a) /. s = MATCH (e/.s) (h/.s) (t/.s) (a/.s)

instance SubstApp InEq [Subst] where
    (l:=/=:r) /. subst = (l/.subst) :=/=: (r/.subst)

instance SubstApp CBind [Subst] where
    (pvar := cexpr) /. subst = pvar := (cexpr/.subst)

instance SubstApp Restr [Subst] where
    INCONSISTENT ineqs  /. _ = INCONSISTENT ineqs
    (RESTR ineqs) /. subst = cleanRestr(RESTR(ineqs/.subst))

instance {-# OVERLAPPABLE #-} SubstApp c [Subst] => SubstApp (c,Restr) Contr where
   (cx,rs) /. (S subst) = (cx/.subst, rs/.subst)
   (cx,rs) /. (R restr) = (cx,        rs+.restr)

instance SubstApp Clash Contr where
   clash /. (S subst) = clash/.subst
   clash /. (R _) = clash

-- Пополнить (x +. x'). Для начала, определяем, что такое "пополнить Env"
infixl 7 +.
class SubstUpd a where (+.) :: a -> a -> a
instance SubstUpd [Bind] where
   binds +. binds' = nub (binds' ++ binds)
-- рестрикции можно пополнять (+.)
instance SubstUpd Restr where
  INCONSISTENT ineqs +. _            = INCONSISTENT ineqs
  _            +. INCONSISTENT ineqs = INCONSISTENT ineqs
  (RESTR r1)   +. (RESTR r2)   = cleanRestr (RESTR(r1++r2))

-- Отождествление списков c-выражений
data Clash   = CExp :=: CExp deriving (Show)

type UnifRes = (Bool, [Subst])
fail :: UnifRes
fail = (False, [])

unify :: [CExp] -> [CExp]  -> UnifRes
unify ces1 ces2
      | length ces1 /= length ces2 = Unification.fail
      | otherwise                      = unify' [ ] chs
                              where chs = zipWith (:=:) ces1 ces2

unify' :: [Clash] -> [Clash] ->  UnifRes
unify' rchs [] = (True, subst)
      where subst = map (\(a:=:b) -> a :-> b) rchs
unify' rchs chs@(ch:chs') =
   case ch of
      ATOM a      :=:ATOM b | a==b -> unify' rchs chs'
      ATOM a      :=:cex           -> Unification.fail
      cvar@(CVA _):=:caex@(ATOM _) -> moveCl rchs chs
      cvar@(CVA _):=:caex@(CVA _)  -> moveCl rchs chs
      cvar@(CVA _):=:cex           -> Unification.fail
      cvar@(CVE _):=:cex           -> moveCl rchs chs
      CONS a1 b1  :=:CONS a2 b2    -> unify' rchs (p++chs')
                                      where p=[a1:=:a2,b1:=:b2]
      CONS a1 b1  :=:cex           -> Unification.fail

moveCl:: [Clash] -> [Clash] ->  UnifRes
moveCl rchs chs@(ch@(cvar:=:cexp):chs') =
      case [ y | (x:=:y)<-rchs, x==cvar ] of
            [ ]             -> unify' (ch:rchs) chs'
            [y] | y==cexp   -> unify' rchs      chs'
            [y] | otherwise -> Unification.fail

infixl 9 .*. 
-- объединение без повторов dom sa и dom sb
(.*.) :: [Subst] -> [Subst] -> [Subst]
sa .*. sb = [ cvar:->((cvar /. sa) /. sb) | cvar<-dom_sa_sb ]
            where dom_sa_sb = nub (dom sa ++ dom sb) 

unifyMoreGeneraly :: [Clash] -> Maybe [Subst]
unifyMoreGeneraly [] = Just []
unifyMoreGeneraly (eq:eqs) = 
      case eq of
            cx1 :=: cx2 | cx1 == cx2            -> unifyMoreGeneraly eqs
            v@(CVE _) :=: cx2                   -> if v `notElem` cvars cx2 then _mgu [v:->cx2] else Nothing
            cx1 :=: v@(CVE _)                   -> if v `notElem` cvars cx1 then _mgu [v:->cx1] else Nothing
            (CONS cy1 cy2) :=: (CONS cx1 cx2)   -> unifyMoreGeneraly ([cy1:=:cx1, cy2:=:cx2] ++ eqs)
            (CONS _ _) :=: _                    -> Nothing
            _ :=: (CONS _ _)                    -> Nothing
            (ATOM _) :=: (ATOM _)               -> Nothing
            v@(CVA _) :=: cx2                   -> _mgu [v :-> cx2]
            cx1 :=: v@(CVA _)                   -> _mgu [v :-> cx1]
      where _mgu s = fmap (s .*.) (unifyMoreGeneraly (eqs/.s))               
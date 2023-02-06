{-# LANGUAGE MultiParamTypeClasses, TypeSynonymInstances, FlexibleInstances, FlexibleContexts #-}
module Interpreter (CondRes(..), Clash(..), SubstApp(..), SubstUpd(..), mkCExps, int, evalAlt, evalCAlt, mkEnv, getDef, dom, cleanRestr, splitA, splitE, mkCAVar, mkCEVs) where

import Lang (Term(..), Cond(..), Func(..), Env, Var, EVal, State, Bind(..), Fname, FreeIndx, Parm, Restr(..), Split, Subst(..), Contr(..), CExp, CVar, CEnv, InEq(..), CBind, identityFree, emptyFree)
import Lib ( nub )
import Unification (Clash(..))

-- (a/.b) применить "a" к "b". Для начала, определяем, что такое применить Env к Exp
infixl 8 /.
class SubstApp a b where (/.) :: a -> b -> a
instance SubstApp Term Env where
  (ATOM a)            /. _ = ATOM a
  (CONS h t)          /. env = CONS (h/.env) (t/.env)
  var                 /. env = head [ x | (v := x) <-env, v == var ]

-- общие правила расширения: умеем x/.y => умеем [x,...]/.y
instance SubstApp a subst => SubstApp [a] subst where
    cxs /. subst = map (/.subst) cxs

instance SubstApp Clash [Subst] where
    (l:=:r) /. subst = (l /. subst) :=: (r/.subst)

-- умеем a/.y и b/.y => умеем (a,b)/.y
instance {-# OVERLAPS #-} (SubstApp a subst, SubstApp b subst) => SubstApp (a,b) subst where
    (ax,bx) /. subst = ( ax/.subst , bx/.subst )

-- и описание понятия "применить подстановку к ... "
instance SubstApp Term [Subst] where
  (ALT   cnd t1 t2)  /.s = ALT   (cnd/.s) (t1/.s) (t2/.s)
  (CALL  fn exps)    /.s = CALL  fn (exps/.s)
  (ATOM a)           /._ = ATOM a
  (CONS h t)         /.s = CONS (h/.s) (t/.s)
  cvar               /.s = if cvar `notElem` dom s 
   then cvar
   else head[cexp | (cv :-> cexp) <- s, cv==cvar ]

instance SubstApp Cond [Subst] where
  (EQA  a1 a2)   /. s = EQA  (a1/.s) (a2/.s)
  (MATCH e h t a) /. s = MATCH (e/.s) (h/.s) (t/.s) (a/.s)

instance SubstApp InEq [Subst] where
    (l:=/=:r) /. subst = (l/.subst) :=/=: (r/.subst)

instance SubstApp CBind [Subst] where
    (pvar := cexpr) /. subst = pvar := (cexpr/.subst)

instance SubstApp Restr [Subst] where
    INCONSISTENT  /. _ = INCONSISTENT
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
instance SubstUpd Env where
   binds +. binds' = nub (binds' ++ binds)
-- рестрикции можно пополнять (+.)
instance SubstUpd Restr where
  INCONSISTENT +. _            = INCONSISTENT
  _            +. INCONSISTENT = INCONSISTENT
  (RESTR r1)   +. (RESTR r2)   = cleanRestr (RESTR(r1++r2))

-- Интерпретатор TSG
-- Построение среды (и c-среды, в последущем)
mkEnv   :: [Var] -> [EVal] -> Env
mkEnv  = zipWith (:=)

-- Доступ к определению функции
getDef  :: Fname -> [Func] -> Func
getDef fn prog = head [ fd | fd@(DEF f _ _) <- prog, f == fn ]

int :: [Func] -> [EVal] -> EVal
int   prog d  = eval s prog
             where (DEF f prms _) : _ = prog
                   e = mkEnv prms d
                   s = (CALL f prms, e)

eval :: State -> [Func] -> EVal
eval  (CALL f args, e) p = eval s' p                  
                               where DEF _ prms t' = getDef f p
                                     e' = mkEnv prms (args/.e)
                                     s' = (t',e')

eval  (ALT c t1 t2, e) p = case evalAlt c e of
                                 TRUE  ue -> eval (t1,e+.ue) p
                                 FALSE ue -> eval (t2,e+.ue) p

eval  (exp, e)          _ = exp/.e

data CondRes = TRUE Env | FALSE Env deriving (Show)
evalAlt :: Cond -> Env -> CondRes
evalAlt (EQA x y)         e = let x' = x/.e; y' = y/.e in
                            case (x', y') of
                               (ATOM a, ATOM b) | a == b -> TRUE [ ]
                               (ATOM _, ATOM _)        -> FALSE[ ]

evalAlt (MATCH x vh vt va) e = let x' = x/.e in
                            case x' of
                               CONS h t          ->TRUE [vh:=h,vt:=t]
                               ATOM _            ->FALSE[va:=x']

-- Вычисление условия на c-среде (Результат: разбиение и два пополнения c-среды)
evalCAlt :: Cond -> CEnv -> FreeIndx -> (Split, CEnv, CEnv, FreeIndx)
evalCAlt (EQA x y)         ce i =
               let x' = x/.ce; y' = y/.ce in
               case (x', y') of
                  (a,     b     )| a==b -> ((identityFree, emptyFree), [],[],i)
                  (ATOM a,ATOM b)       -> ((emptyFree,  identityFree), [],[],i)
                  (CVA _, a     )       -> ( splitA x' a , [],[],i)
                  (a,     CVA _ )       -> ( splitA y' a , [],[],i)

evalCAlt (MATCH x vh vt va) ce i =
               let x' = x/.ce in
               case x' of
                  CONS h t ->((identityFree, emptyFree), [vh:=h,vt:=t],         [], i )
                  ATOM a   ->((emptyFree, identityFree), [],              [va:=x'], i )
                  CVA  _   ->((emptyFree, identityFree), [],              [va:=x'], i )
                  CVE  _   ->(  split,     [vh:=ch,vt:=ct], [va:=ca], i')
                              where 
                                 (split,i') = splitE x' i
                                 (S[_:->(CONS ch ct)], S[_:->ca]) = split

-- oсновные функции работы с рестрикциями
isContradiction, isTautology :: InEq -> Bool
isContradiction   (left   :=/=: right)  = left == right

isTautology       (ATOM a :=/=: ATOM b) = a /= b
isTautology       (_   :=/=: _)  = False

cleanRestr :: Restr -> Restr
cleanRestr  INCONSISTENT  = INCONSISTENT
cleanRestr  (RESTR ineqs) = if any isContradiction ineqs 
    then INCONSISTENT
    else RESTR (nub(filter (not.isTautology) ineqs))

-- (dom subst) и (subst1.*.subst2)
dom :: [Subst] -> [CExp]
dom subst = [ cvar | (cvar :-> _ ) <- subst ]

-- генератор списка уникальных ce-переменных заданной длины
mkCAVar, mkCEVar :: FreeIndx -> (CVar, FreeIndx)
mkCEVar i = (CVE i, i+1 )
mkCAVar i = (CVA i, i+1 )

mkCEVs::[CVar] -> Int -> FreeIndx -> ([CVar], FreeIndx) 
mkCEVs cvs 0 i = (cvs, i)                     
mkCEVs cvs n i = mkCEVs (cv:cvs) (n-1) i'        
    where (cv, i') = mkCEVar i   

splitA :: CVar -> CExp -> Split
splitA cv@(CVA _) caExp = (S[cv :-> caExp], R (RESTR[cv :=/=: caExp]))

splitE :: CVar -> FreeIndx -> (Split, FreeIndx)
splitE cv@(CVE _) i = ((S[cv :-> CONS cvh cvt], 
                      S[cv :-> cva]), i')
                      where (cvh, i1) = mkCEVar i
                            (cvt, i2) = mkCEVar i1
                            (cva, i') = mkCAVar i2

mkCExps :: [Parm] -> FreeIndx -> ([CExp], FreeIndx)
mkCExps [ ]          i = ([], i)
mkCExps (parm:parms) i = (cvar:ces, i'')
                         where
                           (cvar, i' ) = case parm of
                                         PVE _ -> mkCEVar i
                                         PVA _ -> mkCAVar i
                           (ces, i'') = mkCExps parms i'

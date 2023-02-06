{-# LANGUAGE MultiParamTypeClasses, TypeSynonymInstances, FlexibleInstances #-}
module Process  (CVars(..), ProcessTree(..), Branch, makeTree, makeTreeX, mkFreeIndex) where
import Lib ( nub )
import Lang (Term(..), Cond(..), Bind(..), Func(..), CVar, CExp, CBind, FreeIndx, Restr(..), InEq(..), Contr, Subst(..), Conf, identityFree, Set)
import Interpreter(SubstApp(..), SubstUpd(..), mkEnv, getDef, evalCAlt)

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
   cvars INCONSISTENT  = []
   cvars (RESTR ineqs) = cvars ineqs

instance (CVars a, CVars b) => CVars (a, b) where
   cvars (ax, bx)      = nub (cvars ax ++ cvars bx)

-- cvars для подстановки
instance CVars Subst where
   cvars (ax :-> bx)   = nub (cvars ax ++ cvars bx)

-- Вспомогательные функции
mkFreeIndex :: CVars a => FreeIndx -> a -> FreeIndx
mkFreeIndex i c = 1 + maximum(i: x)
               where index :: CVar -> Int
                     index (CVA i) = i
                     index (CVE i) = i
                     x = map index (cvars c)

-- Алгоритм построения дерева процессов
data ProcessTree = Leaf Conf
            | Node Conf [Branch] 
   deriving (Show)
type Branch = (Contr, ProcessTree)

makeTree :: [Func] -> Set -> ProcessTree
makeTree prog cl@(ces, r) = _eval call prog i
                      where 
                         (DEF f prms _) : _ = prog
                         ce = mkEnv prms ces
                         call  = ((CALL f prms, ce), r)
                         i  = mkFreeIndex 0 cl

_eval :: Conf -> [Func] -> FreeIndx -> ProcessTree
_eval c@((CALL f args, ce), r) prog i =
                     Node c [(identityFree, _eval c' prog i)]
                     where
                        DEF _ prms t' = getDef f prog
                        ce' = mkEnv prms (args/.ce)
                        c'  = ((t', ce'), r)

_eval c@((ALT cnd t1 t2, ce), _) prog i =
                     Node c [(cnt1, _eval c1' prog i'), (cnt2, _eval c2' prog i')]
                     where
                        ((cnt1, cnt2), uce1, uce2, i') = evalCAlt cnd ce i
                        ((_,ce1), r1) = c/.cnt1
                        c1' = ((t1, ce1 +. uce1), r1)
                        ((_, ce2), r2) = c/.cnt2
                        c2' = ((t2, ce2 +. uce2), r2)

_eval c@((_, _), _) _ _ = Leaf c

-- Алгоритм построения дерева процессов с отсечением сухих поддеревьев
makeTreeX :: [Func] -> Set -> ProcessTree
makeTreeX   p cl = Node c (cutTree brs)
              where 
                  tree       = makeTree p cl
                  Node c brs = tree

cutTree :: [Branch] -> [Branch]
cutTree [ ]                = [ ]
cutTree (b@(cnt, tree) : bs)   =
         case tree of
            Leaf (_, INCONSISTENT)   -> cutTree bs
            Node (_, INCONSISTENT) _ -> cutTree bs
            Leaf _                   -> b :cutTree bs
            Node c               bs' -> b':cutTree bs
                     where tree' = Node c (cutTree bs')
                           b'    = (cnt, tree')
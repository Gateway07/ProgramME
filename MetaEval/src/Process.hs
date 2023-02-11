{-# LANGUAGE MultiParamTypeClasses, TypeSynonymInstances, FlexibleInstances #-}
module Process  (ProcessTree(..), Branch, makeTree, makeTreeX, mkFreeIndex) where
import Lang (Term(..), Func(..), CVar, FreeIndx, Restr(..), Contr, Conf, identityFree, Set)
import Unification (CVars(..), SubstApp(..), SubstUpd(..), )
import Interpreter(mkEnv, getDef, evalCAlt)

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
      call = ((CALL f prms, ce), r)
      i = mkFreeIndex 0 cl

_eval :: Conf -> [Func] -> FreeIndx -> ProcessTree
_eval c@((CALL f args, ce), r) prog i =
   Node c [(identityFree, _eval c' prog i)]
      where
         DEF _ prms t' = getDef f prog
         ce' = mkEnv prms (args/.ce)
         c'  = ((t', ce'), r)

_eval c@((ALT cnd term1 term2, ce), _) prog i =
   Node c [
      (cnt1, _eval c1' prog i'), 
      (cnt2, _eval c2' prog i')]
      where
         ((cnt1, cnt2), updCE1, updCE2, i') = evalCAlt cnd ce i
         ((_, ce1), r1) = c/.cnt1
         c1' = ((term1, ce1 +. updCE1), r1)
         ((_, ce2), r2) = c/.cnt2
         c2' = ((term2, ce2 +. updCE2), r2)

_eval c@((_, _), _) _ _ = Leaf c

-- Алгоритм построения дерева процессов с отсечением сухих поддеревьев
makeTreeX :: [Func] -> Set -> ProcessTree
makeTreeX p cl = Node c (_cutTree branches)
   where 
      tree = makeTree p cl
      Node c branches = tree

_cutTree :: [Branch] -> [Branch]
_cutTree [ ]                = [ ]
_cutTree (branch@(cnt, tree) : bs)   =
   case tree of
      Leaf (_, INCONSISTENT _)   -> _cutTree bs
      Node (_, INCONSISTENT _) _ -> _cutTree bs
      Leaf _                     -> branch :_cutTree bs
      Node c               bs'   -> b':_cutTree bs
         where tree' = Node c (_cutTree bs')
               b'    = (cnt, tree')
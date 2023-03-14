{-# LANGUAGE MultiParamTypeClasses, TypeSynonymInstances, FlexibleInstances #-}
module Solver (invertToSRs, invertToSets, makeTable, invertToSRsSym) where

import Lang (Func(..), EVal, CExp, Restr(..), Subst(..), Set, IOClass)
import Process (ProcessTree(..), Branch, makeTreeX)
import Unification (SubstApp(..), unify, intersect) 

-- Универсальный решающий алгоритм 
type TreeLevel = [(Set, ProcessTree)]

-- Приведение программы к табличной форме
makeTable :: [Func] -> Set -> [(Set, CExp)]
makeTable  p x = _evalTab [(x, tree)] [ ]
           where tree = makeTreeX p x

_evalTab :: TreeLevel -> TreeLevel ->  [(Set, CExp)]
_evalTab ((xi, Leaf c):level1) level2 = (xi, cex):_evalTab level1 level2
                                 where ((expr, ce),_) = c
                                       cex = expr/.ce
_evalTab ((xi, Node _ branches):lv1) lv2 = _evalTab lv1 lv2'
                                 where lv2' = _evalBranch xi branches lv2
_evalTab [ ] [ ] = [ ]
_evalTab [ ] lv2 = _evalTab lv2 [ ]

_evalBranch :: Set -> [Branch] -> TreeLevel -> TreeLevel
_evalBranch xi ((cnt,tree):bs) lv = _evalBranch xi bs ((xi/.cnt, tree):lv)
_evalBranch _ [ ]              lv = lv

-- Перечисляет подклассы (где [x1, x2... ]) xi класса x, на которых вычисление p приводит к результату y: p <xi> = {y}
invertToSets :: [Func] -> Set -> EVal -> [Set]
invertToSets p x y = filterTableByUnify (makeTable p x) y

-- Отвечает на запрос инверсного вычисления
filterTableByUnify :: [(Set, CExp)] -> EVal -> [Set]
filterTableByUnify ((xi, cex) : tabTail) y = 
    case unify [cex] [y] of
        (False, _) ->                        other
        (True,  s) -> case subXi of
                        (_, INCONSISTENT _) -> other
                        _                 -> subXi:other
                        where subXi = xi/.s
    where other = filterTableByUnify tabTail y

filterTableByUnify [ ]               _ = [ ]

-- Сужение, приводящее класс к подклассу:
_subClassCntr :: Set -> Set -> ([Subst], Restr)
_subClassCntr (cesx1, rx1) (cesx2, rx2) = (s, r)
    where
        (True, s) = unify cesx1 cesx2
        r = case rx2 of
            INCONSISTENT ineqs' -> INCONSISTENT ineqs'
            RESTR ineqs'-> RESTR[ ineq | ineq <- ineqs', not(ineq `elem` ineqs)]
                where RESTR ineqs = rx1/.s

-- Перечисляет ([(s1,r1), (s2,r2)... ]) значения c-переменных из x, при которых вычисление p приводит к результату y: p <x/.(S si)/.(R ri)>={y}
invertToSRs :: [Func] -> Set -> EVal -> [([Subst], Restr)]
invertToSRs p x y = map altRepr (invertToSets p x y)
    where 
        altRepr :: Set -> ([Subst], Restr)
        altRepr xi = _subClassCntr x xi

-- sura (Симметричный УРА)
invertToSRsSym :: [Func] -> IOClass -> [([Subst], Restr)]
invertToSRsSym p ((cxs, cy), rs) =
    concatMap f (makeTable p cin)
        where
            cin = (cxs, rs)
            f ((cxs', rs'), cy') = (cy:cxs, rs) `intersect` (cy':cxs', rs')
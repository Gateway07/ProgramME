{-# LANGUAGE MultiParamTypeClasses, TypeSynonymInstances, FlexibleInstances #-}
module Solver (ura, ura') where

import Lang (Func(..), EVal, CExp, Restr(..), Subst(..), Set)
import Interpreter(SubstApp(..))
import Process (ProcessTree(..), Branch, makeTreeX)
import Unification (unify) 

-- Универсальный решающий алгоритм 
type TLevel = [(Set, ProcessTree)]
type Tab    = [(Set, CExp)]

-- Приведение программы к табличной форме
tab :: [Func] -> Set -> Tab
tab  p x = _evalTab [ (x, tree) ] [ ]
           where tree = makeTreeX p x

_evalTab :: TLevel -> TLevel ->   Tab
_evalTab ((xi, Leaf c):lv1)    lv2 = (xi, cex):_evalTab lv1 lv2
                                 where ((exp, ce),_) = c
                                       cex = exp/.ce

_evalTab ((xi, Node _ bs):lv1) lv2 = _evalTab lv1 lv2'
                                 where lv2' = _tabB xi bs lv2

_evalTab [ ]                   [ ] = [ ]
_evalTab [ ]                   lv2 = _evalTab lv2 [ ]

_tabB :: Set -> [Branch] -> TLevel -> TLevel
_tabB xi ((cnt,tree):bs) lv = _tabB xi bs ((xi/.cnt, tree):lv)
_tabB _ [ ]              lv = lv

-- Универсальный Решающий Алгоритм [x1,x2... ]
ura' :: [Func] -> Set -> EVal -> [Set]
ura' p x y = urac (tab p x) y

urac :: Tab -> EVal -> [Set]
urac ((xi, cex):ptab') y = 
            case unify [cex] [y] of
              (False, _) ->                        tail
              (True,  s) -> case xi' of
                              (_, INCONSISTENT) -> tail
                              _                 -> xi':tail
                            where xi' = xi/.s
            where tail = urac ptab' y

urac [ ]               _ = [ ]

-- Сужение, приводящее класс к подклассу:
_subClassCntr :: Set -> Set -> ([Subst], Restr)
_subClassCntr (cesx, rx) (cesx', rx') = (s, r)
  where
    (True, s) = unify cesx cesx'
    r = case rx' of
          INCONSISTENT->INCONSISTENT
          RESTR ineqs'->RESTR[ ineq | ineq <- ineqs', not(ineq `elem` ineqs)]
                        where RESTR ineqs = rx/.s

-- Универсальный Решающий Алгоритм  [(s1,r1), (s2,r2)... ]
ura :: [Func] -> Set -> EVal  ->  [([Subst], Restr)]
ura p x y = map altRepr (ura' p x y)
            where 
               altRepr:: Set -> ([Subst], Restr)
               altRepr xi = _subClassCntr x xi
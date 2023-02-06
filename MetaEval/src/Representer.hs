{-# LANGUAGE MultiParamTypeClasses, TypeSynonymInstances, FlexibleInstances #-}
module Representer (Restr(..), (.*.), isElem, ura, ura', unifyCVars, decompose) where

import Lib ( nub )
import Lang (Term(..), Func(..), EVal, CVar, CExp, FreeIndx, Restr(..), InEq(..), Contr, Subst(..), Set)
import Interpreter(SubstApp(..), Clash(..), dom, cleanRestr, splitA, splitE, mkCEVs)
import Process (CVars(..), ProcessTree(..), Branch, mkFreeIndex, makeTreeX)
import Unification (unify) 

infixl 9 .*. 
-- объединение без повторов dom sa и dom sb
(.*.) :: [Subst] -> [Subst] -> [Subst]
sa .*. sb = [ cvar:->((cvar/.sa)/.sb) | cvar<-dom_sa_sb ]
            where dom_sa_sb = nub (dom sa ++ dom sb) 

-- Декомпозиция окрестности
decompose :: Set -> [EVal] -> [EVal] -> (Set, Set)
decompose o12 d1 d2 = (o1, o2)
          where 
            l1 = length d1; l2 = length d2
            i = mkFreeIndex 0 o12
            (ces1, i1) = mkCEVs [] l1 i
            (ces2, _) = mkCEVs [] l2 i1
            c1 = (ces1 ++ d2, RESTR[])
            c2 = (d1 ++ ces2, RESTR[])
            (_, (ces_1, r1):_) = unifyCVars c1 o12       -- c1*o12
            (_, (ces_2, r2):_) = unifyCVars c2 o12       -- c2*o12

            o1 = ( take l1 ces_1, r1 )            -- взяли первые L1
            o2 = ( drop l1 ces_2, r2 )            -- откинули первые L1

-- Пересечение и разность классов и окрестностей
type UnifCRes = ([Subst], [Set])

unifyCVars :: Set -> Set -> UnifCRes
unifyCVars ca@(aces, ar) cb@(bces,br)
    | length aces/=length bces = _noSol  (bces,cleanRestr br)
    | otherwise =    _solve  [] chs (cleanRestr ar) cb' [] va i cb'
                     where chs = zipWith (:=:) aces bces
                           va  = cvars aces
                           cb' = (bces, cleanRestr br)
                           i   = mkFreeIndex (mkFreeIndex 0 ca) cb

_solve :: [Clash] -> [Clash] -> Restr -> Set -> [Set] -> [CVar] -> FreeIndx -> Set -> UnifCRes
_solve sc uc ur      (_,INCONSISTENT) cs va i cb = _noSol cb      --1
_solve sc uc ur@INCONSISTENT          c cs va i cb = _noSol cb      --2

_solve sc uc@(ch:uc') ur              c cs va i cb = case ch of    --3
    x         :=: y   | x==y -> _solve sc uc' ur c cs va i cb       --3.1
    ATOM _    :=: ATOM _     -> _noSol cb                           --3.2
    v@(CVE  _):=: y          -> _moveC sc uc ur c cs va i cb        --3.3
    CONS a b  :=: CONS x y   -> _solve sc uc'' ur c cs va i cb      --3.4
                               where uc''=[a:=:x, b:=:y]++uc'
    CONS a b  :=: cve@(CVE _)-> _spltP c1 c2 sc uc ur c cs va i' cb --3.5
                               where ((c1,c2), i') = splitE cve i
    CONS a b  :=:_          -> _noSol cb                           --3.6
    _         :=: CONS _ _   -> _noSol cb                           --3.7
    caexp     :=: cve@(CVE _)-> _spltP c2 c1 sc uc ur c cs va i' cb --3.8
                               where ((c1, c2), i') = splitE cve i
    v@(CVA _) :=:caexp | v `elem` va ->                           --3.9
                               _moveC sc uc ur c cs va i cb
    v@(CVA _) :=: caexp | otherwise   ->                           --3.10
                               _spltP c1 c2 sc uc ur c cs va i cb
                               where (c1, c2) = splitA v caexp
    a@(ATOM _) :=: v@(CVA _)  -> _spltP c1 c2 sc uc ur c cs va i cb  --3.11
                               where (c1, c2) = splitA v a

_solve sc [ ] (RESTR(ineq:ur')) c@(_,RESTR rb) cs va i cb          --4
         | ineq `elem` rb = _solve sc [ ] (RESTR ur') c cs va i cb
         | otherwise      = _spltP c2 c1 sc [] (RESTR ur') c cs va i cb
                            where (p,ca)=case ineq of
                                    x@(CVA _) :=/=: y         -> (x,y)
                                    y         :=/=: x@(CVA _) -> (x,y)
                                  (c1,c2)=splitA p ca
_solve sc [ ] (RESTR []) c cs _ _ _ = (subst,c:cs )            --5
                                 where subst = map (\(x:=:y) -> x :-> y) sc

_noSol :: Set -> UnifCRes
_noSol cb@(ces, _) = ([ ], [cb',cb''])
                    where cb'  = (ces, INCONSISTENT) --cb' =cb/.emptC
                          cb'' = cb                 --cb''=cb/.idC

_spltP :: Contr -> Contr -> [Clash] -> [Clash] -> Restr -> Set -> [Set] -> [CVar] -> FreeIndx -> Set -> UnifCRes
_spltP c1 c2 sc uc ur c cs va i cb = 
                            _solve sc' uc' ur' c' cs' va i cb
                            where c' =c/.c1; c''=c/.c2
                                  ((sc',uc'),ur') = ((sc,uc),ur)/.c1
                                  cs'=case c'' of
                                        (_,INCONSISTENT) -> cs
                                        _                -> c'':cs

_moveC :: [Clash] -> [Clash] -> Restr -> Set -> [Set] -> [CVar] -> FreeIndx -> Set -> UnifCRes
_moveC sc ((v:=:x):uc) ur c cs va i cb = 
                                  _solve sc' uc' ur' c cs va i cb
                                  where sc'= (v:=:x):sc
                                        (uc',ur') = (uc,ur)/.[v:->x]

-- isElem (Принадлежность данного классу)
isElem :: [EVal] -> Set -> Bool
isElem d (ces, r) = case  (b,    r') of
                          (True, RESTR[]) -> True
                          (_   ,    _   ) -> False
                    where (b, s) = unify ces d
                          r'    = r/.s

-- Универсальный решающий алгоритм 
-- tab (Приведение программы к табличной форме)  
type TLevel = [(Set, ProcessTree)]
type Tab    = [(Set, CExp)]

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
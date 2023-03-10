{-# LANGUAGE MultiParamTypeClasses, TypeSynonymInstances, FlexibleInstances #-}
module Representer (Restr(..), isElem, unifyCVars, decompose) where

import Lang (Term(..), EVal, CVar, FreeIndx, Restr(..), InEq(..), Contr, Subst(..), Set)
import Interpreter(Clash(..), splitCVA, makeCEVs, splitCVE)
import Unification (CVars(..), SubstApp(..), cleanRestr, unify, cvars, makeFreeIndex) 

-- Декомпозиция окрестности
decompose :: Set -> [EVal] -> [EVal] -> (Set, Set)
decompose o12 d1 d2 = (o1, o2)
          where 
            l1 = length d1; l2 = length d2
            i = makeFreeIndex 0 o12
            (ces1, i1) = makeCEVs [] l1 i
            (ces2, _) = makeCEVs [] l2 i1
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
                              i   = makeFreeIndex (makeFreeIndex 0 ca) cb

_solve :: [Clash] -> [Clash] -> Restr -> Set -> [Set] -> [CVar] -> FreeIndx -> Set -> UnifCRes
_solve _ _ _      (_, INCONSISTENT _) _ _ _ cb = _noSol cb      --1
_solve _ _ (INCONSISTENT _)         _ _ _ _ cb = _noSol cb      --2

_solve sc uc@(ch:uc') ur              c cs va i cb = case ch of    --3
    x         :=: y   | x==y -> _solve sc uc' ur c cs va i cb       --3.1
    ATOM _    :=: ATOM _     -> _noSol cb                           --3.2
    (CVE  _) :=: _          -> _moveC sc uc ur c cs va i cb        --3.3
    CONS a b  :=: CONS x y   -> _solve sc uc'' ur c cs va i cb      --3.4
                               where uc''=[a:=:x, b:=:y]++uc'
    CONS _ _  :=: cve@(CVE _)-> _spltP c1 c2 sc uc ur c cs va i' cb --3.5
                               where ((c1,c2), i') = splitCVE cve i
    CONS _ _  :=:_          -> _noSol cb                           --3.6
    _         :=: CONS _ _   -> _noSol cb                           --3.7
    _     :=: cve@(CVE _)-> _spltP c2 c1 sc uc ur c cs va i' cb --3.8
                               where ((c1, c2), i') = splitCVE cve i
    v@(CVA _) :=: _ | v `elem` va ->                           --3.9
                               _moveC sc uc ur c cs va i cb
    v@(CVA _) :=: caexp | otherwise   ->                           --3.10
                               _spltP c1 c2 sc uc ur c cs va i cb
                               where (c1, c2) = splitCVA v caexp
    a@(ATOM _) :=: v@(CVA _)  -> _spltP c1 c2 sc uc ur c cs va i cb  --3.11
                               where (c1, c2) = splitCVA v a

_solve sc [ ] (RESTR(ineq:ur')) c@(_,RESTR rb) cs va i cb          --4
         | ineq `elem` rb = _solve sc [ ] (RESTR ur') c cs va i cb
         | otherwise      = _spltP c2 c1 sc [] (RESTR ur') c cs va i cb
                            where (p,ca)=case ineq of
                                    x@(CVA _) :=/=: y         -> (x,y)
                                    y         :=/=: x@(CVA _) -> (x,y)
                                  (c1,c2)=splitCVA p ca
_solve sc [ ] (RESTR []) c cs _ _ _ = (subst,c:cs )            --5
                                 where subst = map (\(x:=:y) -> x :-> y) sc

_noSol :: Set -> UnifCRes
_noSol cb@(ces, _) = ([ ], [cb', cb''])
                    where cb'  = (ces, INCONSISTENT []) --cb' =cb/.emptC
                          cb'' = cb                 --cb''=cb/.idC

_spltP :: Contr -> Contr -> [Clash] -> [Clash] -> Restr -> Set -> [Set] -> [CVar] -> FreeIndx -> Set -> UnifCRes
_spltP c1 c2 sc uc ur c cs va i cb = 
                            _solve sc' uc' ur' c' cs' va i cb
                            where c' =c/.c1; c''=c/.c2
                                  ((sc',uc'),ur') = ((sc,uc),ur)/.c1
                                  cs'=case c'' of
                                        (_, INCONSISTENT _) -> cs
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
{-# LANGUAGE MultiParamTypeClasses, TypeSynonymInstances, FlexibleInstances, FlexibleContexts #-}
module Unification (Clash(..), unify, unify') where

import Lang (Term(..), Subst(..), CExp)

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
unify' rchs []            = (True, subst)
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
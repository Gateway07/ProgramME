{-# LANGUAGE MultiParamTypeClasses, TypeSynonymInstances, FlexibleInstances, FlexibleContexts #-}
module Interpreter (CondRes(..), Clash(..), mkCExps, interpret, evalAlt, evalCAlt, mkEnv, getDef, splitA, splitE, mkCAVar, mkCEVs) where

import Lang (Term(..), Cond(..), Func(..), Var, EVal, State, Bind(..), Fname, FreeIndx, Parm, Restr(..), Split, Subst(..), Contr(..), CExp, CVar, CEnv, InEq(..), identityFree, emptyFree)
import Unification (SubstApp(..), SubstUpd(..), Clash(..))
-- Интерпретатор TSG
-- Построение среды (и c-среды, в последущем)
mkEnv   :: [Var] -> [EVal] -> [Bind]
mkEnv  = zipWith (:=)

-- Доступ к определению функции
getDef  :: Fname -> [Func] -> Func
getDef fn prog = head [ fd | fd@(DEF f _ _) <- prog, f == fn ]

interpret :: [Func] -> [EVal] -> EVal
interpret   prog d  = _eval s prog
             where (DEF f prms _) : _ = prog
                   e = mkEnv prms d
                   s = (CALL f prms, e)

_eval :: State -> [Func] -> EVal
_eval  (CALL f args, e) p = _eval s' p                  
                               where DEF _ prms t' = getDef f p
                                     e' = mkEnv prms (args/.e)
                                     s' = (t',e')
_eval  (ALT c t1 t2, e) p = case evalAlt c e of
                                 TRUE  ue -> _eval (t1, e+.ue) p
                                 FALSE ue -> _eval (t2, e+.ue) p
_eval  (exp, e)          _ = exp/.e

data CondRes = TRUE [Bind] 
  | FALSE [Bind] 
    deriving (Show)

evalAlt :: Cond -> [Bind] -> CondRes
evalAlt (EQA x y) e = let x' = x/.e; y' = y/.e in
  case (x', y') of
    (ATOM a, ATOM b) | a == b -> TRUE []
    (_, _)        -> FALSE []

evalAlt (MATCH x vh vt va) e = 
  let x' = x/.e in
  case x' of
    CONS h t          -> TRUE [vh := h, vt := t]
    ATOM _            -> FALSE[va := x']

-- Вычисление условия на c-среде (Результат: разбиение и два пополнения c-среды)
evalCAlt :: Cond -> CEnv -> FreeIndx -> (Split, CEnv, CEnv, FreeIndx)
evalCAlt (EQA x y)         ce i =
  let x' = x/.ce; y' = y/.ce in
  case (x', y') of
    (a,      b     ) | a==b -> ((identityFree, emptyFree), [], [], i)
    (ATOM _, ATOM _)        -> ((emptyFree,  identityFree), [], [], i)
    (CVA _,  a     )        -> ( splitA x' a , [], [], i)
    (a,      CVA _ )        -> ( splitA y' a , [], [], i)

evalCAlt (MATCH x vh vt va) ce i =
  let x' = x/.ce in
  case x' of
    CONS h t -> ((identityFree, emptyFree), [vh:=h, vt:=t],         [], i)
    ATOM _   -> ((emptyFree, identityFree), [],              [va:=x'], i)
    CVA  _   -> ((emptyFree, identityFree), [],              [va:=x'], i)
    CVE  _   -> (  split,     [vh:=ch, vt:=ct], [va:=ca], i')
                              where 
                                 (split, i') = splitE x' i
                                 (S[_ :-> (CONS ch ct)], S[_ :-> ca]) = split
    PVA _     -> ((emptyFree, identityFree), [],              [va:=x'], i )
    PVE _     -> (  split,     [vh:=ch, vt:=ct], [va:=ca], i')
                              where 
                                 (split, i') = splitE x' i
                                 (S[_ :-> (CONS ch ct)], S[_ :-> ca]) = split

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
splitE cv@(PVE _) i = ((S[cv :-> CONS cvh cvt], 
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

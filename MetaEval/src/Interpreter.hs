{-# LANGUAGE MultiParamTypeClasses, TypeSynonymInstances, FlexibleInstances, FlexibleContexts #-}
module Interpreter (CondRes(..), Clash(..), makeCExps, interpret, evalAlt, evalCAlt, makeEnv, getDef, splitCVA, splitCVE, makeCAVar, makeCEVs) where

import Lang (Term(..), Cond(..), Func(..), Var, EVal, State, Bind(..), Fname, FreeIndx, Parm, Restr(..), Split, Subst(..), Contr(..), CExp, CVar, CEnv, InEq(..), identityFree, emptyFree)
import Unification (SubstApp(..), SubstUpd(..), Clash(..))
-- Интерпретатор TSG
-- Построение среды (и c-среды, в последущем)
makeEnv   :: [Var] -> [EVal] -> [Bind]
makeEnv  = zipWith (:=)

-- Доступ к определению функции
getDef  :: Fname -> [Func] -> Func
getDef fn prog = head [ fd | fd@(DEF f _ _) <- prog, f == fn ]

interpret :: [Func] -> [EVal] -> EVal
interpret   prog d  = _eval s prog
             where (DEF f prms _) : _ = prog
                   e = makeEnv prms d
                   s = (CALL f prms, e)

_eval :: State -> [Func] -> EVal
_eval  (CALL f args, e) p = _eval s' p                  
                               where DEF _ prms t' = getDef f p
                                     e' = makeEnv prms (args/.e)
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
    (CVA _,  a     )        -> ( splitCVA x' a , [], [], i)
    (a,      CVA _ )        -> ( splitCVA y' a , [], [], i)

evalCAlt (MATCH x vh vt va) ce i =
  let x' = x/.ce in
  case x' of
    CONS h t -> ((identityFree, emptyFree), [vh:=h, vt:=t],         [], i)
    ATOM _   -> ((emptyFree, identityFree), [],              [va:=x'], i)
    CVA  _   -> ((emptyFree, identityFree), [],              [va:=x'], i)
    CVE  _   -> (  split,     [vh:=ch, vt:=ct], [va:=ca], i')
                              where 
                                 (split, i') = splitCVE x' i
                                 (S[_ :-> (CONS ch ct)], S[_ :-> ca]) = split
    PVA _     -> ((emptyFree, identityFree), [],              [va:=x'], i )
    PVE _     -> (  split,     [vh:=ch, vt:=ct], [va:=ca], i')
                              where 
                                 (split, i') = splitCVE x' i
                                 (S[_ :-> (CONS ch ct)], S[_ :-> ca]) = split

-- генератор списка уникальных ce-переменных заданной длины
makeCAVar, makeCEVar :: FreeIndx -> (CVar, FreeIndx)
makeCEVar i = (CVE i, i+1 )
makeCAVar i = (CVA i, i+1 )

makeCEVs::[CVar] -> Int -> FreeIndx -> ([CVar], FreeIndx) 
makeCEVs cvs 0 i = (cvs, i)                     
makeCEVs cvs n i = makeCEVs (cv:cvs) (n-1) i'        
    where (cv, i') = makeCEVar i   

splitCVA :: CVar -> CExp -> Split
splitCVA cv@(CVA _) caExp = (S[cv :-> caExp], R (RESTR[cv :=/=: caExp]))

splitCVE :: CVar -> FreeIndx -> (Split, FreeIndx)
splitCVE cv@(CVE _) i = ((S[cv :-> CONS cvh cvt], 
                      S[cv :-> cva]), i')
                      where (cvh, i1) = makeCEVar i
                            (cvt, i2) = makeCEVar i1
                            (cva, i') = makeCAVar i2
splitCVE cv@(PVE _) i = ((S[cv :-> CONS cvh cvt], 
                      S[cv :-> cva]), i')
                      where (cvh, i1) = makeCEVar i
                            (cvt, i2) = makeCEVar i1
                            (cva, i') = makeCAVar i2
                            
makeCExps :: [Parm] -> FreeIndx -> ([CExp], FreeIndx)
makeCExps [ ]          i = ([], i)
makeCExps (parm:parms) i = (cvar:ces, i'')
                         where
                           (cvar, i' ) = case parm of
                                         PVE _ -> makeCEVar i
                                         PVA _ -> makeCAVar i
                           (ces, i'') = makeCExps parms i'

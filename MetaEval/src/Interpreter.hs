{-# LANGUAGE MultiParamTypeClasses, TypeSynonymInstances, FlexibleInstances, FlexibleContexts #-}
module Interpreter (CondRes(..), Clash(..), makeCExps, interpret, evalAlt, evalCAlt, makeEnv, getDef, splitCVA, splitCVE, makeCAVar, makeCEVs) where

import Lang (Term(..), Cond(..), Func(..), Var, EVal, State, Bind(..), Fname, FreeIndx, Parm, Restr(..), Subst(..), Contr(..), CExp, CVar, InEq(..), identityFree, emptyFree)
import Unification (SubstApp(..), SubstUpd(..), Clash(..))
-- Интерпретатор TSG
-- Построение среды (и c-среды, в последущем)
makeEnv   :: [Var] -> [EVal] -> [Bind]
makeEnv  = zipWith (:=)

-- Доступ к определению функции
getDef  :: Fname -> [Func] -> Func
getDef fn prog = head [ fd | fd@(DEF f _ _) <- prog, f == fn ]

interpret :: [Func] -> [EVal] -> EVal
interpret   prog d  = _eval start prog
    where 
        (DEF f prms _) : _ = prog
        e = makeEnv prms d          -- входные параметры связываются с данными
        start = (CALL f prms, e)    -- строиться стартовое состояние

_eval :: State -> [Func] -> EVal
_eval  (CALL f args, env) p = _eval state p                  
    where 
        DEF _ prms t' = getDef f p
        newEnv = makeEnv prms (args /. env)
        state = (t', newEnv)
_eval  (ALT c t1 t2, env) p = 
    case evalAlt c env of
        TRUE  altEnv -> _eval (t1, env +. altEnv) p
        FALSE altEnv -> _eval (t2, env +. altEnv) p
_eval  (expr, env)        _ = expr /. env

data CondRes = TRUE [Bind] 
  | FALSE [Bind] 
    deriving (Show)

evalAlt :: Cond -> [Bind] -> CondRes
evalAlt (EQA x y) env = 
    let x' = x /. env; y' = y /. env in
    case (x', y') of
        (ATOM a, ATOM b) | a == b   -> TRUE []
        (_, _)                      -> FALSE []
evalAlt (MATCH x yh yt ya) env = 
  let x' = x /. env in
  case x' of
    CONS h t          -> TRUE [yh := h, yt := t]
    ATOM _            -> FALSE[ya := x']

-- Вычисление условия на c-среде (Результат: разбиение и два пополнения c-среды)
evalCAlt :: Cond -> [Bind] -> FreeIndx -> ((Contr, Contr), [Bind], [Bind], FreeIndx)
evalCAlt (EQA x y) env i =
  let x' = x /. env; y' = y /. env in
  case (x', y') of
    (a,      b     ) | a == b   -> ((identityFree, emptyFree), [], [], i)
    (ATOM _, ATOM _)            -> ((emptyFree,  identityFree), [], [], i)
    (CVA _,  a     )            -> ( splitCVA x' a , [], [], i)
    (a,      CVA _ )            -> ( splitCVA y' a , [], [], i)

evalCAlt (MATCH x vh vt va) ce i =
  let x' = x/.ce in
  case x' of
    CONS h t -> ((identityFree, emptyFree), [vh := h, vt := t],        [], i)
    ATOM _   -> ((emptyFree, identityFree), [],              [va := x'], i)
    CVA  _   -> ((emptyFree, identityFree), [],              [va := x'], i)
    CVE  _   -> (  split,     [vh := ch, vt := ct], [va := ca], i')
                              where 
                                 (split, i') = splitCVE x' i
                                 (S[_ :-> (CONS ch ct)], S[_ :-> ca]) = split
    PVA _     -> ((emptyFree, identityFree), [],              [va := x'], i )
    PVE _     -> (  split,     [vh := ch, vt := ct], [va := ca], i')
                              where 
                                 (split, i') = splitCVE x' i
                                 (S[_ :-> (CONS ch ct)], S[_ :-> ca]) = split

-- Формирует рабиение 3 и 4 рода (см. Lang 79-80 lines)
splitCVA :: CVar -> CExp -> (Contr, Contr)
splitCVA cv@(CVA _) caExp = (S [cv :-> caExp], R (RESTR [cv :=/=: caExp]))

-- Формирует рабиение 2 рода (см. Lang 78 line)
splitCVE :: CVar -> FreeIndx -> ((Contr, Contr), FreeIndx)
splitCVE cv@(CVE _) i = ((S [cv :-> CONS cvh cvt], S [cv :-> cva]), i3)
    where 
        (cvh, i1) = makeCEVar i
        (cvt, i2) = makeCEVar i1
        (cva, i3) = makeCAVar i2
splitCVE cv@(PVE _) i = ((S [cv :-> CONS cvh cvt], S [cv :-> cva]), i3)
    where 
        (cvh, i1) = makeCEVar i
        (cvt, i2) = makeCEVar i1
        (cva, i3) = makeCAVar i2

-- генератор списка уникальных ce-переменных заданной длины
makeCAVar, makeCEVar :: FreeIndx -> (CVar, FreeIndx)
makeCEVar i = (CVE i, i + 1)
makeCAVar i = (CVA i, i + 1)

makeCEVs::[CVar] -> Int -> FreeIndx -> ([CVar], FreeIndx) 
makeCEVs cvs 0 i = (cvs, i)                     
makeCEVs cvs n i = makeCEVs (cv:cvs) (n-1) i'        
    where (cv, i') = makeCEVar i   
                            
makeCExps :: [Parm] -> FreeIndx -> ([CExp], FreeIndx)
makeCExps [ ]          i = ([], i)
makeCExps (parm:params) i = (cvar:ces, i2)
    where
        (cvar, i1 ) = case parm of
                        PVE _ -> makeCEVar i
                        PVA _ -> makeCAVar i
        (ces, i2) = makeCExps params i1
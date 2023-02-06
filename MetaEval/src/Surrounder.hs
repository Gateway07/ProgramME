{-# LANGUAGE MultiParamTypeClasses, TypeSynonymInstances, FlexibleInstances, FlexibleContexts #-}
module Surrounder (surround, idC, evalCAlt) where
import Lang (Term(..), Cond(..), Func(..), Env, EVal, Bind(..), Set, CEnv, FreeIndx, Restr(..), Split, Subst(..), Contr(..), CExp)
import Interpreter (SubstApp(..), SubstUpd(..), CondRes(..), mkCExps, mkEnv, getDef, evalAlt, splitA, splitE)
import Unification (unify) 

-- Окрестностный анализатор (surroundings)
surround :: [Func] -> [EVal] -> (EVal, Set)
surround p d =  eval (CALL f prms) e ce (RESTR[]) ces p i
           where (DEF f prms _) : p' = p
                 (ces, i) = mkCExps prms 1
                 e        = mkEnv prms d
                 ce       = mkEnv prms ces

eval :: Term -> Env -> CEnv -> Restr -> [CExp] -> [Func] -> FreeIndx -> (EVal, Set)
eval (CALL f args) e ce r ces p i =
         eval t e' ce' r ces p i
         where
            DEF _ prms t = getDef f p
            e'  = mkEnv prms (args/.e)
            ce' = mkEnv prms (args/.ce)

eval (ALT c t1 t2) e ce r ces p i =
         case evalAlt c e of
            TRUE  ue  -> eval t1 (e +. ue) ce1' r1 ces1 p i'
            FALSE ue  -> eval t2 (e +. ue) ce2' r2 ces2 p i'
         where
            ((cnt1,cnt2), uce1, uce2, i') = evalCAlt c ce i
            ((ce1,ces1),r1) =((ce,ces),r) /. cnt1
            ce1' =ce1 +. uce1
            ((ce2,ces2),r2) =((ce,ces),r) /. cnt2
            ce2' =ce2 +. uce2

eval exp e ce r ces p i =
         (res, (ces, r) /. subst)
         where
            res  =exp/.e
            (True, subst) = unify [exp/.ce] [res]

-- Два 'особых' сужения:
idC, emptC :: Contr
idC   = S []
emptC = R INCONSISTENT

-- Вычисление условия на c-среде (Результат: разбиение и два пополнения c-среды)
evalCAlt :: Cond -> CEnv -> FreeIndx -> (Split, CEnv, CEnv, FreeIndx)
evalCAlt (EQA x y)         ce i =
               let x' = x/.ce; y' = y/.ce in
               case (x', y') of
                  (a,     b     )|a==b->((idC  ,emptC), [],[],i)
                  (ATOM a,ATOM b)     ->((emptC,  idC), [],[],i)
                  (CVA _, a     )     ->( splitA x' a , [],[],i)
                  (a,     CVA _ )     ->( splitA y' a , [],[],i)

evalCAlt (MATCH x vh vt va) ce i =
               let x' = x/.ce in
               case x' of
                  CONS h t ->((idC,emptC), [vh:=h,vt:=t],         [], i )
                  ATOM a   ->((emptC,idC), [],              [va:=x'], i )
                  CVA  _   ->((emptC,idC), [],              [va:=x'], i )
                  CVE  _   ->(  split,     [vh:=ch,vt:=ct], [va:=ca], i')
                              where 
                                 (split,i') = splitE x' i
                                 (S[_:->(CONS ch ct)], S[_:->ca]) = split
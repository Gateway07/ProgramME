{-# LANGUAGE MultiParamTypeClasses, TypeSynonymInstances, FlexibleInstances, FlexibleContexts #-}
module Surrounder (surround) where
import Lang (Term(..), Func(..), Bind, EVal, Set, CEnv, FreeIndx, Restr(..), CExp)
import Interpreter (CondRes(..), mkCExps, mkEnv, getDef, evalAlt, evalCAlt)
import Unification (SubstApp(..), SubstUpd(..), unify) 

-- Окрестностный анализатор (surroundings)
surround :: [Func] -> [EVal] -> (EVal, Set)
surround p d =  _eval (CALL f prms) e ce (RESTR[]) ces p i
           where (DEF f prms _) : p' = p
                 (ces, i) = mkCExps prms 1
                 e        = mkEnv prms d
                 ce       = mkEnv prms ces

_eval :: Term -> [Bind] -> CEnv -> Restr -> [CExp] -> [Func] -> FreeIndx -> (EVal, Set)
_eval (CALL f args) e ce r ces p i =
         _eval t e' ce' r ces p i
         where
            DEF _ prms t = getDef f p
            e'  = mkEnv prms (args/.e)
            ce' = mkEnv prms (args/.ce)

_eval (ALT c t1 t2) e ce r ces p i =
         case evalAlt c e of
            TRUE  ue  -> _eval t1 (e +. ue) ce1' r1 ces1 p i'
            FALSE ue  -> _eval t2 (e +. ue) ce2' r2 ces2 p i'
         where
            ((cnt1,cnt2), uce1, uce2, i') = evalCAlt c ce i
            ((ce1,ces1),r1) =((ce,ces),r) /. cnt1
            ce1' =ce1 +. uce1
            ((ce2,ces2),r2) =((ce,ces),r) /. cnt2
            ce2' =ce2 +. uce2

_eval exp e ce r ces p i =
         (res, (ces, r) /. subst)
         where
            res  =exp/.e
            (True, subst) = unify [exp/.ce] [res]
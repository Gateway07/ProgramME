{-# LANGUAGE MultiParamTypeClasses, TypeSynonymInstances, FlexibleInstances, FlexibleContexts #-}
module Surrounder (surround) where
import Lang (Term(..), Func(..), Bind, EVal, Set, FreeIndx, Restr(..), CExp, CBind)
import Interpreter (CondRes(..), makeCExps, makeEnv, getDef, evalAlt, evalCAlt)
import Unification (SubstApp(..), SubstUpd(..), unify) 

-- Окрестностный анализатор (surroundings)
surround :: [Func] -> [EVal] -> (EVal, Set)
surround p d =  _eval (CALL f prms) env cenv (RESTR[]) ces p i
           where (DEF f prms _) : _ = p
                 (ces, i) = makeCExps prms 1
                 env        = makeEnv prms d
                 cenv       = makeEnv prms ces

-- 1. Term - текущий терм
-- 2. [Bind] - означенное окружение
-- 3. [Bind] - окружение со свободными перменными
-- 4. Restr - рестрикция
-- 5. [CExp] - все переменные из параметров (Dom)
-- 6. [Func] - программа
-- 7. FreeIndx - максимальный свободный индекс
_eval :: Term -> [Bind] -> [CBind] -> Restr -> [CExp] -> [Func] -> FreeIndx -> (EVal, Set)
_eval (CALL f args) e ce r ces p i =
         _eval t newEnv newCenv r ces p i
         where
            DEF _ prms t = getDef f p
            newEnv  = makeEnv prms (args /. e)
            newCenv = makeEnv prms (args /. ce)

_eval (ALT cond t1 t2) env cenv r ces p i =
    case evalAlt cond env of
        TRUE  ue  -> _eval t1 (env +. ue) newCenv1 newR1 ces1 p newIndex
        FALSE ue  -> _eval t2 (env +. ue) newCenv2 newR2 ces2 p newIndex
    where
        ((cnt1, cnt2), uce1, uce2, newIndex) = evalCAlt cond cenv i
        ((ce1, ces1), newR1) = ((cenv, ces), r) /. cnt1
        newCenv1 = ce1 +. uce1
        ((ce2, ces2), newR2) = ((cenv, ces), r) /. cnt2
        newCenv2 = ce2 +. uce2

_eval expr env cenv r ces _ _ = (res, (ces, r) /. subst)
    where
        res = expr /. env
        (True, subst) = unify [expr /. cenv] [res]
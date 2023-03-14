{-# LANGUAGE MultiParamTypeClasses, TypeSynonymInstances, FlexibleInstances #-}
module Process  (ProcessTree(..), Branch, makeTree, makeTreeX) where
import Lang (Term(..), Func(..), FreeIndx, Restr(..), Contr, Conf, identityFree, Set)
import Unification (SubstApp(..), SubstUpd(..), makeFreeIndex, )
import Interpreter(makeEnv, getDef, evalCAlt)

-- Алгоритм построения дерева процессов
data ProcessTree = Leaf Conf
            | Node Conf [Branch] 
   deriving (Show)
type Branch = (Contr, ProcessTree)

-- На вход подается представление множества входных данных из параметров (свободных переменных) и начинается выполнение из стартовой конфигурации.
-- В отличии от интепретатора, где просиходит переход от одного состояния в строго определенное другое одно состояние,
-- здесь происходит также однозначный переход из одной конфигурации (как множество состояний), но только в несколько (ветви дерева) других конфигураций, 
-- за счет разбиения (в виде сужений, как подстановок и рестрикций) на разные, но комплементарные конфигурации.
-- Поэтому интепретатор является частным случаем Дерева процессов в случае задания на вход конкретных значений.
makeTree :: [Func] -> Set -> ProcessTree
makeTree prog input@(exps, r) = _eval start prog i
   where 
      (DEF f params _) : _ = prog
      env = makeEnv params exps
      start = ((CALL f params, env), r)
      i = makeFreeIndex 0 input

_eval :: Conf -> [Func] -> FreeIndx -> ProcessTree
_eval conf@((CALL f args, ce), r) prog i = Node conf [(identityFree, _eval newConf prog i)]
   where
      DEF _ params term = getDef f prog
      newEnv = makeEnv params (args /. ce)
      newConf  = ((term, newEnv), r)

_eval conf@((ALT cond term1 term2, oldEnv), _) prog i = Node conf [(cntr1, _eval newConf1 prog newIndex), (cntr2, _eval newConf2 prog newIndex)]
   where
      ((cntr1, cntr2), oldEnv1, oldEnv2, newIndex) = evalCAlt cond oldEnv i
      ((_, newEnv1), newRestr1) = conf /. cntr1
      newConf1 = ((term1, newEnv1 +. oldEnv1), newRestr1)
      ((_, newEnv2), newRestr2) = conf /. cntr2
      newConf2 = ((term2, newEnv2 +. oldEnv2), newRestr2)

_eval otherConf@((_, _), _) _ _ = Leaf otherConf

-- Алгоритм построения дерева процессов с отсечением сухих поддеревьев
makeTreeX :: [Func] -> Set -> ProcessTree
makeTreeX p cl = Node c (_cutTree branches)
   where 
      tree = makeTree p cl
      Node c branches = tree

_cutTree :: [Branch] -> [Branch]
_cutTree [ ]                = [ ]
_cutTree (branch@(contr, tree) : bs)   =
   case tree of
      Leaf (_, INCONSISTENT _)   -> _cutTree bs
      Node (_, INCONSISTENT _) _ -> _cutTree bs
      Leaf _                     -> branch :_cutTree bs
      Node c               bs'   -> b':_cutTree bs
         where tree' = Node c (_cutTree bs')
               b'    = (contr, tree')
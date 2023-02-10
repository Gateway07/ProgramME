{-# LANGUAGE InstanceSigs #-}
module Lang (
  Term(..), Cond(..), Func(..), Atom, Exp, Var, EVal, AVal, EExp, State, Bind(..), Fname, Parm, identityFree, emptyFree,
  CVar, CExp, CBind, CEnv, FreeIndx, Restr(..), InEq(..), Set, Conf, Contr(..), Split, Subst(..)) where

type Atom  = String  -- алфавит атомов
-- Term - это "почти все", но на самом деле, понятие "Exp" намного уже чем "Term"
data Term  = ALT Cond Term Term -- Ветвление в зависимости от условия (if Cond == True then Tearm1 else Term2)
 | CALL Fname [Exp]       -- Вызов функции по имени с параметрами
 | CONS Exp Exp           -- Конструкция из двух выражений
 | ATOM Atom              -- Атомарное значение
 | PVA  Vname             -- Связанная атомарная переменная (имя-строка) 
 | PVE  Vname             -- Связанная общая переменная (имя-строка) 
 | CVA  Int               -- Свободная атомарная переменная (имя-номер) 
 | CVE  Int               -- Свободная общая переменная (имя-номер) 
 deriving (Show)

data Func = DEF Fname [Parm] Term -- Функция программы
instance Show Func where
  show :: Func -> String
  show (DEF name _ _) = name

data Cond = EQA AExp AExp         -- Условие в ALT на равенство AExp == AExp
 | MATCH Exp EVar EVar AVar       -- определяет соответсвие exp и headEVar tailEVar headAVar
 deriving (Show)

type Fname = String                 -- Имя функции
type Vname = String                 -- Значение 

-- Частные виды "Term":
type Exp   = Term                 -- Выражение 
type Var   = Term                 -- Переменная  
type EVal  = Term                 -- Значение общего типа 
type AVal  = Term                 -- Значение атомарного типа

type EExp  = Term                 -- Выражение общего типа
type AExp  = Term                 -- Выражение атомарного типа

type EVar  = Term                 -- Переменная составного типа 
type AVar  = Term                 -- Переменная атомарного типа 

type Parm  = Term 

-- Семантика TSG
data Bind  = Var := Exp           -- Связь, [Bind] - Окружение
  deriving (Show)
type State = (Term, [Bind])          -- Состояние

-- Представление множеств c-конструкции 
type CVar    = Term                 -- c-переменные
type CExp    = Term                 -- c-выражения
type CBind   = Bind                 -- c-связи
type CEnv    = [Bind]               -- c-среды
type FreeIndx = Int                 -- индексы c-переменных (числа)

-- Рестрикции 
data InEq    = CExp :=/=: CExp      -- Неравенство
  deriving (Show)
data Restr   = INCONSISTENT [InEq]        -- Рестрикция
             | RESTR [InEq]
  deriving (Show)

-- Представление множеств
type Set   = ([CExp], Restr)        -- Представление множества данных
type Conf  = ((Term, CEnv), Restr)  -- Конфигурация

-- Два 'особых' сужения:
identityFree, emptyFree :: Contr
identityFree   = S []
emptyFree = R (INCONSISTENT [CVA 0 :=/=: CVA 1])
-- 1. identityFree,               emptyFree, слева - ВСЕ, справа - ПУСТО.
-- 2. S [E.i :-> (CONS E.m E.n)], S [E.i :-> A.p], слева - расширение на две новые переменные, справа - замена на одну новую атомарную переменную.
-- 3. S [A.j :-> A.k],            R RESTR[A.j :≠: A.k], слева - замена на новую переменную, справа - исключение этой переменную.
-- 4. S [A.j :-> ’a],             R RESTR[A.j :≠: ’a], слева - замена на значение, справа - исключение этого значения.
-- где левая и правая стороны комплементарны, а i/j/k — переменные из cx, m/n/p — новые c-переменные для cx
data Contr = S [Subst] | R Restr    -- Сужение
  deriving (Show)
type Split = (Contr, Contr)         -- Разбиение

data Subst = CVar :-> CExp          -- Подстановка
  deriving (Show)
  
-- Сравнение (неупорядоченные пары)
instance Eq Bind where
   (var1 := _) == (var2 := _) = var1 == var2

-- а термы надо сравнивать так:
instance Eq Term  where
  ATOM a1    == ATOM a2      = a1==a2
  CVA  a1    == CVA  a2      = a1==a2
  CVE  a1    == CVE  a2      = a1==a2
  PVA  a1    == PVA  a2      = a1==a2
  PVE  a1    == PVE  a2      = a1==a2
  CONS h1 t1 == CONS h2 t2   = (h1==h2) && (t1==t2)
  CALL f1 t1s== CALL f2 t2s  = (f1==f2) && (t1s==t2s)
  ALT  c1 t1 t2== ALT c2 t3 t4 = (c1==c2) && (t1==t3) && (t2==t4)
  _          == _            = False

instance Eq Cond where
   EQA a1 a2 == EQA a3 a4 = (a1==a3) && (a2==a4)
   MATCH e1 e2 e3 e4 == MATCH e5 e6 e7 e8 = (e1==e5) && (e2==e6) && (e3==e7) && (e4==e8)
   _                ==  _ = False

-- неравенства (неупорядоченные пары)
instance Eq InEq where
  (l1:=/=:r1) == (l2:=/=:r2) | (l1==l2) && (r1==r2) = True
                             | (l1==r2) && (r1==l2) = True
                             | otherwise            = False   
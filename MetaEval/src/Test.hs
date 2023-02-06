module Test (match, a, b, x, y, ab, za, xyzab, yx, exALL) where
import Lang ( Term(..), Cond(..), Func(..), InEq(..), Subst(..) )
import Representer( Restr(..), isElem, unifyCVars, decompose)
import Interpreter ( SubstApp(..), interpret )
import Surrounder(surround)
import Solver (ura, ura')

-- Пример программы на TSG
match :: [Func]
match = [
  DEF "Match"[patStr, string]
    (CALL"CheckPos"[patStr, string, patStr, string]),
  DEF "CheckPos" [pat, str, patStr, string]
    (ALT (MATCH pat patHead patTail a_ )
     (ALT (MATCH patHead e_ e_ a_patHead)
       (ATOM "ERROR: Atom expected")
       (ALT (MATCH str strHead strTail a_)
         (ALT (MATCH strHead e_ e_ a_strHead)
           (ATOM "ERROR: Atom expected")
           (ALT (EQA a_patHead a_strHead)
             (CALL "CheckPos"[patTail, strTail, patStr, string])
             (CALL "NextPos" [patStr, string])
         ) )
         (ATOM "FAILURE")
     ) )
     (ATOM "SUCCESS")
 ),
 DEF "NextPos" [patStr, string]
   (ALT (MATCH string e_ stringTail a_)
     (CALL "Match" [patStr, stringTail])
     (ATOM "FAILURE")
   )]

 where
   patStr    = PVE "patStr"
   string      = PVE "string"
   stringTail  = PVE "stringTail"
   pat         = PVE "pat" 
   str         = PVE "str"
   patTail     = PVE "patTail" 
   strTail     = PVE "strTail" 
   patHead     = PVE "patHead"
   strHead     = PVE "strHead"
   e_          = PVE "_"
   a_patHead   = PVA "patHead"
   a_strHead   = PVA "strHead"
   a_          = PVA "_"

-- Примеры входных данных для match
a = CONS (ATOM "A") (ATOM "NIL")
b = CONS (ATOM "B") (ATOM "NIL")
x = CONS (ATOM "X") (ATOM "NIL")
y = CONS (ATOM "Y") (ATOM "NIL")
ab = CONS (ATOM "A") (CONS (ATOM "B") (ATOM "NIL"))
xyzab = CONS (ATOM "X") (CONS (ATOM "Y") (CONS (ATOM "Z")
                   (CONS (ATOM "A") (CONS (ATOM "B") (ATOM "NIL")))))
za = CONS (ATOM "Z") (CONS (ATOM "A") (ATOM "NIL"))
yx = CONS (ATOM "Y") (CONS (ATOM "X") (ATOM "NIL"))

-- Примеры подстановок
ex_6 = (ineqs/.s1, rs/.s1,      -- применение 3 подстановок
        ineqs/.s2, rs/.s2,      -- к списку неравенств и к рестрикции
        ineqs/.s3, rs/.s3)      -- (см. раздел 2.5., пример 2)
 where
   ineqs = [CVA 2 :=/=: CVA 1, CVA 2 :=/=: ATOM "C", CVA 3 :=/=: ATOM "A"]
   rs = RESTR ineqs
   s1 = [CVA 1 :-> ATOM "A", CVA 2 :-> CVA 3]
   s2 = [CVA 1 :-> ATOM "B", CVA 3 :-> ATOM "B"]
   s3 = [CVA 2 :-> CVA 1,    CVA 3 :-> ATOM "A"]

-- Примеры вычисления окрестности 
d1 = [a, a]
d2 = [a, b]
d3 = [x, y]
d4 = [ab, xyzab]
d5 = [za, xyzab]

exN1 = surround match d1
exN2 = surround match d2
exN3 = surround match d3
exN4 = surround match d4
exN5 = surround match d5

-- Центр окрестности принадлежит ей
exTst = map test [d1, d2, d3, d4, d5]           --- должно быть все true
  where test di = isElem di odi  where (_, odi) = surround match di

-- Примеры вычисления программы "match"
ex_1 = interpret match d1
ex_2 = interpret match d2
ex_3 = interpret match d3
ex_4 = interpret match d4
ex_5 = interpret match d5

-- Полный список подготовленых примеров
exALL = ( ex_1, ex_2, ex_3, ex_4, ex_5, ex_6, 
           exN1, exN2, exN3, exN4, exN5, 
           exTst, exOp, 
           ex_u1', ex_u1, ex_u2', ex_u2, ex_u3', ex_u3, ex_u4', ex_u4 
         )
-- Примеры инверсных вычислений
strABC = CONS (ATOM "A") (CONS (ATOM "B") (CONS (ATOM "C") (ATOM "NIL")))
strAAA = CONS (ATOM "A") (CONS (ATOM "A") (CONS (ATOM "A") (ATOM "NIL")))

-- перечисление подстрок строки ('A 'B 'C)
ex_u1' = ura' match ([CVE 1, strABC], RESTR []) (ATOM "SUCCESS")
ex_u1  = ura  match ([CVE 1, strABC], RESTR []) (ATOM "SUCCESS")

-- перечисление подстрок строки ('A 'A 'A)
ex_u2' = ura' match ([CVE 1, strAAA], RESTR []) (ATOM "SUCCESS")
ex_u2  = ura  match ([CVE 1, strAAA], RESTR []) (ATOM "SUCCESS")

-- перечисление НЕ-подстрок строки ('A 'B 'C)
ex_u3' = ura' match ([CVE 1, strABC], RESTR []) (ATOM "FAILURE")
ex_u3  = ura  match ([CVE 1, strABC], RESTR []) (ATOM "FAILURE")

-- перечисление НЕ-подстрок строки ('A 'A 'A)
ex_u4' = ura' match ([CVE 1, strAAA], RESTR []) (ATOM "FAILURE")
ex_u4  = ura  match ([CVE 1, strAAA], RESTR []) (ATOM "FAILURE")

-- Пример на пересечение и декомпозицию окрестностей
-- тест: после окрестности должно быть true
exOp = (  osubs4, isElem [subs4]  osubs4,
           osubs5, isElem [subs5]  osubs5,
           ostr1,  isElem [str  ]  ostr1, 
           ostr2,  isElem [str  ]  ostr2, 
           ostr12, isElem [str  ]  ostr12 )
 where
   [subs4, str ] = d4
   [subs5, _   ] = d5
   ( _ , od4) = surround match d4
   ( _ , od5) = surround match d5
   (osubs4, ostr1) = decompose od4 [subs4] [str]
   (osubs5, ostr2) = decompose od5 [subs5] [str]
   (_ , ostr12:_) = unifyCVars ostr1 ostr2  -- пересечение
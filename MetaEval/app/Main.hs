module Main (main) where

import Lang ( Term(..), Restr(..), InEq(..) )
import Test ( match, za, xyzab, a, b )
import Interpreter ( interpret )
import Process ( makeTree )

main :: IO ()
main = do
  let v = interpret match [ za, xyzab ]
  print v

  let pt = makeTree match ([CVE 1, a], RESTR []) -- класс должен соответсвовать входным параметрам
  print pt
module Main (main) where

import Lang ( Term(..), Restr(..), InEq(..) )
import Test ( match, za, xyzab, a, b, strABC)
import Interpreter ( interpret )
import Process ( makeTree )
import Solver (invertToSRs)

main :: IO ()
main = do
  let v = interpret match [ a, a ]
  print v

  let t = invertToSRs match ([CVE 1, strABC], RESTR []) (ATOM "SUCCESS")
  print t


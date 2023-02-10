module Main (main) where

import Lang ( Term(..), Restr(..), InEq(..) )
import Test ( match, za, xyzab, a, b, strABC)
import Interpreter ( interpret )
import Process ( makeTree )
import Solver (invertToSRs)
import Text.Pretty.Simple (pPrint)

main :: IO ()
main = do
  let v = interpret match [ za, xyzab ]
  pPrint v

  let t = makeTree match ([strABC, CVA 1], RESTR [])
  pPrint t

  let ex4  = invertToSRs  match ([strABC, CVA 1], RESTR []) (ATOM "FAILURE")
  pPrint ex4
  print ""
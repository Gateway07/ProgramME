module Main (main) where

import Lang ( Term(..), Restr(..) )
import Test ( match, a, strABC)
import Interpreter ( interpret )
import Process ( makeTreeX )
import Solver (invertToSRs)

main :: IO ()
main = do
  let v = interpret match [ a, a ]
  print v

  let tr = makeTreeX match ([CVE 1, a], RESTR [])
  print tr
  
  print "invertToSRs"
  let i1  = invertToSRs  match ([CVE 1, strABC], RESTR []) (ATOM "SUCCESS")
  print i1
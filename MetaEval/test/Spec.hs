import Lang ( Term(..), Restr(..) )
import Test ( a, match )
import Process ( makeTree )

main :: IO ()
main = do
  let pt = makeTree match ([CVE 1, a], RESTR []) -- класс должен соответсвовать входным параметрам
  print pt
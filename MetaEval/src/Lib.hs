module Lib  (copy, nub, transpose, findSubStrIndex, trace, isEmpty, when) where
import GHC.IO (unsafePerformIO)
import Debug.Trace (traceIO)

when :: Bool -> a -> Maybe a
when p x = if p then Just x else Nothing

isEmpty :: [a] -> Bool
isEmpty myList =
    case myList of
        [] -> True
        _ -> False

trace :: String -> a -> a
trace string expr = unsafePerformIO $ do
    traceIO string
    return expr

-- Standard list processing functions:
copy             :: Int -> a -> [a]      -- make list of n copies of x
copy n x          = take n xs where xs = x:xs

nub              :: Eq a => [a] -> [a]   -- remove duplicates from list
nub []            = []
nub (x:xs)        = x : nub (filter (x/=) xs)

transpose        :: [[a]] -> [[a]]      -- transpose list of lists
transpose         = foldr
                      (\xs xss -> zipWith (:) xs (xss ++ repeat []))
                      []

findSubStrIndex :: String -> String -> Int -> Int
findSubStrIndex "" _ _ = -1
findSubStrIndex s target n
    | take (length target) s == target      = n
    | otherwise                             = findSubStrIndex (tail s) target (n + 1)

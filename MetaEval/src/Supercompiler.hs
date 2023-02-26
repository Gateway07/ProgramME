module Supercompiler  (confront) where
import Lang (Term(..), CExp, Func (DEF), Conf, Bind(..))

-- wh (Упрощающее сравнение c-выражений)
confront::CExp -> CExp -> Bool
confront  (ATOM y)     (ATOM x)       = x == y
confront  (CONS y1 y2) x@(CONS x1 x2) = confront y1 x1 && confront y2 x2 || confront y1 x || confront y2 x
confront  (CONS y1 y2) x              = confront y1 x || confront y2 x
confront  (CVE _)     (CVE _)         = True
confront  (CVA _)     (CVA _)         = True
confront  _           _               = False

numprog :: [Func] -> [Func]
numprog p =   p'   where (p', _) = numdefs p 1

numdefs :: [Func] -> Int -> ([Func], Int)
numdefs [ ] i = ([ ], i)
numdefs ((DEF fn prms t):fds) i = (DEF fn prms t':fds', i'')
    where 
        (t', i') = numterm t i
        (fds', i'') = numdefs fds i'

-- numterm (numprog перенумерация термов исходной программы)
numterm :: Term -> Int -> (Term, Int)
numterm t@(ALT c t1 t2) i = (ALT' c t1' t2' i, i'')
    where 
        (t1', i') = numterm t1 (i+1)
        (t2', i'') = numterm t2 i'

numterm (CALL fn args) i = (CALL' fn args i, i+1)
numterm t i = (t, i)

--  whConf (Сравнивает (упрощающее сравнение) две конфигурации cDn и cUp между собой)
confrontConf :: Conf -> Conf -> Bool
confrontConf ((termDn, cEnvDn), _) ((termUp, cEnvUp), _) =
           isTermSame termDn termUp &&
           and (zipWith (\ (_ := cExpDn) (_ := cExpUp) -> confront cExpDn cExpUp) cEnvDn cEnvUp)

isTermSame :: Term -> Term -> Bool
isTermSame (ALT' _ _ _ i) (ALT' _ _ _ j) = i == j
isTermSame (CALL' _ _ i)  (CALL' _ _ j)  = i == j
isTermSame _              _              = False



from typing import Callable, List
from unittest import TestCase, TestLoader, main

TestLoader.sortTestMethodsUsing = None
from z3 import *

from Z3.Utils import gen_smt

t = BoolVal(True)
f = BoolVal(False)

# FROM int[] AS vector WHERE ALL(FROM vector.element WHERE 0 == vector.element OR vector.element == 1)
def where(N: int, is_all: bool, sort: SortRef, predicate: Callable[[ArithRef], BoolRef], in_seq: List[ArithRef] = None) -> (List[ExprRef], SeqRef):
    if in_seq is None:
        in_seq = [FreshConst(sort, prefix='in_' + str(i)) for i in range(N)]

    fs = []
    for e in in_seq:
        fs.append(predicate(e))

    return [And(fs) if is_all else Or(fs)], in_seq

def dot(N: int, sort: SortRef, produce: Callable[[ArithRef, ArithRef], ArithRef], in1: List[ArithRef] = None, in2: List[ArithRef] = None) -> (
        List[ExprRef], List[ArithRef], List[ArithRef], List[ArithRef]):
    if in1 is None:
        in1 = [FreshConst(sort, prefix='in1_' + str(i)) for i in range(N)]
    if in2 is None:
        in2 = [FreshConst(sort, prefix='in2_' + str(i)) for i in range(N)]

    out = [FreshConst(sort, prefix='out_' + str(i)) for i in range(N)]
    fs = []
    for i in range(N):
        fs.append(out[i] == produce(in1[i], in2[i]))

    return [And(fs)], in1, in2, out

def knapsack(N: int, sort: SortRef) -> (List[ExprRef], ArithRef, ArithRef, ArithRef, SeqRef):
    c = Int('c')
    w = [FreshConst(sort, prefix='w_' + str(i)) for i in range(N)]
    v = [FreshConst(sort, prefix='v_' + str(i)) for i in range(N)]
    d = [FreshConst(sort, prefix='d_' + str(i)) for i in range(N)]

    fs1, _ = where(N, True, sort, lambda x: x > 0, v)
    fs2, _ = where(N, True, sort, lambda x: x > 0, w)
    fs3, _ = where(N, True, sort, lambda x: Or(x == 0, x == 1), d)

    prod = lambda x1, x2: If(x2 == 1, x1, If(x2 == 0, 0, If(x1 == 1, x2, If(x1 == 0, 0, x1 * x2))))
    fs4, _, _, v_d = dot(N, sort, prod, v, d)
    fs5, _, _, w_d = dot(N, sort, prod, w, d)

    fs = [Sum(w_d) <= c]
    fs.extend(fs1)
    fs.extend(fs2)
    fs.extend(fs3)
    fs.extend(fs4)
    fs.extend(fs5)
    return fs, d, w, v, c, Sum(v_d), Sum(w_d)

class MainTest(TestCase):
    def test_knapsack(self):
        s = Optimize()
        t_v, t_w = [10, 30, 20], [5, 10, 15]
        N = len(t_v)

        fs, d, w, v, c, sum_v_d, sum_w_d = knapsack(N, IntSort())
        s.add(fs)
        s.add(c == IntVal(100))
        # s.add([v[i] == t_v[i] for i in range(N)])
        # s.add([w[i] == t_w[i] for i in range(N)])

        s.maximize(sum_v_d)
        for m in gen_smt(s, [*d]):
            print([m[e] for e in d], [m[e] for e in v], [m[e] for e in w], '=', m.eval(sum_v_d))

        print(s.sexpr())

    def test_where(self):
        s = Solver()

        fs, seq = where(5, True, IntSort(), lambda x: And(x >= IntVal(1), x < IntVal(5)))
        s.add(fs)
        for m in gen_smt(s, [*seq]):
            print([m[e] for e in seq])

    def test_dot(self):
        s = Solver()
        N = 5
        fs, seq1, seq2, seq = dot(N, IntSort(), lambda x1, x2: x1 * x2)
        fs1, _ = where(N, True, IntSort(), lambda x: x > 0, seq1)
        fs2, _ = where(N, True, IntSort(), lambda x: x > 0, seq2)
        s.add(*fs, *fs1, *fs2)

        for m in gen_smt(s, [*seq1, *seq2, *seq]):
            print([m[e] for e in seq], '=', [m[e] for e in seq1], '*', [m[e] for e in seq2])

if __name__ == '__main__':
    main()

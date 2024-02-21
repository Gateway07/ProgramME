from typing import Callable, List
from unittest import TestCase, TestLoader, main

TestLoader.sortTestMethodsUsing = None
from z3 import *

from Z3.Utils import gen_smt, val

t = BoolVal(True)
f = BoolVal(False)

# FROM int[] AS vector WHERE ALL(FROM vector.element WHERE 0 == vector.element OR vector.element == 1)
def where(is_all: bool, sort: SortRef, predicate: Callable[[ArithRef], BoolRef], in_seq: SeqRef = None) -> (List[ExprRef], SeqRef):
    seq_sort = SeqSort(sort)
    if in_seq is None:
        in_seq = FreshConst(seq_sort, prefix='in')

    check_fun = RecFunction('check' + FreshConst(sort).__str__(), seq_sort, BoolSort())
    if is_all:
        RecAddDefinition(check_fun, [in_seq],
                         If(Length(in_seq) == 0, t,
                            If(predicate(in_seq[0]),
                               check_fun(SubSeq(in_seq, 1, Length(in_seq) - 1)), f)))
    else:
        RecAddDefinition(check_fun, [in_seq],
                         If(Length(in_seq) == 0, f,
                            If(not predicate(in_seq[0]),
                               check_fun(SubSeq(in_seq, 1, Length(in_seq) - 1)), t)))
    return [check_fun(in_seq)], in_seq

# FROM bool[] AS vector
def is_bool() -> SeqRef:
    return FreshConst(SeqSort(BoolSort()), prefix='bool_in')

def dot(sort: SortRef, produce: Callable[[ArithRef, ArithRef], ArithRef], in1: SeqRef = None, in2: SeqRef = None) -> (List[ExprRef], SeqRef, SeqRef, SeqRef):
    seq_sort = SeqSort(sort)
    if in1 is None:
        in1 = FreshConst(seq_sort, prefix='int1')
    if in2 is None:
        in2 = FreshConst(seq_sort, prefix='int2')

    out = FreshConst(seq_sort)
    rec_fun = RecFunction('dot' + FreshConst(sort).__str__(), seq_sort, seq_sort, seq_sort)
    RecAddDefinition(rec_fun, [in1, in2],
                     If(Length(in1) == 0, Empty(seq_sort),
                        Concat(Unit(produce(in1[0], in2[0])), rec_fun(SubSeq(in1, 1, Length(in1) - 1), SubSeq(in2, 1, Length(in2) - 1)))))

    return [Length(in1) == Length(in2), rec_fun(in1, in2) == out], in1, in2, out

def knapsack(sort: SortRef) -> (List[ExprRef], ArithRef, ArithRef, ArithRef, SeqRef):
    seq_sort = SeqSort(sort)
    c = Int('c')
    w, v, d = Consts('w v d', seq_sort)
    fs1, _ = where(True, sort, lambda x: x > 0, v)
    fs2, _ = where(True, sort, lambda x: x > 0, w)
    fs3, _ = where(True, sort, lambda x: Or(x == 1, x == 0), d)

    prod = lambda x1, x2: If(x1 == 0, 0, If(x1 == 1, x2, -1))
    fs4, _, _, v_d = dot(sort, prod, v, d)
    fs5, _, _, w_d = dot(sort, prod, w, d)

    sum_fun = RecFunction('sum' + FreshConst(sort).__str__(), seq_sort, sort)
    seq = FreshConst(seq_sort)
    RecAddDefinition(sum_fun, [seq],
                     If(Length(seq) == 0, 0,
                        Sum(seq[0], sum_fun(SubSeq(seq, 1, Length(seq) - 1)))))

    fs = [Length(d) == Length(w), sum_fun(w_d) <= c]
    fs.extend(fs1)
    fs.extend(fs2)
    fs.extend(fs3)
    fs.extend(fs4)
    fs.extend(fs5)
    return fs, d, w, v, c, sum_fun(v_d), sum_fun(w_d)

class MainTest(TestCase):
    def test_knapsack(self):
        s = Optimize()

        fs, d, w, v, c, sum_v_d, sum_w_d = knapsack(IntSort())
        s.add(fs)
        s.add(c == IntVal(3), Length(d) == 1)
        s.add(v == Unit(IntVal(2)))
        s.add(w == Unit(IntVal(1)))

        s.maximize(sum_v_d)
        for m in gen_smt(s, [d, w, v, sum_v_d]):
            print(val(m.eval(v)), '*', val(m.eval(d)), '=', m.eval(sum_v_d))

    def test_where(self):
        s = Solver()

        fs, seq = where(True, IntSort(), lambda x: And(x >= IntVal(1), x < IntVal(5)))
        s.add(fs)
        for m in gen_smt(s, [seq]):
            print(val(m.eval(seq)))

    def test_dot(self):
        s = Solver()

        fs, seq1, seq2, seq = dot(IntSort(), lambda x1, x2: x1 * x2)
        fs1, _ = where(True, IntSort(), lambda x: x > 0, seq1)
        fs2, _ = where(True, IntSort(), lambda x: x > 0, seq2)
        s.add(fs)
        s.add(fs1)
        s.add(fs2)
        s.add(Length(seq1) > 2)
        for m in gen_smt(s, [seq1, seq2, seq]):
            print(val(m.eval(seq)), '=', val(m.eval(seq1)), '*', val(m.eval(seq2)))

if __name__ == '__main__':
    main()

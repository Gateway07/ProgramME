from typing import Callable
from unittest import TestCase, main

from z3 import *

from Z3.Utils import gen_smt

# FROM int[] AS vector WHERE ALL(FROM vector.element WHERE 0 == vector.element OR vector.element == 1)
def is_all(sort: SortRef, predicate: Callable[[SortRef], BoolRef]) -> (ExprRef, SeqRef):
    seq_sort = SeqSort(sort)
    in_seq = Const('in', seq_sort)
    check_fun = RecFunction('check', seq_sort, BoolSort())

    t = BoolVal(True)
    f = BoolVal(False)
    RecAddDefinition(check_fun, [in_seq],
                     If(Length(in_seq) == 0, t,
                        If(predicate(in_seq[0]),
                           check_fun(SubSeq(in_seq, 1, Length(in_seq) - 1)), f
                           )))
    return check_fun, in_seq

def is_zero_or_one(sort: ArithSortRef, low: ArithRef, high: ArithRef) -> (ExprRef, SeqRef):
    seq_sort = SeqSort(sort)
    in_seq = Const('in', seq_sort)
    check_fun = RecFunction('check', seq_sort, BoolSort())

    t = BoolVal(True)
    f = BoolVal(False)
    RecAddDefinition(check_fun, [in_seq],
                     If(Length(in_seq) == 0, t,
                        If(Not(And(low <= in_seq[0], in_seq[0] <= high)), f,
                           check_fun(SubSeq(in_seq, 1, Length(in_seq) - 1)))))
    return check_fun, in_seq

# FROM bool[] AS vector
def is_bool() -> SeqRef:
    return Const('in', SeqSort(BoolSort()))

class MainTest(TestCase):
    def test_zero_or_one(self):
        s = Solver()

        f, seq = is_all(IntSort(), lambda x: Or(IntVal(0) == x, x == IntVal(1)))
        s.add(f(seq))
        for m in gen_smt(s, [seq]):
            print(m.eval(seq))

if __name__ == '__main__':
    main()

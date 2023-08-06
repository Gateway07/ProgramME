from typing import List

from z3 import *

from theory.Theory import Theory


class Split(Theory):
    def __init__(self):
        self.s, self.sep, self.result, xs, ys = Strings('s sep result xs ys')
        fi, li = Ints('fi li')

        split = RecFunction('split', StringSort(), StringSort(), SeqSort(StringSort()))
        RecAddDefinition(split, [xs, re],
                         If(Length(xs) == 0, Empty(StringSort()),
                            If(IndexOf(allow_chars, Unit(xs[0])) >= 0,
                               Concat(Unit(xs[0]), filter(SubSeq(xs, 1, Length(xs) - 1), allow_chars)),
                               filter(SubSeq(xs, 1, Length(xs) - 1), allow_chars))))

    def domain(self) -> List[ExprRef]:
        return [self.s]

    def range(self) -> List[ExprRef]:
        return [self.result]

    def formula(self) -> BoolRef:
        return self.f


theory = MainTheory()
for solution in theory(result=8):
    print(solution)

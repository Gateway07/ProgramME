"""  Accordion represented as a concatenation of: an opening bracket [, a colon :, some (possibly zero) vertical line characters |,
another colon, and a closing bracket ]. The length of the accordion is the number of characters in it.
For example, [::], [:||:] and [:|||:] are accordions having length $4$, $6$ and $7$. (:|:), {:||:}, [:], ]:||:[ are not accordions.
You are given a string $s$. You want to transform it into an accordion by removing some (possibly zero) characters from it.
Note that you may not insert new characters or reorder existing ones. Is it possible to obtain an accordion by removing characters
from $s$, and if so, what is the maximum possible length of the result?
"""
from typing import List

from z3 import *

from theory.Theory import Theory


class MainTheory(Theory):
    def __init__(self):
        self.s, xs, ys, allow_chars = Strings('s xs ys allow_chars')
        fi, li, self.result = Ints('fi li result')

        filter = RecFunction('filter', StringSort(), StringSort(), StringSort())
        RecAddDefinition(filter, [xs, allow_chars],
                         If(Length(xs) == 0, Empty(StringSort()),
                            If(IndexOf(allow_chars, Unit(xs[0])) >= 0,
                               Concat(Unit(xs[0]), filter(SubSeq(xs, 1, Length(xs) - 1), allow_chars)),
                               filter(SubSeq(xs, 1, Length(xs) - 1), allow_chars))))
        self.f = And(
            fi == IndexOf(self.s, "["),
            li == LastIndexOf(self.s, "]"),
            ys == If(Or(fi < 0, li < 0, fi > li), "",
                     filter(SubString(self.s, fi + 1, li - fi), StringVal("|:"))),
            self.result == If(Or(Length(ys) == 0, ys[0] != CharVal(':'), ys[Length(ys) - 1] != CharVal(':')), -1,
                              Length(filter(SubString(ys, 1, Length(ys) - 1), StringVal("|"))) + 4))

    def domain(self) -> List[ExprRef]:
        return [self.s]

    def range(self) -> List[ExprRef]:
        return [self.result]

    def formula(self) -> BoolRef:
        return self.f


theory = MainTheory()
for solution in theory(result=8):
    print(solution)

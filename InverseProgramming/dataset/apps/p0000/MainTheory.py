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
        self.s, self.xs, self.ys, self.allow_chars = Strings('s xs ys allow_chars')
        self.fi, self.li, self.result = Ints('fi li result')

        self.filter = RecFunction('filter', StringSort(), StringSort(), StringSort())
        RecAddDefinition(self.filter, [self.xs, self.allow_chars],
                         If(Length(self.xs) == 0, Empty(StringSort()),
                            If(IndexOf(self.allow_chars, Unit(self.xs[0])) >= 0,
                               Concat(Unit(self.xs[0]), self.filter(SubSeq(self.xs, 1, Length(self.xs) - 1), self.allow_chars)),
                               self.filter(SubSeq(self.xs, 1, Length(self.xs) - 1), self.allow_chars))))

    def domain(self) -> List[ExprRef]:
        return [self.s]

    def range(self) -> List[ExprRef]:
        return [self.result]

    def formula(self) -> BoolRef:
        f = And(
            self.fi == IndexOf(self.s, "["),
            self.li == LastIndexOf(self.s, "]"),
            self.ys == If(Or(self.fi < 0, self.li < 0, self.fi > self.li), "",
                          self.filter(SubString(self.s, self.fi + 1, self.li - self.fi), StringVal("|:"))),
            self.result == If(Or(Length(self.ys) == 0, self.ys[0] != CharVal(':'), self.ys[Length(self.ys) - 1] != CharVal(':')), -1,
                              Length(self.filter(SubString(self.ys, 1, Length(self.ys) - 1), StringVal("|"))) + 4))
        return f


theory = MainTheory()
for solution in theory(result=7):
    print(solution)

from typing import List

from z3 import *

from theory.Theory import Theory

class Reverse(Theory):
    def __init__(self, sort: SortRef):
        seq_sort = SeqSort(sort)
        self.list = Const('list', seq_sort)
        self.result = Const('result', seq_sort)

        fun = RecFunction('Reverse', seq_sort, seq_sort)
        RecAddDefinition(fun, [self.list],
                         If(Length(self.list) == 0,
                            self.list,
                            Concat(fun(Extract(self.list, 1, Length(self.list) - 1)), Unit(self.list[0]))))
        self.f = eq(self.result, fun(self.list))

    def domain(self) -> List[ExprRef]:
        return [self.list]

    def range(self) -> List[ExprRef]:
        return [self.result]

    def formula(self) -> BoolRef:
        return self.f

theory = Reverse(StringSort())
for solution in theory("12345"):
    print(solution)

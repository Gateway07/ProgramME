from typing import List

from z3 import *

from theory.Theory import Theory

class SubSeq(Theory):
    def __init__(self, sort: SortRef, is_seq: bool = True):
        seq_sort = SeqSort(sort) if is_seq else sort
        self.sub = Const('sub', seq_sort)
        self.str = Const('str', seq_sort)
        self.index = Int('index')

        self.f = IndexOf(self.str, self.sub) == self.index

    def domain(self) -> List[ExprRef]:
        return [self.str, self.sub]

    def range(self) -> List[ExprRef]:
        return [self.index]

    def formula(self) -> BoolRef:
        return self.f

if __name__ == "__main__":
    theory = SubSeq(StringSort(), True)
    for solution in theory(['2', '1', '0'], ['1', '0']):
        print(solution)

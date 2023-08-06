from z3 import *

from theory.meta.Surjection import Surjection

class Transitivity(Surjection):
    def __init__(self, f):
        assert len(f.domain()) == 2 and f.domain()[0].sort() == f.domain()[1].sort()
        assert len(f.range()) == 1 and f.range()[0].sort() == BoolSort()

        super().__init__(f)
        self.transitivity = TransitiveClosure(self.surjection)

    def formula(self) -> BoolRef:
        x, y = Consts('x y', self.domain()[0])
        return And(super().formula(), ForAll(x, y, Implies(self._formula, self.transitivity(x, y))))

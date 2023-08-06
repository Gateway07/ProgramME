from z3 import *

from theory.Theory import Theory

class Surjection(Theory):
    """ Surjective (Also Called "Onto").
    A function f (from set A to B) is surjective if and only if for every y in B,
    there is at least one x in A such that f(x) = y, in other words f is surjective if and only if f(A) = B.
    """

    def __init__(self, f):
        self._formula = f

        domain_sorts = [s.sort() for s in self.domain()]
        self.surjection = Function('surjection', *domain_sorts, self.range_sort)

    def formula(self) -> BoolRef:
        return ForAll(self.domain() + self.range(), Implies(self._formula, self.surjection(*self.domain()) == self.range_result))

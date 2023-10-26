from abc import ABC, abstractmethod
from typing import List

from z3 import *

from Z3.Utils import gen_smt, smt, val

class Theory(ABC):
    """ Theory class is base interface for all SMT formula representations: Theory(X) -> Y, where X is input domain's and Y is output range's variables.
    Typical representation of the theory is the following idea:
    - the main theory as set of predicates realize general purpose of program,
    - the error and path theory are subset of main theory to specify range of input data as errors"""

    def __int__(self):
        range_sorts = [s.sort() for s in self.range()]
        if len(range_sorts) > 1:
            self.range_sort, mk_range, _ = TupleSort("Y", range_sorts)
            self.range_result = mk_range(*self.range())
        else:
            self.range_sort = range_sorts[0]
            self.range_result = self.range()[0]

    def name(self):
        return self.__class__.__name__

    @abstractmethod
    def formula(self) -> BoolRef:
        pass

    @abstractmethod
    def domain(self) -> List[ExprRef]:
        pass

    @abstractmethod
    def range(self) -> List[ExprRef]:
        pass

    def __call__(self, *args, **kwargs):
        s = Solver()
        s.add(self.formula())
        frozen_vars = {}
        for i in range(len(args)):
            v = smt(args[i])
            x = self.domain()[i]
            s.add(x == v)
            frozen_vars[x] = v

        for name, arg in kwargs.items():
            v = smt(arg)
            x = self._domain(name)
            if x is None:
                x = self._range(name)
            s.add(x == v)
            frozen_vars[x] = v

        variant_vars = []
        for v in self.domain():
            if v not in frozen_vars.keys():
                variant_vars.append(v)

        for v in self.range():
            if v not in frozen_vars.keys():
                variant_vars.append(v)

        for m in gen_smt(s, variant_vars):
            solution = [val(m[x]) for x in self.domain()] + [val(m[y]) for y in self.range()]
            yield solution

    def _domain(self, name: str):
        for x in self.domain():
            if x.__str__() == name:
                return x
        return None

    def _range(self, name: str):
        for x in self.range():
            if x.__str__() == name:
                return x
        return None

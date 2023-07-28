from abc import ABC, abstractmethod
from typing import List

from z3 import *

from Z3.Utils import gen_smt


class Theory(ABC):
    """ Theory class is base interface for all SMT formula representations: Theory(X) -> Y, where X is input domain's and Y is output range's variables.
    Typical representation of the theory is the following idea:
    - the main theory as set of predicates realize general purpose of program,
    - the error and path theory are subset of main theory to specify range of input data as errors"""

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
        i = 0
        for arg in args:
            v = None
            if isinstance(arg, str):
                v = StringVal(arg)
            elif isinstance(arg, int):
                v = IntVal(arg)
            else:
                v = BitVecVal(arg, 32)
            s.add(self.domain()[i] == v)
            i += 0

        for name, arg in kwargs.items():
            if isinstance(arg, str):
                v = StringVal(arg)
            elif isinstance(arg, int):
                v = IntVal(arg)
            else:
                v = BitVecVal(arg, 32)
            x = self._domain(name)
            if x is None:
                x = self._range(name)
            s.add(x == v)

        for m in gen_smt(s, self.domain()):
            solution = [m[x] for x in self.domain()] + [m[y] for y in self.range()]
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

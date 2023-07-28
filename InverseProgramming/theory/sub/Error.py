from abc import abstractmethod

from z3 import EnumSort, ExprRef

from theory.Theory import Theory


class Error(Theory):
    """ Error class is sub theory for all SMT errors: ErrorTheory(X) -> e, where X is input domain's variables, e is error from enum's values.   """

    def __init__(self):
        self._errors = ['Exception', 'ArithmeticError', 'AssertionError', 'AttributeError', 'BufferError', 'EOFError', 'ImportError', 'LookupError',
                        'MemoryError', 'NameError', 'OSError', 'ReferenceError', 'RuntimeError', 'StopIteration', 'StopAsyncIteration', 'SyntaxError',
                        'SystemError', 'TypeError', 'ValueError', 'Warning', 'GeneratorExit', 'KeyboardInterrupt', 'SystemExit']
        self.error_sort, self.error_values = EnumSort('Error', self._errors)
        error_list = list(self.error_values)
        self._error_dict = {self._errors[i]: error_list[i] for i in range(len(self._errors))}

    def error_sort(self) -> EnumSort:
        return self.error_sort

    def error(self, name_or_index):
        if isinstance(name_or_index, int):
            return self.error_values[name_or_index]
        return self._error_dict[name_or_index]

    @abstractmethod
    def error_range(self) -> ExprRef:
        pass

import enum
from time import perf_counter
from typing import List

from z3 import *

def val(expr: ExprRef):
    if expr is None:
        return None

    expr = simplify(expr)
    if isinstance(expr, IntNumRef):
        return expr.as_long()
    if isinstance(expr, RatNumRef):
        return expr.as_long()
    if isinstance(expr, BoolRef):
        return is_true(expr)
    if isinstance(expr, CharRef):
        return chr(int(expr.__str__()))

    # composite type Seq
    if isinstance(expr, SeqRef):
        if expr.is_string_value():
            return expr.as_string()

        l = simplify(Length(expr)).as_long()
        return [val(expr[i]) for i in range(l)]

    if isinstance(expr, DatatypeRef):
        return int(expr.__str__())

    raise AssertionError(f"Unknown expr: {expr}")

def smt(val, sz: int = 0):
    if isinstance(val, int) and sz > 0:
        return BitVecVal(val, sz)
    if isinstance(val, int):
        return IntVal(val)
    if isinstance(val, bool):
        return BoolVal(val)
    if isinstance(val, str) and sz == 1:
        return CharVal(val[0])
    if isinstance(val, str):
        return StringVal(val)
    if isinstance(val, float):
        return RealVal(val)

    # composite type Seq
    if isinstance(val, list) and len(val) > 0:
        vs = [Unit(smt(v, sz)) for v in val]
        return vs[0] if len(vs) == 1 else Concat(vs)

    # composite type Enum
    if isinstance(val, tuple) and len(val) == 0 and sz > 0:
        _, vs = EnumSort(FreshConst(IntSort(), "Enum").__str__(), [str(i) for i in range(sz)])
        return vs

    # composite type Array
    if isinstance(val, tuple) and len(val) == 1 and sz > 0:
        return K(type_to_sort(list[0]), sz)

    raise AssertionError(f"Unknown value: {val}")

def type_to_sort(base_type: type, param_type: type = None, sz: int = 0) -> SortRef:
    if base_type == int and sz > 0:
        return BitVecSort(sz)
    if base_type == int:
        return IntSort()
    if base_type == bool:
        return BoolSort()
    if base_type == str and sz == 1:
        return CharSort()
    if base_type == str:
        return StringSort()
    if base_type == float:
        return RealSort()

    # composite type
    if base_type == list and param_type is not None:
        return SeqSortRef(type_to_sort(param_type))

    raise AssertionError(f"Unknown type: {base_type}")

def sort_to_type(sort: SortRef) -> type:
    if isinstance(sort, BitVecSortRef):
        return int
    if isinstance(sort, BoolSortRef):
        return bool
    if isinstance(sort, CharSortRef):
        return str
    if isinstance(sort, ReSortRef):
        return str
    if isinstance(sort, SeqSortRef):
        return list
    if isinstance(sort, ArraySortRef):
        return list
    if isinstance(sort, ArithSortRef):
        return float if sort.kind() == Z3_REAL_SORT else int
    if isinstance(sort, DatatypeSortRef):
        return type(enum.Enum)

    raise AssertionError(f"Unknown sort: {sort}")

def tail(xs: SeqRef) -> ExprRef:
    return SubSeq(xs, 1, Length(xs) - 1)

def to_smt2_string(f, status="unknown", name="", logic=""):
    v = (Ast * 0)()
    return Z3_benchmark_to_smtlib_string(f.ctx_ref(), name, logic, status, "", 0, v, f.as_ast())

def get_models(F: BoolRef, var_refs: List[BoolRef], verbose: bool = False):
    s = Solver()
    s.add(F)
    if verbose:
        print(s.sexpr())

    result = []
    time = perf_counter()
    count = 0
    while s.check() == sat:
        model = s.model()
        count += 1
        print("\nSat time:", perf_counter() - time)
        if verbose:
            # print(sorted([(d, model[d]) for d in model], key=lambda x: str(x[0])))
            for d in model:
                print("%s -> %s" % (d, model[d]))

        result.append(model)

        block = []
        for var_ref in var_refs:
            block.append(var_ref != model.eval(var_ref, model_completion=True))

        s.add(Or(block))
        time = perf_counter()
        yield model
    else:
        if count == 0:
            print("\n" + str(s.check()) + " time:", perf_counter() - time)

def _gen_smt(s, terms: List[ExprRef], n: int):
    i = 0
    while True:
        if 0 < n <= i:
            return
        time = perf_counter()
        if s.check() != sat:
            print("\nUnsat! Time:", perf_counter() - time)
            return

        m = s.model()
        print(i + 1, "Sat! Time:", perf_counter() - time)
        i += 1
        yield m

        s.add(Or([t != m.eval(t, model_completion=True) for t in terms]))

def gen_smt(solver, terms: List[ExprRef], n: int = 10):
    yield from _gen_smt(solver, terms, n)

def main():
    enum_expr = smt([1, 2, 3])
    v = val(enum_expr)
    print(v)

    enum_expr = smt((), 5)
    v = val(enum_expr[0])
    print(v)

if __name__ == "__main__":
    main()

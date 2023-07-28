from time import perf_counter
from typing import List

from z3 import *


def tail(xs: SeqRef) -> ExprRef:
    return SubSeq(xs, 1, Length(xs) - 1)


def to_smt2_string(f, status="unknown", name="", logic=""):
    v = (Ast * 0)()
    return Z3_benchmark_to_smtlib_string(f.ctx_ref(), name, logic, status, "", 0, v, f.as_ast())


def get_models(F: BoolRef, var_refs: List[BoolRef], verbose: bool = False):
    s = Solver()
    s.set(mbqi=True)
    # s.set(pull_nested_quantifiers=True)

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


def _gen_smt(s: Solver, terms: List[ExprRef]):
    time = perf_counter()
    if s.check() != sat:
        print("\nUnsat! Time:", perf_counter() - time)
        return

    m = s.model()
    print("\nSat! Time:", perf_counter() - time)
    yield m

    s.add(Or([t != m.eval(t, model_completion=True) for t in terms]))


def gen_smt(solver: Solver, terms: List[ExprRef]):
    yield from _gen_smt(solver, terms)

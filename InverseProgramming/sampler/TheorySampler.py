from time import perf_counter
from typing import List, Set, Tuple

from z3 import *

class GuidedSampler:
    smt_formula = None
    variables: List[Tuple[FuncDeclRef, ExprRef]] = []
    ufs: List[Tuple[FuncDeclRef, ExprRef]] = []
    all_exps: Set[ExprRef] = set()
    var_names: Set[str] = {"bv", "true", "false"}
    samples: List = []

    max_depth = 0
    start_time, solver_time, check_time = 0.0, 0.0, 0.0
    all_calls_count, sat_calls_count, unsat_calls_count, unknown_calls_count = 0, 0, 0, 0

    c = Context()
    params: List = None
    solver = Solver(ctx=c)
    model: ModelRef = None

    def __init__(self, params, input_file: str, max_samples: int, max_time: float):
        self.input_file = input_file
        self.max_samples = max_samples
        self.max_time = max_time

        self.params = params
        self.solver.set(*self.params)

    def solve(self) -> CheckSatResult:
        if self.all_calls_count >= self.max_samples:
            raise Exception("Stopping: countout\n")

        start_time = perf_counter()
        elapsed_time = start_time - self.start_time
        if elapsed_time >= self.max_time:
            raise Exception("Stopping: timeout\n")

        result = self.solver.check()
        if result == sat:
            self.model = self.solver.model()
            self.sat_calls_count += 1
        elif result == unsat:
            self.unsat_calls_count += 1
        elif result == unknown:
            self.unknown_calls_count += 1

        end = perf_counter()
        self.solver_time += end - start_time
        self.all_calls_count += 1

        return result

    def run(self):
        self.start_time = perf_counter()
        if not self.parse_smt():
            print("Formula could not be solved!")
            return

        while True:
            try:
                sample = self.sample()
            except Exception as ex:
                print(ex.__str__())
                break
            if sample is not None:
                self.samples.append(sample)

            if self.all_calls_count % 10 == 0:
                self.print_stats()

    def sample(self) -> List:
        self.solver.push()
        for hard, constr in self.make_constraints():
            if hard:
                self.solver.add(constr)
            else:
                self.solver.add_soft(constr)

        result = self.solve()
        self.solver.pop()

        sample = None
        if result == sat:
            sample = self.values()
            self._skip()

        return sample

    def _skip(self):
        block = []
        for _, var_ref in self.variables:
            ref = self.model.eval(var_ref, model_completion=True)
            block.append(var_ref != ref)
        self.solver.add(Or(block))

    def parse_smt(self):
        self.smt_formula = And(parse_smt2_file(self.input_file, ctx=self.c))

        self.solver.add(self.smt_formula)
        result = self.solve()
        if result != sat:
            return False

        self._visit(self.smt_formula)

        print("Nodes ", len(self.all_exps))
        print("Variables ", len(self.variables))
        print("Uninterpreted functions ", len(self.ufs))
        return True

    def check(self, sample: List) -> bool:
        start = perf_counter()
        self.solver.push()
        self._skip()

        valid = self.solver.check() == sat

        end = perf_counter()
        self.check_time += end - start

        return valid

    def _visit(self, e: ExprRef, depth=0):
        if e in self.all_exps:
            return

        fd = e.decl()
        assert is_app(e)

        name = fd.name()
        if name not in self.var_names:
            self.var_names.add(name)

            if is_const(e):
                assert is_bv(e) or is_bool(e) or is_array(e)
                if not is_array(e):
                    self.variables.append((fd, e))
            if fd.kind() == Z3_OP_UNINTERPRETED:
                self.ufs.append((fd, e))

        self.all_exps.add(e)
        if depth > self.max_depth:
            self.max_depth = depth

        for i in range(e.num_args()):
            self._visit(e.arg(i), depth + 1)

    def values(self) -> List:
        return [self.model[v] for _, v in self.variables]

    def make_constraints(self) -> List[Tuple[bool, ExprRef]]:
        return []

    def print_stats(self):
        print("Total time:   ", perf_counter() - self.start_time)
        print("Solver time:  ", self.solver_time)
        print("Check time:   ", self.check_time)

        print("Sat/Unsat/Unk: ", self.sat_calls_count, "+", self.unsat_calls_count, "+", self.unknown_calls_count,
              "=", self.all_calls_count)

def main(smt_path: str):
    max_samples = 10
    max_time = 10.0

    set_param("rewriter.expand_select_store", "true")
    set_param("parallel.enable", True)
    set_param("smt.random_seed", 1)

    sampler = GuidedSampler(["timeout", 10000], smt_path, max_samples, max_time)

    sampler.run()
    sampler.print_stats()
    for s in sampler.samples:
        line = ','.join([p.__str__() for p in s])
        print(line)

if __name__ == "__main__":
    main(sys.argv[1])

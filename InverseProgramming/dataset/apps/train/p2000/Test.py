from itertools import combinations

from z3 import *

from Z3.Utils import gen_smt, smt

def main():
    edges = [[0, 1, 10], [1, 2, 20], [2, 3, 30], [3, 4, 40], [4, 0, 50]]

    vertexes = smt((), max([s for s, _, _ in edges] + [e for _, e, _ in edges]) + 1)
    ss = [tuple(sorted([s, e]) + [d]) for s, e, d in edges]
    given_edges = [(vertexes[s], vertexes[e], d) for s, e, d in ss]

    edges_dict = {(f, s): d for f, s, d in given_edges}
    all_edges = [(f, s, edges_dict.get((f, s), -100000)) for f, s in list(combinations(vertexes, 2))]
    if len(all_edges) == 0:
        return None, None, None

    vertex_sort = vertexes[0].sort()
    dist_con = Function("dist_con", vertex_sort, vertex_sort, IntSort())

    a, b, fresh_var = Consts('a b c', vertex_sort)
    d, d1, d2 = Ints('d d1 d2')

    path_fun = RecFunction('path_fun', vertex_sort, vertex_sort, vertex_sort, BoolSort())
    RecAddDefinition(path_fun, [a, b, fresh_var],
                     Or(dist_con(a, b) > 0,
                        And(dist_con(a, fresh_var) > 0, path_fun(fresh_var, b, FreshConst(vertex_sort)))))

    dist_fun = RecFunction('dist_fun', vertex_sort, vertex_sort, vertex_sort, IntSort())
    RecAddDefinition(dist_fun, [a, b, fresh_var],
                     If(dist_con(a, b) > 0, dist_con(a, b),
                        dist_con(a, fresh_var) + dist_fun(fresh_var, b, FreshConst(vertex_sort)), -100000))

    fs = []
    for v in vertexes:
        fs.append(dist_con(v, v) == -100000)

    for f, s, dist in all_edges:
        fs.append(dist_con(f, s) == dist)
        fs.append(dist_con(f, s) == dist_con(s, f))

    x, y, t = Consts('x y t', vertex_sort)
    solver = Solver()
    solver.add(And(fs))
    solver.add(dist_fun(x, y, t) == d, d > 0, x == vertexes[0], y == vertexes[4])
    if solver.check() == sat:
        for m in gen_smt(solver, [x, y, d]):
            print(f"Dist: {m[x]} -> [{m[t]}] -> {m[y]} = {m[d]}")
            # print(f"dist_con: {m[dist_con]}")
    else:
        print("Unsat!")

if __name__ == "__main__":
    main()

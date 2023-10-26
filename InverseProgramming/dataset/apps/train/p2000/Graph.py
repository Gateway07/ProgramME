from itertools import combinations
from typing import List

from z3 import *

from Z3.Utils import gen_smt, smt

def graph(vertexes: List, given: List):
    dict = {(f, s): d for f, s, d in given}
    all_edges = [(f, s, dict.get((f, s), 0)) for f, s in list(combinations(vertexes, 2))]
    if len(all_edges) == 0:
        return None, None, None

    vertex_sort = vertexes[0].sort()
    dist_con = Function("dist_con", vertex_sort, vertex_sort, IntSort())
    # tc_con = TransitiveClosure(dir_con)

    a, b, fresh_var = Consts('a b c', vertex_sort)

    d, d1, d2 = Ints('d d1 d2')
    # seen = Const('seen', SetSort(vertex_sort))
    dist_fun = RecFunction('dist_fun', vertex_sort, vertex_sort, vertex_sort, IntSort())
    RecAddDefinition(dist_fun, [a, b, fresh_var],
                     If(dist_con(a, b) > 0, dist_con(a, b),
                        If(dist_con(a, fresh_var) > 0,
                           dist_con(a, fresh_var) + dist_fun(fresh_var, b, FreshConst(vertex_sort)),
                           0)))

    fs = []
    for v in vertexes:
        fs.append(dist_con(v, v) == 0)

    for f, s, dist in all_edges:
        # fs.append(tc_con(f, s))  # connection between vertexs
        fs.append(dist_con(f, s) == dist_con(s, f))  # commutativity distances
        fs.append(dist_con(f, s) == dist)

    return And(fs), dist_con, dist_fun

def main(edges):
    vertexes = smt((), max([s for s, _, _ in edges] + [e for _, e, _ in edges]) + 1)
    vertex_sort = vertexes[0].sort()

    ss = [tuple(sorted([s, e]) + [d]) for s, e, d in edges]
    given_edges = [(vertexes[s], vertexes[e], d) for s, e, d in ss]
    g, dist_con, dist_fun = graph(vertexes, given_edges)

    x, y, t = Consts('x y t', vertexes[0].sort())
    d = Int('d')

    solver = Solver()
    solver.add(g)
    solver.add(d == 30, x != y, dist_fun(x, y, t) == d, x == vertexes[0])
    if solver.check() == sat:
        model = solver.model()
        print(f"dist_con: {model[dist_con]}")
        for m in gen_smt(solver, [x, y, d]):
            print(f"Dist: {m[x]} -> ({m[t]}) -> {m[y]} = {m[d]}")
    else:
        print("Unsat!")

def find_all_paths(graph, start, end, path=[]):
    path = path + [start]
    if start == end:
        return [path]
    if start not in graph:
        return []

    paths = []
    for node in graph[start]:
        if node not in path:
            newpaths = find_all_paths(graph, node, end, path)
            for newpath in newpaths:
                paths.append(newpath)
    return paths

def min_path(graph, start, end):
    paths = find_all_paths(graph, start, end)
    mt = 10 ** 99
    mpath = []
    for path in paths:
        t = sum(graph[i][j] for i, j in zip(path, path[1::]))
        if t < mt:
            mt = t
            mpath = path

    e1 = ' '.join('{} -> {} = {}'.format(i, j, graph[i][j]) for i, j in zip(mpath, mpath[1::]))
    e2 = sum(graph[i][j] for i, j in zip(mpath, mpath[1::]))
    print(f'Best path: {e1}, Total: {e2}\n')

def calc(edges):
    vs = set([s for s, _, _ in edges] + [e for _, e, _ in edges])
    g = {i: {} for i in vs}
    for s, e, d in edges:
        g[s][e] = d
        g[e][s] = d

    paths = find_all_paths(g, 0, 4)
    i = 1
    for p in paths:
        print(f'{i}: {p} = {sum(g[i][j] for i, j in zip(p, p[1::]))}')
        i += 1

    min_path(g, 0, 4)

if __name__ == "__main__":
    edges = [[1, 2, 10], [2, 3, 20], [3, 4, 30], [4, 5, 40], [5, 1, 50]]
    edges = [[s - 1, e - 1, d] for s, e, d in edges]

    # main(edges)
    calc(edges)

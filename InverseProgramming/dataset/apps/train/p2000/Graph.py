from itertools import combinations
from typing import List

from z3 import *

def main():
    vertices = [0, 1, 2, 3, 4]
    edges = [tuple(sorted(edge)) for edge in list(combinations(vertices, 2))]

    solver = Solver()

    VertexSort = Datatype("VertexSort")
    for vertex in vertices:
        VertexSort.declare(str(vertex))
    VertexSort = VertexSort.create()

    vs = {}
    for vertex in vertices:
        vs[vertex] = getattr(VertexSort, str(vertex))

    given = {}
    directly_connected = {}
    tc_connected = {}
    graphs = {
        "G": [(0, 1)],
        "H": [(1, 3)],
    }
    for graph in graphs:
        given[graph] = Function(f"{graph}_given", VertexSort, VertexSort, BoolSort())
        directly_connected[graph] = Function(f"directly_connected_{graph}", VertexSort, VertexSort, BoolSort())
        tc_connected[graph] = TransitiveClosure(directly_connected[graph])

    solver.add(
        tc_connected["G"](vs[0], vs[2]),  # graph G with edge (V0, V1) and the constraint "V0 is connected to V2"
        tc_connected["H"](vs[2], vs[4]),  # graph H with edge (V1, V3) and the constraints "V2 is connected to V4", "V0 is not connected to V2"
        Not(tc_connected["H"](vs[0], vs[2])),
    )

    in_solution = Function("in_solution", VertexSort, VertexSort, BoolSort())
    for edge in edges:
        # commutativity
        solver.add(in_solution(vs[edge[0]], vs[edge[1]]) == in_solution(vs[edge[1]], vs[edge[0]]))
        for graph in graphs:
            # commutativity
            solver.add(given[graph](vs[edge[0]], vs[edge[1]]) == given[graph](vs[edge[1]], vs[edge[0]]))
            solver.add(directly_connected[graph](vs[edge[0]], vs[edge[1]]) == directly_connected[graph](vs[edge[1]], vs[edge[0]]))
            # definition of direct connection
            solver.add(directly_connected[graph](vs[edge[0]], vs[edge[1]]) == Or(
                in_solution(vs[edge[0]], vs[edge[1]]), given[graph](vs[edge[0]], vs[edge[1]])))

            if edge in graphs[graph]:
                solver.add(given[graph](vs[edge[0]], vs[edge[1]]))
            else:
                solver.add(Not(given[graph](vs[edge[0]], vs[edge[1]])))

    print(solver.check())
    model = solver.model()
    print(f"solution: {model[in_solution]}")

def graph(vertexs: List, given: List):
    dict = {(f, s): d for f, s, d in given}
    all_edges = [(f, s, dict.get((f, s), 0)) for f, s in list(combinations(vertexs, 2))]

    input_con = Function("input_con", vertex_sort, vertex_sort, IntSort())
    output_con = Function("output_con", vertex_sort, vertex_sort, BoolSort())
    tc_con = TransitiveClosure(output_con)

    fs = []
    sum_items = []
    for f, s, d in all_edges:
        fs.append(tc_con(f, s))  # connection between vertexs
        fs.append(output_con(f, s) == output_con(s, f))  # commutativity connections
        fs.append(input_con(f, s) == input_con(s, f))  # commutativity distances
        fs.append(input_con(f, s) == d)
        if d == 0:
            fs.append(Not(output_con(f, s)))

        sum_items.append(If(output_con(f, s), input_con(f, s), 0))

    dist = Int("dist")
    fs.append(Sum(sum_items) == dist)
    return And(fs), output_con, dist

if __name__ == "__main__":
    # main()
    edges = [[1, 2, 25], [2, 3, 25], [3, 4, 20], [4, 5, 20], [5, 1, 20]]

    vertex_sort, v = EnumSort("Vertex", [str(i) for i in range(5)])

    given_edges = [(v[0], v[1], 25), (v[1], v[2], 25), (v[2], v[3], 20), (v[3], v[4], 20), (v[0], v[4], 20)]
    g, result, dist = graph(v, given_edges)

    solver = Optimize()
    solver.add(g)
    solver.minimize(dist)

    print(solver.check())
    model = solver.model()
    v = model[dist]
    print(f"solution: {model[result]}, dist: {v}")

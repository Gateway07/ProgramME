from z3 import *

#  cf. https://ericpony.github.io/z3py-tutorial/fixpoint-examples.htm

fp = Fixedpoint()
# fp.set(engine='datalog')

s, (n1, n2, n3, n4, n5, n6, n7) = EnumSort("Edges", [str(i + 1) for i in range(7)])
edge = Function('edge', s, s, BoolSort())
path = Function('path', s, s, BoolSort())
a = Const('a', s)
b = Const('b', s)
c = Const('c', s)

fp.register_relation(path, edge)
fp.declare_var(a, b, c)
fp.rule(path(a, b), edge(a, b))  # a path can be a single edge or
fp.rule(path(a, c), [edge(a, b), path(b, c)])  # a combination of a path and an edge

graph = {n1: [n2, n6, n7],
         n2: [n3, n5],
         n3: [n4, n5, n6],
         n4: [n3],
         n5: [n2, n3],
         n6: [n3, n1]}

#  establish facts by enumerating the graph dictionary
for i, (source, nodes) in enumerate(graph.items()):
    for destination in nodes:
        fp.fact(edge(source, destination))

print("current set of rules:\n", fp)
print(fp.query(path(n1, n4)), "yes, we can reach n4 from n1\n")
print(fp.query(path(n7, n1)), "no, we cannot reach n1 from n7\n")

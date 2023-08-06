from z3 import *

# Subgraph, number of nodes and edges.
# Nodes will be named implicitly from 0 to noOfNodesA - 1
noOfNodesA = 3
edgesA = [(0, 1)]

# Supergraph:
noOfNodesB = 3
edgesB = [(1, 2)]

# Mapping of subgraph nodes to supergraph nodes:
mapping = Array('Map', IntSort(), IntSort())

s = Solver()

# Check that elt is between low and high, inclusive
def InRange(elt, low, high):
    return And(low <= elt, elt <= high)

# Check that (x, y) is in the list
def Contains(x, y, lst):
    return Or([And(x == x1, y == y1) for x1, y1 in lst])

# Make sure mapping is into the supergraph
s.add(And([InRange(Select(mapping, n1), 0, noOfNodesB - 1) for n1 in range(noOfNodesA)]))

# Make sure we map nodes to distinct nodes
s.add(Distinct([Select(mapping, n1) for n1 in range(noOfNodesA)]))

# Make sure edges are preserved:
for x, y in edgesA:
    s.add(Contains(Select(mapping, x), Select(mapping, y), edgesB))

# Solve:
r = s.check()
if r == sat:
    m = s.model()
    for x in range(noOfNodesA):
        print("%s -> %s" % (x, m.evaluate(Select(mapping, x))))
else:
    print("Solver said: %s" % r)

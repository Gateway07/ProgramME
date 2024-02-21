from itertools import *

import pycosat

# How to use this? e.g. 
cnf = [[1, -5, 4], [-1, 5, 3, 4], [-3, -4]]
pycosat.solve(cnf)
# e.g. the first clause is x_1 is true or not x_5 or x_4. And these are joined by AND.

m = int(input('Dimension: '))
t = int(input('Weight: '))

all_variables = []
# For each of the m choose t possible vectors of the appropriate weight, we need to decide whether the coordinate is 1 or 2 (TRUE or FALSE).
all_variables += [('label', (u, k)) for u in combinations(range(m), t) for k in u]
# Helpful to also have a variable recording the 'product' boolean value of each pair - this is TRUE whenever the coordinates have the same values
all_variables += [('label', (u, v, k)) for u, v in permutations(combinations(range(m), t), 2) for k in u]

# Behind the scenes each variable is given a unique integer to label it.
all_variables_index = {}

_num_vars = 0
for v in all_variables:
    all_variables_index[v] = _num_vars
    _num_vars += 1

def var(L):
    return 1 + all_variables_index[L]

def var_label(*L):
    return var(('label', L))

constraints = []

# Make sure the dummy recording variables are TRUE whenever both coordinates have different non-zero values
for u, v in combinations(combinations(range(m), t), 2):
    for k in range(m):
        if k in u and k in v:
            constraints.append([var_label(u, v, k), var_label(v, k), var_label(u, k)])
            constraints.append([var_label(u, v, k), -var_label(v, k), -var_label(u, k)])

# for all distinct s,t,u in S there is a coordinate k such that s_k,t_k,u_k is either {0,1,2} or {0,0,1} or {0,0,2}.
# Note that if there is some k in exactly one of them, done.
for u, v, w in combinations(combinations(range(m), t), 3):
    break_out = 1
    for k in range(m):
        if (k in u and k not in v and k not in w) or (k not in u and k not in v and k in w) or (k not in u and k in v and k not in w):
            break_out = 0
    if break_out == 1:
        tmp = []
        for k in range(m):
            if (k not in u) and (k in v) and (k in w):
                tmp.append(-var_label(v, w, k))
            if (k in u) and (k not in v) and (k in w):
                tmp.append(-var_label(u, w, k))
            if (k in u) and (k in v) and (k not in w):
                tmp.append(-var_label(u, v, k))
        constraints.append(tmp)

print("Total number of variables:", _num_vars)
print("Total number of constraints:", len(constraints))

# Change this to the file path for wherever you want to output the CNF file
fp = "C:\\Users\person\\folder\\subfolder\\instance_" + str(m) + "," + str(t) + ".in"

f = open(fp, "w")
f.write("p cnf " + str(_num_vars) + " " + str(len(constraints)) + "\n")
for c in constraints:
    f.write(" ".join(str(v) for v in c) + " 0\n")
f.close()
print("Created CNF-file:", fp)

def convert_solution(foo, m, t):
    ret = []
    for u in combinations(range(m), t):
        tmp = []
        for i in range(m):
            if i not in u:
                tmp.append(0)
            else:
                if var_label(u, i) in foo:
                    tmp.append(1)
                else:
                    tmp.append(2)
        ret.append(tmp)
    return ret

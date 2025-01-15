from z3 import *

# Declare variables
n = Int('n')                        # Length of the string
s = Array('s', IntSort(), IntSort())  # Array to represent the string as ASCII values
ind = Int('ind')                     # First ':' after '['
bind = Int('bind')                   # Second ':' before ']'

# ASCII values of characters
open_bracket = 91  # '['
close_bracket = 93  # ']'
colon = 58          # ':'
pipe = 124          # '|'

# Declare constraints
constraints = []

# Valid indices for `ind` and `bind`
constraints.append(And(ind >= 0, ind < n))
constraints.append(And(bind >= 0, bind < n))

# There exists a '[' before `ind`
p = Int('p')
constraints.append(
    Exists([p], And(p >= 0, p < ind, Select(s, p) == open_bracket))
)

# There exists a ']' after `bind`
q = Int('q')
constraints.append(
    Exists([q], And(q > bind, q < n, Select(s, q) == close_bracket))
)

# Conditions for colons
constraints.append(Select(s, ind) == colon)   # s[ind] must be ':'
constraints.append(Select(s, bind) == colon) # s[bind] must be ':'

# Ensure `ind` occurs before `bind`
constraints.append(ind < bind)

# Count the number of '|' between `ind` and `bind`
ans = Int('ans')
i = Int('i')
constraints.append(
    ans == 4 + Sum([If(And(i > ind, i < bind, Select(s, i) == pipe), 1, 0) for i in range(n)])
)

# Output is `-1` if conditions are not met
failure_conditions = Or(
    Not(Exists([p], And(p >= 0, p < ind, Select(s, p) == open_bracket))),
    Not(Exists([q], And(q > bind, q < n, Select(s, q) == close_bracket))),
    ind >= bind
)
constraints.append(
    Implies(failure_conditions, ans == -1)
)

# Create solver
solver = Solver()
solver.add(constraints)

# Check satisfiability
if solver.check() == sat:
    model = solver.model()
    print(f"Answer: {model[ans]}")
else:
    print("Unsatisfiable")

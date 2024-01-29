import numpy as np

N = 8
power = 2 ** N

s = set()
dup = 0
i = 0
for i in range(1000):
    b = tuple(np.random.randint(2, size=N))
    if b in s:
        dup += 1
    else:
        s.add(b)
        if len(s) == power:
            break

print(dup / i, len(s), power / i)

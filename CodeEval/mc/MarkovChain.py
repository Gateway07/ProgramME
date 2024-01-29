import matplotlib.pyplot as plt
import numpy as np

plt.rcParams['figure.figsize'] = [10, 6]
np.random.seed(42)

state_space = ("sunny", "cloudy", "rainy")
transition_matrix = np.array(((0.6, 0.3, 0.1),
                              (0.3, 0.4, 0.3),
                              (0.2, 0.3, 0.5)))
n_steps = 20000
states = [0]
start = np.array([0, 1, 0])
for i in range(n_steps):
    states.append(np.random.choice((0, 1, 2), p=transition_matrix[states[-1]]))
    start = start.dot(transition_matrix)

states = np.array(states)

def despine(ax, spines=('top', 'left', 'right')):
    for spine in spines:
        ax.spines[spine].set_visible(False)

fig, ax = plt.subplots()
width = 1000
offsets = range(1, n_steps, 5)
for i, label in enumerate(state_space):
    p = []
    for offset in offsets:
        p.append(np.sum(states[:offset] == i) / offset)
    ax.plot(offsets, p, label=label)

ax.set_xlabel("number of steps")
ax.set_ylabel("likelihood")
ax.legend(frameon=False)
despine(ax, ('top', 'right'))
plt.show()

import matplotlib.pyplot as plt
import numpy as np
from numpy.typing import NDArray

def prob(x: NDArray[float]):
    return np.exp(-0.5 * np.sum(x ** 2))

def proposal_step(x: NDArray[float], step_size) -> NDArray[float]:
    return np.random.uniform(low=x - 0.5 * step_size, high=x + 0.5 * step_size, size=x.shape)

def acceptance_step(x_new: NDArray[float], x_old: NDArray[float]):
    delta = prob(x_new) / prob(x_old)
    return min(1, delta)

def transition_matrix(target_distribution, proposal_distribution, num_states):
    P = np.zeros((num_states, num_states))

    for i in range(num_states):
        for j in range(num_states):
            q_ij = proposal_distribution(j, i)  # Proposal probability from j to i
            alpha_ij = min(1, (target_distribution[j] * q_ij) / (target_distribution[i] * proposal_distribution(i, j)))
            P[i, j] = q_ij * alpha_ij

        P[i, :] /= np.sum(P[i, :])  # Normalize row to ensure the sum is 1

    return P

def estimate_transition_matrix(samples: NDArray[float]):
    min = samples.min()
    max = samples.max()

    num_states = int(max - min) + 1
    transition_counts = np.zeros((num_states, num_states))

    # Count transitions in the samples
    shift = int(num_states / 2)
    for i in range(len(samples) - 1):
        current_state = int(samples[i]) + shift
        next_state = int(samples[i + 1]) + shift
        transition_counts[current_state, next_state] += 1

    # Normalize to obtain transition probabilities
    matrix = transition_counts / np.sum(transition_counts, axis=1, keepdims=True)
    return matrix

def do_sample(x_old: NDArray[float], step_size):
    x_new = proposal_step(x_old, step_size)
    # random number uniformly from [0,1] and compare it with the acceptance probability
    accept = np.random.random() < acceptance_step(x_new, x_old)
    if accept:
        return accept, x_new
    return accept, x_old

def do_chain(init: NDArray[float], step_size, n_total):
    n_accepted = 0
    chain = [init]
    for _ in range(n_total):
        accept, state = do_sample(chain[-1], step_size)
        chain.append(state)
        n_accepted += accept

    acceptance_rate = n_accepted / float(n_total)
    return chain, acceptance_rate

chain, acceptance_rate = do_chain(np.array([2.0]), 1.0, 1000)
chain = [state for state, in chain]
matrix = estimate_transition_matrix(np.array(chain))
print("Acceptance rate: {:.3f}".format(acceptance_rate))

last_states = ", ".join("{:.5f}".format(state) for state in chain[-10:])
print("Last ten states of chain: " + last_states)

def plot_samples(chain, prob_fun, ax, xlims=(-5, 5)):
    ax.hist(chain, bins=50, density=True, label="MCMC samples", orientation='vertical')
    xses = np.linspace(xlims[0], xlims[1], 1000)
    yses = [prob_fun(x) for x in xses]

    ax.plot(xses, yses, label="True distribution")
    ax.legend(frameon=False)

def sample_and_display(init_state, stepsize, n_total, n_burnin):
    chain, acceptance_rate = do_chain(init_state, stepsize, n_total)
    print("Acceptance rate: {:.3f}".format(acceptance_rate))

    fig, ax = plt.subplots()
    plot_samples([state for state, in chain[n_burnin:]], prob, ax)

    plt.show()

sample_and_display(np.array([2.0]), 30, 10000, 500)

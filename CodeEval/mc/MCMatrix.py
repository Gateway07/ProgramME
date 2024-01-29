import numpy as np

def metropolis_hastings(initial_state, proposal_matrix, num_samples):
    current_state = initial_state
    samples = [current_state]

    for _ in range(num_samples):
        # Propose a new state based on the proposal distribution
        proposed_state = np.random.choice(len(proposal_matrix), p=proposal_matrix[current_state])

        # Accept or reject the proposed state
        acceptance_ratio = min(1, proposal_matrix[proposed_state][current_state] / proposal_matrix[current_state][proposed_state])
        if np.random.rand() < acceptance_ratio:
            current_state = proposed_state

        samples.append(current_state)

    return samples

# Example
proposal_matrix = np.array([[0.5, 0.5], [0.5, 0.5]])  # Symmetric proposal matrix
initial_state = 0
num_samples = 1000

samples = metropolis_hastings(initial_state, proposal_matrix, num_samples)

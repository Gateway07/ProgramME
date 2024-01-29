import numpy as np

def knapsack_metropolis(values, weights, capacity, N):
    num_items = len(values)
    current_solution = np.random.randint(2, size=num_items)  # Random initial solution
    success = 0
    for _ in range(N):
        # Propose a new solution by flipping the state of a randomly selected item
        proposed_solution = current_solution.copy()
        flip_index = np.random.randint(num_items)
        proposed_solution[flip_index] = 1 - proposed_solution[flip_index]

        # Calculate the total value and weight for the current and proposed solutions
        current_value = np.sum(current_solution * values)

        proposed_value = np.sum(proposed_solution * values)
        proposed_weight = np.sum(proposed_solution * weights)

        # Check if the proposed solution is feasible and improves the current solution
        if proposed_weight <= capacity and proposed_value > current_value:
            current_solution = proposed_solution.copy()
            success += 1

    return np.sum(current_solution * values), current_solution, success

# Example
values = [60, 100, 120]
weights = [10, 20, 30]
capacity = 50
N = 10000

best_value, best_selection, success = knapsack_metropolis(values, weights, capacity, N)
print(success)
print("Best value:", best_value)
print("Best selection (1 indicates inclusion, 0 indicates exclusion):", best_selection)

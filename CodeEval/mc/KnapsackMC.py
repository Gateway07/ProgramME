import numpy as np

def knapsack_monte_carlo(v, w, W, N):
    num_items = len(v)
    best_value = 0
    best_selection = None

    for _ in range(N):
        # Generate a random binary selection (0 or 1) for each item
        selection = np.random.randint(2, size=num_items)

        # Calculate the total value and weight for the current selection
        total_value = np.sum(selection * v)
        total_weight = np.sum(selection * w)

        # Check if the selection is feasible and improves the best solution
        if total_weight <= W and total_value > best_value:
            best_value = total_value
            best_selection = selection.copy()

    return best_value, best_selection

# Example
values = [60, 100, 120]
weights = [10, 20, 30]
capacity = 50
num_samples = 10000

best_value, best_selection = knapsack_monte_carlo(values, weights, capacity, num_samples)

print("Best value:", best_value)
print("Best selection (1 indicates inclusion, 0 indicates exclusion):", best_selection)

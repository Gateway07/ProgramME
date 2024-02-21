from collections import namedtuple

import numpy as np

Item = namedtuple("Item", ["value", "weight"])

def dp_vectorization(items: [Item], capacity: int):
    dp = np.zeros((capacity + 1, len(items) + 1), dtype=np.uint32)

    for i in range(len(items)):
        dp[:items[i].weight, i + 1] = dp[:items[i].weight, i]
        prev_value = dp[:-items[i].weight, i] + items[i].value
        dp[items[i].weight:, i + 1] = np.maximum(dp[items[i].weight:, i], prev_value)

    return dp[capacity][len(items)]

if __name__ == '__main__':
    items = [Item(60, 10), Item(100, 20), Item(120, 30)]

    print(dp_vectorization(items, 50))

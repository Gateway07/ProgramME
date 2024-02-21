database = {"Ivanov": 25, "Petrov": 100, "Sidorov": 5}
query = "Pvanov"  # note the typo in query

def hamming_distance(query: str, key: str) -> int:
    distance = 0
    for i, _ in enumerate(query):
        if query[i] != key[i]:
            distance += 1

    return distance

def similarity(query: str, key: str) -> float:
    return 1 - hamming_distance(query, key) / len(query)

# construct a vector of similarities between query and keys
# similarity=1 if query=key;
# similarity=0 if there is nothing in common between query and key
similarities = {}
for key in database:
    similarities[key] = similarity(key, query)

print(f"Similarities before softmax: {similarities}")

output = 0
for key, value in database.items():
    output += similarities[key] * value

print(output)

# However, note that the sum of similarities in previous solution was more than 1.
# We probably want to preserve the sum of similarities equal to 1.
# Hence, apply Softmax to similarities vector to normalize it.
import math

def softmax(weights: dict) -> dict:
    """Transform a dict of weights into a dict with sum of weights normalized to 1."""
    # Calculate statistical sum (softmax denominator)
    sum = 0
    for key, weight in weights.items():
        sum += math.exp(weight)

    return {key: math.exp(weight) / sum for key, weight in weights.items()}

similarities = softmax(similarities)
print(f"Similarities after softmax: {similarities}")

output = 0
for key, value in database.items():
    output += similarities[key] * value

output

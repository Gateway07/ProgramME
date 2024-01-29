import random

# Lets define our Beta Function to generate s for any particular state. We don't care for the normalizing constant here.
def beta_s(w, a, b):
    return w ** (a - 1) * (1 - w) ** (b - 1)

# This Function runs the MCMC chain for Beta Distribution.
def beta_mcmc(a, b, N):
    states = []
    cur = random.uniform(0, 1)
    for _ in range(0, N):
        states.append(cur)
        next = random.uniform(0, 1)

        p = min(beta_s(next, a, b) / beta_s(cur, a, b), 1)  # Calculate the acceptance probability
        unif = random.uniform(0, 1)
        if not unif >= p:
            cur = next

    return states[-1000:]  # Returns the last 100 states of the chain

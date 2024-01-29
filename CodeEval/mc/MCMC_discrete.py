import matplotlib.pyplot as plt
import numpy as np

# Likelihood function (probability of data given parameters)
def likelihood(data, probs):
    observed_counts = np.bincount(data, minlength=len(probs))
    return np.prod(probs ** observed_counts)

# Posterior distribution of parameters
def posterior(data, probs):
    observed_counts = np.bincount(data, minlength=len(probs))
    return np.prod(probs ** observed_counts)

# Metropolis-Hastings algorithm for discrete parameters
def metropolis_hastings_discrete(data, num_samples):
    samples = []
    current_probs = np.array([0.4, 0.4, 0.2])  # Initial guess for probabilities

    for _ in range(num_samples):
        # Propose new parameters
        proposed_probs = current_probs + np.random.normal(0, 0.1, len(current_probs))
        proposed_probs = np.clip(proposed_probs, 0, 1)  # Ensure probabilities are within [0, 1]
        proposed_probs /= np.sum(proposed_probs)  # Normalize to ensure a valid probability distribution

        # Calculate acceptance ratio
        acceptance_ratio = min(1, posterior(data, proposed_probs) / posterior(data, current_probs))

        # Accept or reject the proposed parameters
        if np.random.rand() < acceptance_ratio:
            current_probs = proposed_probs

        samples.append(current_probs.copy())

    return np.array(samples)

# Number of MCMC samples
num_samples = 10000
# True parameters of the discrete distribution
true_probs = np.array([0.2, 0.5, 0.3])  # Example probabilities for three discrete values

# Observed data
np.random.seed(42)
observed_data = np.random.choice([0, 1, 2], size=100, p=true_probs)

# Run Metropolis-Hastings algorithm for discrete parameters
samples = metropolis_hastings_discrete(observed_data, num_samples)

# Plotting the results
plt.figure(figsize=(10, 4))

# Plotting the posterior distribution of discrete probabilities
for i in range(len(true_probs)):
    plt.hist(samples[:, i], bins=50, density=True, alpha=0.5, label=f"Posterior Probability {i}")

plt.xlabel("Probability")
plt.ylabel("Density")
plt.legend()

plt.tight_layout()
plt.show()

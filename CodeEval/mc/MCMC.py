import matplotlib.pyplot as plt
import numpy as np

# True parameter of the quadratic function
true_a = 2.0

# Observed data with noise
np.random.seed(42)
observed_data_x = np.linspace(0, 10, 100)
observed_data_y = true_a * observed_data_x ** 2 + np.random.normal(0, 5, 100)

# Likelihood function (probability of data given parameter)
def likelihood(data_y, x, a, std):
    expected_y = a * x ** 2
    return np.prod(np.exp(-0.5 * ((data_y - expected_y) / std) ** 2) / np.sqrt(2 * np.pi * std ** 2))

# Prior distribution of the parameter
def prior(a):
    return np.exp(-0.5 * (a - 2.0) ** 2) / np.sqrt(2 * np.pi * 1.0 ** 2)

# Posterior distribution of the parameter
def posterior(data_y, x, a, std):
    return likelihood(data_y, x, a, std) * prior(a)

# Metropolis-Hastings algorithm
def metropolis_hastings(data_y, x, num_samples):
    samples = []
    current_a = 1.0

    for _ in range(num_samples):
        # Propose new parameter
        proposed_a = np.random.normal(current_a, 0.5)

        # Calculate acceptance ratio
        acceptance_ratio = min(1, posterior(data_y, x, proposed_a, 5.0) /
                               posterior(data_y, x, current_a, 5.0))

        # Accept or reject the proposed parameter
        if np.random.rand() < acceptance_ratio:
            current_a = proposed_a

        samples.append(current_a)

    return np.array(samples)

# Number of MCMC samples
num_samples = 10000

# Run Metropolis-Hastings algorithm
samples = metropolis_hastings(observed_data_y, observed_data_x, num_samples)

# Plotting the results
plt.figure(figsize=(10, 4))

# Plotting the posterior distribution of the parameter 'a'
plt.hist(samples, bins=50, density=True, alpha=0.5, label="Posterior 'a'")
plt.axvline(true_a, color='red', linestyle='dashed', linewidth=2, label="True 'a'")
plt.xlabel("Parameter 'a'")
plt.ylabel("Density")
plt.legend()

plt.tight_layout()
plt.show()

import random

def f(x):
    return x ** 2  # Example function, modify as needed

def anti_deriv_f(x):
    return (x ** 3) / 3

def monte_carlo_integration(a, b, num_samples):
    total = 0

    for _ in range(num_samples):
        x = random.uniform(a, b)
        total += f(x)

    average = total / num_samples
    result = (b - a) * average
    return result

# Example usage
a, b = -1, 1  # Domain of integration
num_samples = 100000
estimated_integral = monte_carlo_integration(a, b, num_samples)
print("Estimated Integral:", estimated_integral)
print("Actual Integral:", anti_deriv_f(b) - anti_deriv_f(a))

package org.pme.example;

public class GCD {
    int gcd(int a, int b) {
        assert a > 0 && b > 0; // Pre-condition

        int result = a, x = b, old = Math.max(result, x);
        while (result != x) { // Exit-condition
            // Invariant-condition
            assert gcd(result, x) == gcd(a, b);

            int next = result > x ? (result = result - x) : (x = x - result);

            assert next < old; // Termination-condition
            old = next;
        }
        return result;
    }
}

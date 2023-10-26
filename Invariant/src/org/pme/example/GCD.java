package org.pme.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GCD {
    static int gcd(int a, int b) {
        assert a > 0 && b > 0; // Pre-condition
        // assert gcd(a, a) == a && gcd(b, b) == b;

        int result = a, x = b, old = Math.max(result, x);
        while (result != x) { // Exit-condition
            // Invariant-condition
            // assert gcd(result, x) == gcd(a, b);

            int next = result > x ? (result = result - x) : (x = x - result);

            assert next < old || result == x; // Termination-condition
            old = next;
        }
        return result;
    }

    @Test
    public void test() {
        assertThrows(AssertionError.class, () -> gcd(-1, -1), (String) null); // pre-condition case

        assertEquals(gcd(6, 3), 3);
        assertEquals(gcd(6, 9), 3);
    }
}

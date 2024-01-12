package org.pme.example.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.pme.example.GCD;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GCD_ChatUniTest2 {

    @Test
    @Timeout(8000)
    public void testGCD() {
        GCD gcd = new GCD();

        // Test case 1: a is greater than b
        int actualGCD = gcd.gcd(12, 8);
        assertEquals(4, actualGCD);

        // Test case 2: b is greater than a
        actualGCD = gcd.gcd(8, 12);
        assertEquals(4, actualGCD);

        // Test case 3: a and b are equal
        actualGCD = gcd.gcd(10, 10);
        assertEquals(10, actualGCD);

        // Test case 4: a is 0
        assertThrows(AssertionError.class, () -> gcd.gcd(-1, 10));

        // Test case 5: b is 0
        assertThrows(AssertionError.class, () -> gcd.gcd(10, -1));
    }
}
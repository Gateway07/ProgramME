package org.pme.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GCD_ChatUniTest3 {

    @Test
    @Timeout(8000)
    void gcdTest() throws Exception {
        // Create a object of the GCD class
        GCD t = new GCD();

        // Test gcd method with various inputs
        assertEquals(3, t.gcd(9, 6));
        assertEquals(1, t.gcd(17, 8));
        assertEquals(5, t.gcd(25, 15));
        assertEquals(6, t.gcd(18, 12));
    }
}
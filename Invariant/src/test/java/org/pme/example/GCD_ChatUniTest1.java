package org.pme.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GCD_ChatUniTest1 {

    @Test
    @Timeout(8000)
    public void testGCD() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // Create an instance of the GCD class
        GCD gcd = new GCD();

        // Test case 1: a = 12, b = 8
        int result1 = gcd.gcd(12, 8);
        assertEquals(4, result1);

        // Test case 2: a = 17, b = 5
        int result2 = gcd.gcd(17, 5);
        assertEquals(1, result2);
    }
}
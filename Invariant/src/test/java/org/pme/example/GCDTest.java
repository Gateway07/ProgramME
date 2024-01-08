package org.pme.example;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GCDTest {

    @Test
    public void test0() {
        GCD t = new GCD();
        assert t.gcd(903, 501) == 3;
        assert t.gcd(6, 3) == 3;
        assert t.gcd(6, 9) == 3;

        assert t.lcm(3, 4) == 12;
        assert t.lcm(3, 9) == 9;
        assert t.lcm(5, 12) == 60;

        for (var a : IntStream.range(1, 11).toArray()) {
            for (var b : IntStream.range(1, 10).toArray()) {
                assert t.gcd(a, b) == (a > b ? t.gcd(a - b, b) : t.gcd(a, b - a));
                assert t.gcd(a, a) == a && t.gcd(b, b) == b;
            }
        }
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        GCD t = new GCD();
        int int0 = t.gcd(1917, 869);
        assertEquals(1, int0);
    }
}

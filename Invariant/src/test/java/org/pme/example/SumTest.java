package org.pme.example;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {
    @Test(timeout = 4000)
    public void test() {
        Sum t = new Sum();
        assertEquals(t.sum(1, 4), 1 + 4);  // odd case
        assertEquals(t.sum(3, 11), (3 + 11) / 2); // even case (with break)
        assertEquals(t.sum(11, 3), 14); // even case (when x1 > x2)

        for (var x1 : IntStream.range(1, 11).toArray()) {
            for (var x2 : IntStream.range(0, 10).toArray()) {
                int result = t.sum(x1, x2);
                int y = x1 > x2 || x1 % 2 != x2 % 2 ? 0 : result;
                assertEquals(x1 + x2, result + y);
            }
        }
    }

    @Test
    public void test0() throws Throwable {
        Sum t = new Sum();
        int int0 = t.sum(1, 3688);
        assertEquals(3689, int0);
    }
}

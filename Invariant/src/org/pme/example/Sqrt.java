package org.pme.example;

import org.junit.Test;
import org.pme.Function;
import org.pme.Predicate;

import java.util.List;

public class Sqrt {

    @Predicate()
    boolean isSqrt(double a, double b) {
        return a * a == b;
    }

    @Function("SELECT a FROM Sqrt WHERE b = ?")
    Iterable<Double> getA(double b) {
        final double sqrt = Math.sqrt(b);
        return List.of(sqrt, -sqrt);
    }

    @Test
    public void test() {
        for (Double res : getA(4))
            assert isSqrt(res, 4);
    }

}

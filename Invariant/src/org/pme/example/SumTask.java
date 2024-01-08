package org.pme.example;

import org.junit.Test;
import org.pme.Function;
import org.pme.Predicate;

public class SumTask {
    @Predicate
    boolean isSum(int a, int b, int sum) {
        return a + b == sum;
    }

    @Function("SELECT a FROM Sum WHERE b = ? AND sum = ?")
    int getA(int b, int sum) {
        return sum - b;
    }

    @Test // Test - to be generated as output
    public void test() {
        int b = 50000;
        int sum = 174653;

        assert isSum(getA(b, sum), b, sum);
    }

}

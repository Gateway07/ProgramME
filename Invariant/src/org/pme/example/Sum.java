package org.pme.example;

@SuppressWarnings({"ReassignedVariable", "SuspiciousNameCombination"})
public class Sum {

    public int sum(int x1, int x2) {
        assert x1 >= 0 && x2 >= 0; // pre-condition

        int result = x1, y = x2;
        while (y > 0) { // Exit-condition
            // Invariant: assert sum(x1, x2) == sum(result, y);
            assert x1 + x2 == result + y;
            if (y == result)
                break;

            y--;
            result++;
        }
        // post-condition
        assert y == (x1 > x2 || x1 % 2 != x2 % 2 ? 0 : result);
        assert x1 + x2 == result + y;
        return result;
    }

    // Task - verification predicate
    boolean f(int x, int a, int b) {
        return sum(x, a) == b;
    }

    // Solution to the task - generation function
    int g(int a, int b) {
        return b - a; // x = b - a
    }

    void test() {
        int a = 50000;
        int b = 174653;

        assert f(g(a, b), a, b);
    }
}

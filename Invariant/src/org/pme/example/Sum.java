package org.pme.example;

import org.pme.Assert;
import org.pme.Test;

@SuppressWarnings({"ReassignedVariable", "SuspiciousNameCombination"})
public class Sum {
    public static void main(String[] args) {
        new Sum().test();
    }

    @Test
    public void test() {
        Assert.assertThrows(null,           // pre-condition case
                AssertionError.class, () -> sum(-1, 0));
        Assert.assertEquals(sum(0, 1), 1);  // success case
        Assert.assertEquals(sum(1, 11), 6); // break case
    }

    int sum(int x1, int x2) {
        assert x1 >= 0 && x2 >= 0; // pre-condition

        int result = x1, y = x2;
        while (y > 0) { // Exit-condition
            // Invariant-condition before break
            assert y != result && sum(x1, y) == sum(result, y);
            if (y == result)
                break;

            // Invariant-condition after break
            assert sum(x1, y) == sum(result, y);
            y--;
            result++;
        }
        assert result == x1 + x2; // post-condition
        return result;
    }
}

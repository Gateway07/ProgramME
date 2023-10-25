package org.pme.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SuppressWarnings({"ReassignedVariable", "SuspiciousNameCombination"})
public class Sum {
    @Test
    public void test() {
        assertThrows(AssertionError.class, () -> sum(-1, 0), (String) null); // pre-condition case

        assertEquals(sum(1, 4), 1 + 4);  // odd case
        assertEquals(sum(3, 11), (3 + 11) / 2); // even case (with break)
        assertEquals(sum(11, 3), 14); // even case (when x1 > x2)
    }

    int sum(int x1, int x2) {
        assert x1 >= 0 && x2 >= 0; // pre-condition

        int result = x1, y = x2;
        while (y > 0) { // Exit-condition
            // Invariant-condition
            // assert sum(x1, x2) == sum(result, y);
            if (y == result)
                break;

            y--;
            result++;
        }
        // post-condition
        assert x1 + x2 == result + y;
        assert x1 + x2 == result + (x1 > x2 || x1 % 2 != x2 % 2 ? 0 : result);
        return result;
    }
}

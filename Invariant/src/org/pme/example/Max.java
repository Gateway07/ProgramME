package org.pme.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.pme.Common.range;

public class Max {
    static <T extends Comparable> T max_one_way(T[] a) {
        assert a != null && a.length > 1; // pre-condition

        int i = 0, old = a.length - i;
        T result = a[i];
        while (i < a.length) {
            assert 0 <= i && result == max_one_way(range(a, 0, i)); // invariant
            if (result.compareTo(a[i]) == -1)
                result = a[i];
            i++;

            int next = a.length - i;
            assert next < old; // termination-condition
            old = next;
        }
        return result;
    }

    static <T extends Comparable> T max_two_way(T[] a) {
        assert a != null && a.length > 1; // pre-condition

        int i = 0, j = a.length - 1, old = j - i;
        while (i != j) {
            assert 0 <= i && i <= j && j < a.length && max_two_way(a) == max_two_way(range(a, 0, i)); // invariant
            if (a[i].compareTo(a[j]) == 1)
                j = j - 1;
            else
                i = i + 1;

            int next = j - i;
            assert next < old; // termination-condition
            old = next;
        }
        return a[i];
    }

    @Test
    public void test() {
        assertThrows(AssertionError.class, () -> max_one_way(new Integer[0]), (String) null); // pre-condition case

        assertEquals(max_one_way(new Integer[]{1, 4, 3, 10, -2}), (Integer) 10);
        assertEquals(max_two_way(new Integer[]{1, 4, 3, 10, -2}), (Integer) 10);
    }
}

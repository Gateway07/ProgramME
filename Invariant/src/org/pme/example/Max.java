package org.pme.example;

import static org.pme.Common.range;

public class Max {
    <T extends Comparable<T>> T max_one_way(T[] a) {
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

    <T extends Comparable<T>> T max_two_way(T[] a) {
        assert a != null && a.length > 1; // pre-condition

        int i = 0, j = a.length - 1, old = j - i;
        while (i != j) {
            assert 0 <= i && i <= j && j < a.length && max_two_way(a) == max_two_way(range(a, 0, i)); // invariant
            if (a[i].compareTo(a[j]) == 1)
                j--;
            else
                i++;

            int next = j - i;
            assert next < old; // termination-condition
            old = next;
        }
        return a[i];
    }
}

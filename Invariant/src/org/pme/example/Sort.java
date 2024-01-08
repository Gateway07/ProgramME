package org.pme.example;

import org.pme.Predicate;

public interface Sort {
    @Predicate
    default boolean isGt(int a, int b) {
        return a > b;
    }

    @Predicate
    default boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!isGt(arr[i], arr[i + 1]))
                return false;
        }
        return true;
    }
}

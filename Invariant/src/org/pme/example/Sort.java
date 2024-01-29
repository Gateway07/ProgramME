package org.pme.example;

import org.pme.Axiom;

public interface Sort {
    @Axiom
    default boolean isGt(int a, int b) {
        return a > b;
    }

    @Axiom
    default boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!isGt(arr[i], arr[i + 1]))
                return false;
        }
        return true;
    }
}

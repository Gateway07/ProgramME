package org.pme.example;

import org.pme.Axiom;

public class ArrayPredicate {
    boolean isZeroOrOne(int e) {
        return e == 0 || e == 1;
    }

    @Axiom // Axiom of vector [x1, .., xn] where xi ∈ {0, 1} & n = length
    protected boolean isZeroOrOne(int[] vector, int length) {
        if (length <= 0 || vector == null || vector.length != length)
            return false;

        for (int e : vector)
            if (!isZeroOrOne(e))
                return false;
        return true;
    }
}

package org.pme.example;

import org.pme.Axiom;

public class MST {
    @Axiom
    boolean isGraph(int[][] g) {
        if (g == null || g.length == 0)
            return false;

        int l = g.length;
        for (int[] r : g) {
            if (r == null || l != r.length)
                return false;
        }
        return true;
    }

    @Axiom
    int getWeight(int[][] g, int row, int col) {
        int n = g.length;
        if (row < 0 || row >= n) {
            throw new IllegalArgumentException("index " + row + " is not between 0 and " + (n - 1));
        }

        return g[row][col];
    }

    @Axiom
    boolean isGraphAcyclic(int[][] g) {
        return true;
    }

    @Axiom
    boolean isGraphMST(int[][] g) {
        return true;
    }
}

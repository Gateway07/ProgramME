package org.pme.example;

public class MST {
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

    int getWeight(int[][] g, int row, int col) {
        int n = g.length;
        if (row < 0 || row >= n) {
            throw new IllegalArgumentException("index " + row + " is not between 0 and " + (n - 1));
        }

        return g[row][col];
    }

    boolean isGraphAcyclic(int[][] g) {
        return true;
    }

    boolean isGraphMST(int[][] g) {
        return true;
    }
}

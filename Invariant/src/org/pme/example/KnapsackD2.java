package org.pme.example;

import org.junit.Test;
import org.pme.Function;
import org.pme.T5;

import java.util.ArrayList;

public class KnapsackD2 {
    public static final int V_SUM_MAX = 1000;
    public static final int N_MAX = 100;
    public static final int W_MAX = 10000000;

    int maxWeight(int[] w, int[] v, int n, int C) {
        int[][] dp = new int[V_SUM_MAX + 1][N_MAX + 1];
        for (int i = 0; i <= V_SUM_MAX; i++) for (int j = 0; j <= n; j++) dp[i][j] = W_MAX;
        for (int i = 0; i <= n; i++) dp[0][i] = 0;

        // iterate over subproblems ans get the current value from previous computation
        for (int i = 1; i <= V_SUM_MAX; i++) {
            for (int j = 1; j <= n; j++) {
                var p = i >= v[j - 1] ? w[j - 1] + dp[i - v[j - 1]][j - 1] : W_MAX;
                dp[i][j] = Math.min(dp[i][j - 1], p);
            }
        }

        // Finding maximum value
        for (int i = V_SUM_MAX; i >= 0; i--)
            if (dp[i][n] <= C)
                return i;

        return 0;
    }

    int zeroOne(int[] w, int[] v, int n, int W) {
        int[] m = new int[W + 1];

        for (int ni = 0; ni < n; ni++) {
            for (int wi = W; wi >= 0; wi--) {
                if (w[ni] <= wi) {
                    var prevMax = m[wi - w[ni]];
                    if (m[wi] < prevMax + v[ni]) {
                        m[wi] = prevMax + v[ni];
                    }
                }
            }
        }
        return m[W];
    }
    
    /*
    DP: Simple 1D array, say dp[W+1] can be used such that dp[i] stores the maximum value which can achieved using all items and i
    capacity of knapsack. Note that we use 1D array here which is different from classical knapsack where we used 2D array.

    dp[i] = 0
    dp[i] = max(dp[i], dp[i-wt[j]] + val[j] where j varies from 0 to n-1 such that: wt[j] <= i
    result = d[W]
     */
    int unbounded1D(int[] w, int[] v, int n, int W) {
        int[] m = new int[W + 1];

        for (int wi = 0; wi <= W; wi++) {
            for (int ni = 0; ni < n; ni++) {
                if (w[ni] <= wi) {
                    int prevMax = m[wi - w[ni]];
                    if (m[wi] < prevMax + v[ni])
                        m[wi] = prevMax + v[ni];
                }
            }
        }
        return m[W];
    }

    int zeroOne2D(int[] w, int[] v, int n, int W) {
        int[][] m = new int[n + 1][W + 1];
        for (int ni = 0; ni <= n; ni++) {
            for (int wi = 0; wi <= W; wi++) {
                if (ni == 0 || wi == 0)
                    m[ni][wi] = 0;
                else {
                    if (w[ni - 1] <= wi) {
                        int prevMax = m[ni - 1][wi - w[ni - 1]];
                        if (m[ni - 1][wi] < v[ni - 1] + prevMax)
                            m[ni][wi] = v[ni - 1] + prevMax;
                    }
                    m[ni][wi] = m[ni - 1][wi];
                }
            }
        }

        return m[n][W];
    }

    int unbounded2D(int[] w, int[] v, int n, int W) {
        int[][] m = new int[n + 1][W + 1];
        for (int ni = 0; ni <= n; ni++) {
            for (int wi = 0; wi <= W; wi++) {
                if (ni == 0 || wi == 0)
                    m[ni][wi] = 0;
                else {
                    if (w[ni - 1] <= wi) {
                        int prevMax = m[ni][wi - w[ni - 1]];
                        if (m[ni - 1][wi] < v[ni - 1] + prevMax)
                            m[ni][wi] = v[ni - 1] + prevMax;
                    }
                    m[ni][wi] = m[ni - 1][wi];
                }
            }
        }
        return m[n][W];
    }

    @Function
    int dot(int a, int b) {
        return a * b;
    }

    @Function
    int dot(int[] a, int[] b) {
        int s = 0;
        for (int i = 0; i < Math.min(a.length, b.length); i++)
            s += dot(a[i], b[i]);
        return s;
    }

    @Test
    public void testGenerate() {
        var geZero = new ArrayList<int[]>();
        geZero.add(new int[]{1, 2, 3, 4, 5});
        geZero.add(new int[]{1, 1, 1, 1, 1});
        geZero.add(new int[]{8, 5, 9, 1, 5});
        geZero.add(new int[]{9, 0, 1, 3, 1});

        var oneOrZero = new ArrayList<int[]>();
        oneOrZero.add(new int[]{1, 0, 0, 0, 1});
        oneOrZero.add(new int[]{1, 1, 1, 1, 1});
        oneOrZero.add(new int[]{1, 0, 0, 1, 1});
        oneOrZero.add(new int[]{0, 0, 1, 0, 1});
        oneOrZero.add(new int[]{1, 1, 0, 1, 1});
        oneOrZero.add(new int[]{0, 1, 1, 0, 1});

        var table = new ArrayList<T5>();
        for (var n : oneOrZero) {
            for (var wz : geZero) {
                for (var vz : geZero) {
                    var W = dot(wz, n);
                    var V = dot(vz, n);
                    var max = zeroOne(wz, vz, wz.length, W);
                    System.out.println(new T5(wz, vz, wz.length, W, max));
                }
            }
        }
    }

    @Test
    public void test() {
        var ks = new KnapsackD2();

        assert ks.unbounded2D(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}, 4, 3) == 3;
        assert ks.unbounded2D(new int[]{5, 10, 15}, new int[]{10, 30, 20}, 3, 100) == 300;

        assert ks.zeroOne2D(new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 1}, 4, 3) == 3;
        assert ks.zeroOne2D(new int[]{3, 4, 5}, new int[]{30, 50, 60}, 3, 8) == 90;
    }
}

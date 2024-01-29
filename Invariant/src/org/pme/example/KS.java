package org.pme.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KS {
    public static void main(String[] args) {
        int W = 9;
        int[] wt = {3, 4, 5};
        int[] val = {30, 50, 60};
        int n = wt.length;

        List<int[]> list = new ArrayList<>();
        var result = knapSack(W, wt, val, n, list);

        System.out.println("Maximum Profits: " + result);
        for (var l : list)
            System.out.println("Indexes: " + Arrays.toString(l));
    }

    public static int knapSack(int W, int[] wt, int[] val, int n, List<int[]> configurations) {
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                } else if (wt[i - 1] <= w) {
                    dp[i][w] = Math.max(val[i - 1] + dp[i - 1][w - wt[i - 1]], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        int maximumProfits = dp[n][W];
        getKnapsackConfigurations(dp, wt, n, W, configurations);

        return maximumProfits;
    }

    private static void getKnapsackConfigurations(int[][] dp, int[] wt, int n, int W, List<int[]> configurations) {
        int w = W;

        for (int i = n; i > 0 && w > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                int[] configuration = new int[n];
                configuration[i - 1] = 1;
                configurations.add(configuration);
                w -= wt[i - 1];
            }
        }
    }
}

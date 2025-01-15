package org.pme.example;

import org.javatuples.Pair;
import org.junit.Test;
import org.pme.Operator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SumTask {
    boolean isSum(int a, int b, int sum) {
        return a + b == sum;
    }

    @Operator("SELECT a FROM Sum WHERE b = :b AND sum = :sum")
    int getA(int b, int sum) {
        return sum - b;
    }

    @Operator("SELECT a, b FROM Sum WHERE sum = :sum AND a >= 0 AND b >= 0")
    Iterable<Pair<Integer, Integer>> getComponents(int sum) {
        var list = new ArrayList<Pair<Integer, Integer>>();
        for (var i = 0; i <= sum; i++)
            list.add(new Pair<>(i, sum - i));
        return list;
    }

    // Sum of summands
    boolean isSum(int sum, int[] summands) {
        return sum == IntStream.of(summands).sum();
    }

    // Summand (positive) combinations with repetition (order doesn't matter)
    private void generateSummands(int sum, List<Integer> current, List<int[]> summands) {
        if (sum == 0) {
            summands.add(current.stream().mapToInt(i -> i).toArray());
            return;
        }
        for (int i = Math.min(sum, current.isEmpty() ? sum : current.get(current.size() - 1)); i >= 1; i--) {
            current.add(i);
            generateSummands(sum - i, current, summands);
            current.remove(current.size() - 1);
        }
    }

    @Operator("SELECT summands FROM Sum WHERE sum = :sum")
    Iterable<int[]> getSummands(int sum) {
        var s = new ArrayList<int[]>();
        generateSummands(sum, new ArrayList<>(), s);
        return s;
    }

    int[] getSortedArray(int[] elements) {
        return IntStream.of(elements).sorted().toArray();
    }

    // Summands (positive) combinations without repetition (order does matter)
    private void generateOrderedSummands(int sum, List<Integer> current, List<int[]> summands) {
        return;
    }

    @Operator("SELECT DISTINCT (SELECT v1 FROM Sum.summands WHERE v1 > 0 ORDER BY v1) FROM Sum WHERE sum = :sum")
        // Summands (positive) combinations without repetition (order does matter)
    Iterable<int[]> getOrderedSummands(int sum) {
        var s = new ArrayList<int[]>();
        generateOrderedSummands(sum, new ArrayList<>(), s);
        return s;
    }

    @Operator("SELECT COUNT(*) FROM Summands(:sum)")
    int getCountSummands(int sum) {
        int[][] dp = new int[sum + 1][sum + 1];

        // Base case: There's one way to make sum 0
        for (int n = 0; n <= sum; n++)
            dp[0][n] = 1;

        // Fill the DP table
        for (int n = 1; n <= sum; n++) {
            for (int s = 1; s <= sum; s++) {
                // Exclude the current number
                dp[s][n] = dp[s][n - 1];
                // Include the current number if it's valid
                if (s >= n) {
                    dp[s][n] += dp[s - n][n];
                }
            }
        }
        return dp[sum][sum];
    }

    @Test
    public void test() {
        int sum = 10;

        var l = new ArrayList<Integer>();
        var s = new ArrayList<int[]>();
        generateSummands(sum, l, s);
        assert s.size() == getCountSummands(sum);
    }

}

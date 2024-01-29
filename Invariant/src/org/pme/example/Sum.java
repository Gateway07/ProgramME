package org.pme.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings({"ReassignedVariable", "SuspiciousNameCombination"})
public class Sum {
    // please make a code to generate list as output of all sequences S of positive integers when fold(S) will be equal to input integer S and fold(S) is addition modulo 2
    // please make a code to generate list A as output of all strings which will be substring of input string S
    // please make a code to generate list as output of all boolean's array with length N as input
    public static List<List<Integer>> generateWeightedIntArraySequences(int S) {
        List<List<Integer>> result = new ArrayList<>();
        generateWeightedIntArraySequencesHelper(S, new ArrayList<>(), result, 1);
        return result;
    }

    private static void generateWeightedIntArraySequencesHelper(int remainingValue, List<Integer> currentSequence, List<List<Integer>> result, int start) {
        if (remainingValue == 0) {
            // If the remaining value is 0, add the current sequence to the result
            result.add(new ArrayList<>(currentSequence));
            return;
        }

        for (int i = start; i <= remainingValue; i++) {
            // Add the current value to the sequence
            currentSequence.add(i);

            // Recursively generate int array sequences for the remaining value
            generateWeightedIntArraySequencesHelper(remainingValue - (i * (i + 1)), currentSequence, result, i + 1);

            // Backtrack: remove the last element for the next iteration
            currentSequence.remove(currentSequence.size() - 1);
        }
    }

    @Test
    public void testFactorization() {
        var list = generateWeightedIntArraySequences(2 * 1 + 4 * 2 + 5 * 3);
        for (var a : list) {
            System.out.println(Arrays.toString(a.stream().mapToInt(Integer::intValue).toArray()));
        }
    }

    public int sum(int x1, int x2) {
        assert x1 >= 0 && x2 >= 0; // pre-condition

        int result = x1, y = x2;
        while (y > 0) { // Exit-condition
            // Invariant: assert sum(x1, x2) == sum(result, y);
            assert x1 + x2 == result + y;
            if (y == result)
                break;

            y--;
            result++;
        }
        // post-condition
        assert y == (x1 > x2 || x1 % 2 != x2 % 2 ? 0 : result);
        assert x1 + x2 == result + y;
        return result;
    }

    // Task - verification predicate
    boolean f(int x, int a, int b) {
        return sum(x, a) == b;
    }

    // Solution to the task - generation function
    int g(int a, int b) {
        return b - a; // x = b - a
    }

    void test() {
        int a = 50000;
        int b = 174653;

        assert f(g(a, b), a, b);
    }
}

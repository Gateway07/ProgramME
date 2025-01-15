package org.pme.example;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class NonZeroSummandsIterator implements Iterator<int[]> {
    private int[] current;
    private boolean first;

    public NonZeroSummandsIterator(int targetSum) {
        this.current = new int[]{targetSum}; // Start with the simplest summand
        this.first = true; // Flag for the first iteration
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public int[] next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more summand");
        }

        if (first) {
            // Return the initial configuration on the first call
            first = false;
            return current.clone();
        }

        // Generate the next partition by modifying `current`
        int sum = 0;
        int i = current.length - 1;

        while (i >= 0 && (current[i] == -1 || current[i] == 1)) {
            sum += current[i];
            i--;
        }

        if (i < 0) {
            // Expand to include another summand when all are exhausted
            int[] newCurrent = new int[current.length + 1];
            System.arraycopy(current, 0, newCurrent, 0, current.length);
            newCurrent[current.length] = 1;
            current = newCurrent;
        }

        // Adjust the current summand configuration to avoid zero
        current[i]--;
        sum += current[i];
        i++;
        while (i < current.length) {
            current[i] = (sum > 0) ? 1 : -1;
            sum -= current[i];
            i++;
        }

        return current.clone();
    }

    public static void main(String[] args) {
        int targetSum = 5; // Example input

        NonZeroSummandsIterator iterator = new NonZeroSummandsIterator(targetSum);

        System.out.println("Non-zero summands for sum " + targetSum + ":");
        int count = 0;
        while (iterator.hasNext() && count < 50) { // Limit output for demonstration
            int[] summands = iterator.next();
            System.out.print("[ ");
            for (int s : summands) {
                System.out.print(s + " ");
            }
            System.out.println("]");
            count++;
        }
    }
}

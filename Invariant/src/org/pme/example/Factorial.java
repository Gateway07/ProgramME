package org.pme.example;

import org.pme.Operator;

public class Factorial {
    @Operator("SELECT 1 AS i, 1 AS factorial UNION \n" +
            "SELECT i+1 AS i, factorial * (i+1) as factorial FROM Factorial WHERE i < 10")
    boolean isFactorial(int i, int factorial) {
        return true;
    }
}

package org.pme.example;

import org.pme.Operator;

import java.util.ArrayList;

public class InStr {
    boolean isSubString(String base, String sub) {
        return base.contains(sub);
    }

    @Operator("SELECT sub FROM SubString WHERE base = :str")
    Iterable<String> getSubStrings(String str) {
        var substrings = new ArrayList<String>();
        int n = str.length();

        // Generate all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                substrings.add(str.substring(i, j));
            }
        }

        return substrings;
    }
}

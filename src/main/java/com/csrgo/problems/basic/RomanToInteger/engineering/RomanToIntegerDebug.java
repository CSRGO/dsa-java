// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.RomanToInteger.engineering;

// Problem Link: https://dsa.csrgo.com/problems/roman-to-integer/
public class RomanToIntegerDebug {

    // TODO: debug this method to fix it
    public static int solve(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int total = 0;
        int n = s.length();

        // Bug 1: Loop condition 'i <= n' causes StringIndexOutOfBoundsException on s.charAt(i)
        for (int i = 0; i < n; i++) {
            int val = charValue(s.charAt(i));

            // Bug 2: Checks val <= next instead of val < next, subtracting on identical characters like 'II'
            if (i + 1 < n && val <= charValue(s.charAt(i + 1))) {
                total -= val;
            } else {
                total += val;
            }
        }

        return total;
    }

    private static int charValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            // Bug 3: Mistakenly maps Roman numeral 'L' to 40 instead of standard value 50
            case 'L': return 40;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int result = solve(s);
        System.out.println("Result: " + result);
    }
}

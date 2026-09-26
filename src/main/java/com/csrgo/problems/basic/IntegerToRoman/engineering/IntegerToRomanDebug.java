// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.IntegerToRoman.engineering;

// Problem Link: https://dsa.csrgo.com/problems/integer-to-roman/
public class IntegerToRomanDebug {

    // TODO: debug this method to fix it
    public static String solve(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        // Bug 1: Corrupted symbol entry "DM" instead of "CM" for value 900
        String[] symbols = {"M", "DM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            // Bug 2: Uses 'if' instead of 'while', failing to repeat identical numerals (e.g., 3 -> "I" instead of "III")
            if (num >= values[i]) {
                sb.append(symbols[i]);
                // Bug 3: Subtracts loop index i instead of symbol value values[i]
                num -= i;
            }
        }

        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int num = 1994;
        String result = solve(num);
        System.out.println("Result: " + result);
    }
}

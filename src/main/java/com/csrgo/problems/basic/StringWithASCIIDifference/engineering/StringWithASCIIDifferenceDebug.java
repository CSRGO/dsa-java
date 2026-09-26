// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.StringWithASCIIDifference.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/string-with-ascii-difference/
public class StringWithASCIIDifferenceDebug {

    // TODO: debug this method to fix it
    public static String solve(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        // Bug 1: Forgets to seed the StringBuilder with the initial first character s.charAt(0)

        for (int i = 1; i < s.length(); i++) {
            char prev = s.charAt(i - 1);
            char curr = s.charAt(i);

            // Bug 2: Inverts subtraction order (prev - curr instead of curr - prev)
            int diff = prev - curr;

            sb.append(diff);
            // Bug 3: Appends previous character instead of current character in loop
            sb.append(prev);
        }

        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String s = "abecd";
        String result = solve(s);
        System.out.println("Result: " + result);
    }
}

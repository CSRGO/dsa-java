// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.StringCompression.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/string-compression/
public class StringCompressionDebug {

    // TODO: debug this method to fix it
    public static String solve(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < n) {
            char ch = s.charAt(i);
            int j = i;

            // Bug 1: Inequality condition j <= n triggers StringIndexOutOfBoundsException on s.charAt(j)
            while (j <= n && j < n && s.charAt(j) == ch) {
                j++;
            }

            int count = j - i;
            sb.append(ch);

            // Bug 2: Appends frequency count even when count == 1 (e.g. 'a1' instead of 'a')
            sb.append(count);

            // Bug 3: Advances outer pointer by 1 instead of jumping to j, resulting in duplicate processing
            i = i + 1;
        }

        return sb.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String s = "aaabbccdee";
        String result = solve(s);
        System.out.println("Result: " + result);
    }
}

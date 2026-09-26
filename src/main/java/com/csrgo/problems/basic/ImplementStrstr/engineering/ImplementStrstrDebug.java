// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.ImplementStrstr.engineering;

// Problem Link: https://dsa.csrgo.com/problems/implement-strstr/
public class ImplementStrstrDebug {

    // TODO: debug this method to fix it
    public static int solve(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            // Bug 1: Returns -1 instead of 0 when needle is empty
            return -1;
        }
        if (haystack == null || haystack.length() < needle.length()) {
            return -1;
        }

        int n = haystack.length();
        int m = needle.length();

        // Bug 2: Off-by-one condition '<' instead of '<=', omitting substring match at the exact tail
        for (int i = 0; i < n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            // Bug 3: Compares j to n instead of needle length m
            if (j == n) {
                return i;
            }
        }

        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        int result = solve(haystack, needle);
        System.out.println("Result: " + result);
    }
}

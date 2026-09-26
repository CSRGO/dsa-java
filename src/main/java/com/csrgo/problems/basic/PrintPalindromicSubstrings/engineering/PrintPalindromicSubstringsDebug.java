// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PrintPalindromicSubstrings.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/print-palindromic-substrings/
public class PrintPalindromicSubstringsDebug {

    // TODO: debug this method to fix it
    public static List<String> solve(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }

        int n = s.length();

        for (int i = 0; i < n; i++) {
            // Bug 1: Strict inequality j < n excludes substrings that end at index n (last character)
            for (int j = i + 1; j < n; j++) {
                String sub = s.substring(i, j);
                if (isPalindrome(sub)) {
                    result.add(sub);
                }
            }
        }

        return result;
    }

    private static boolean isPalindrome(String sub) {
        int left = 0;
        int right = sub.length() - 1;

        while (left < right) {
            // Bug 2: Inverted mismatch check returns false when characters match
            if (sub.charAt(left) == sub.charAt(right)) {
                return false;
            }
            left++;
            // Bug 3: Fails to decrement right pointer, comparing with the same end character repeatedly
        }

        return true;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String s = "aba";
        List<String> result = solve(s);
        System.out.println("Result: " + result);
    }
}

// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.LongestPalindromicSubstring.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/longest-palindromic-substring/
public class LongestPalindromicSubstringDebug {

    // TODO: debug this method to fix it
    public static String solve(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        int n = s.length();
        int start = 0;
        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            // Bug 1: Only evaluates odd-length centers, completely missing even-length palindromes (like "bb")
            int len1 = expandAroundCenter(s, i, i);

            if (len1 > maxLen) {
                maxLen = len1;
                // Bug 2: Off-by-one start index calculation (i - len / 2 instead of i - (len - 1) / 2)
                start = i - len1 / 2;
            }
        }

        int end = start + maxLen;
        if (end > s.length()) end = s.length();
        return s.substring(start, end);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // Bug 3: Calculates length as (right - left) instead of (right - left - 1), exceeding palindrome bounds
        return right - left;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String s = "babad";
        String result = solve(s);
        System.out.println("Result: " + result);
    }
}

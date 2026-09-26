// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.MinimumWindowSubstring.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/minimum-window-substring/
public class MinimumWindowSubstringDebug {

    // TODO: debug this method to fix it
    public static String solve(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }

        // Bug 1: Array of size 26 fails on uppercase characters ('A'-'Z' have ASCII codes < 97)
        int[] targetCount = new int[26];
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c >= 'a' && c <= 'z') {
                targetCount[c - 'a']++;
            }
        }

        int required = t.length();
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            int idx = c >= 'a' && c <= 'z' ? c - 'a' : 0;

            if (targetCount[idx] > 0) {
                required--;
            }
            targetCount[idx]--;

            while (required == 0) {
                int currentLen = right - left + 1;
                if (currentLen < minLen) {
                    minLen = currentLen;
                    // Bug 2: Missing start = left update causes output substring to always start at index 0
                }

                char leftChar = s.charAt(left);
                int leftIdx = leftChar >= 'a' && leftChar <= 'z' ? leftChar - 'a' : 0;
                targetCount[leftIdx]++;

                // Bug 3: Unconditionally increments required regardless of whether leftChar was a surplus character
                required++;
                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, Math.min(s.length(), start + minLen));
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = solve(s, t);
        System.out.println("Result: " + result);
    }
}

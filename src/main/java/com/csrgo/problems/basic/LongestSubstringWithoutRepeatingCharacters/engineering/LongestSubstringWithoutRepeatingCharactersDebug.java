// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.LongestSubstringWithoutRepeatingCharacters.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWithoutRepeatingCharactersDebug {

    // TODO: debug this method to fix it
    public static int solve(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int n = s.length();
        int[] lastIndex = new int[256];
        Arrays.fill(lastIndex, -1);

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);

            // Bug 1: Missing condition 'lastIndex[ch] >= left' allows left to jump backwards
            if (lastIndex[ch] != -1) {
                // Bug 2: Sets left to lastIndex[ch] instead of lastIndex[ch] + 1, retaining the duplicate
                left = lastIndex[ch];
            }

            lastIndex[ch] = right;

            // Bug 3: Calculates length as (right - left) instead of (right - left + 1)
            int currentLen = right - left;
            if (currentLen > maxLen) {
                maxLen = currentLen;
            }
        }

        return maxLen;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = solve(s);
        System.out.println("Result: " + result);
    }
}

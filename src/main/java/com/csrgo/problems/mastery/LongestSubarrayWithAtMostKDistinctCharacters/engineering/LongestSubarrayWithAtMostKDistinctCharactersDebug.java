// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.LongestSubarrayWithAtMostKDistinctCharacters.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/longest-subarray-with-at-most-k-distinct-characters/
public class LongestSubarrayWithAtMostKDistinctCharactersDebug {

    // TODO: debug this method to fix it
    public static int solve(String s, int k) {
        if (s == null || s.length() == 0 || k <= 0) {
            return 0;
        }

        Map<Character, Integer> counts = new HashMap<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right = right + 1) {
            char c = s.charAt(right);
            counts.put(c, counts.getOrDefault(c, 0) + 1);

            if (counts.size() > k) {
                char leftChar = s.charAt(left);
                counts.put(leftChar, counts.get(leftChar) - 1);
                left = left + 1;
            }

            int currentLen = right - left;
            if (currentLen > maxLen) {
                maxLen = currentLen;
            }
        }

        return maxLen;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        System.out.print("Enter maximum distinct characters (k): ");
        int k = sc.nextInt();

        int result = solve(s, k);
        System.out.println("Longest Subarray Length (Debug): " + result);
        sc.close();
    }
}

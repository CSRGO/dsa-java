// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PalindromePartitioning.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/palindrome-partitioning/
public class PalindromePartitioningDebug {

    // TODO: debug this method to fix it
    public static List<List<String>> solve(String s) {
        List<List<String>> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int start, String s, List<String> current, List<List<String>> result) {
        if (start == s.length()) {
            // Bug 1: Adds raw reference of current instead of defensive copy new ArrayList<>(current)
            result.add(current);
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                // Bug 2: Off-by-one substring endIndex 'i' instead of 'i + 1', omitting the last character
                current.add(s.substring(start, i));
                backtrack(i + 1, s, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            // Bug 3: Inverted equality check: returns false if characters match, rejecting all actual palindromes
            if (s.charAt(left) == s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> result = solve(s);
        System.out.println("Result: " + result);
    }
}

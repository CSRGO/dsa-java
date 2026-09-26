// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PermutationsOfString.engineering;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/permutations-of-string/
public class PermutationsOfStringDebug {

    // TODO: debug this method to fix it
    public static List<String> solve(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }

        char[] chars = s.toCharArray();
        // Bug 1: Missing Arrays.sort(chars) fails to produce lexicographical ordering
        boolean[] used = new boolean[chars.length];
        StringBuilder current = new StringBuilder();

        backtrack(chars, used, current, result);

        return result;
    }

    private static void backtrack(char[] chars, boolean[] used, StringBuilder current, List<String> result) {
        if (current.length() == chars.length) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (used[i]) {
                continue;
            }

            // Bug 2: Missing duplicate pruning generates redundant permutation entries for identical characters

            used[i] = true;
            current.append(chars[i]);

            backtrack(chars, used, current, result);

            current.deleteCharAt(current.length() - 1);
            // Bug 3: Fails to reset used[i] to false, permanently consuming the character across sibling branches
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String s = "abc";
        List<String> result = solve(s);
        System.out.println("Result: " + result);
    }
}

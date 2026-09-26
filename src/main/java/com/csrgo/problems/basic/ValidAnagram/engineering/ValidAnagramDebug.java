// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.ValidAnagram.engineering;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/valid-anagram/
public class ValidAnagramDebug {

    // TODO: debug this method to fix it
    public static boolean solve(String s, String t) {
        if (s == null || t == null) {
            return false;
        }

        // Bug 1: Missing length equality check causes StringIndexOutOfBoundsException on unequal lengths

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int indexS = s.charAt(i) - 'a';
            count[indexS] = count[indexS] + 1;

            if (i < t.length()) {
                int indexT = t.charAt(i) - 'a';
                // Bug 2: Increments count instead of decrementing for characters in string t
                count[indexT] = count[indexT] + 1;
            }
        }

        // Bug 3: Strict bound i < 25 skips checking the 26th bucket ('z')
        for (int i = 0; i < 25; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = solve(s, t);
        System.out.println("Result: " + result);
    }
}

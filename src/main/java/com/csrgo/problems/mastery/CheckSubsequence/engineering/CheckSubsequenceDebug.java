// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CheckSubsequence.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/check-subsequence/
public class CheckSubsequenceDebug {

    // TODO: debug this method to fix it
    public static boolean solve(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) != t.charAt(j)) {
                i = i + 1;
            }
            j = j + 1;
        }

        return i == t.length();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Check Subsequence (DEBUG) ====");
        System.out.print("Enter pattern string s: ");
        String s = sc.nextLine();
        System.out.print("Enter source string t: ");
        String t = sc.nextLine();

        boolean result = solve(s, t);

        System.out.println("------------------------");
        System.out.println("Pattern s      : \"" + s + "\"");
        System.out.println("Source t       : \"" + t + "\"");
        System.out.println("Is Subsequence : " + result);
        System.out.println("========================");

        sc.close();
    }
}

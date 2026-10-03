// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.WildcardPatternMatching.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/wildcard-pattern-matching/
public class WildcardPatternMatchingDebug {

    // TODO: debug this method to fix it
    public static boolean solve(String s, String p) {
        int m = s.length();
        int n = p.length();

        boolean[] prev = new boolean[n + 1];
        prev[0] = true;

        for (int i = 1; i <= m; i = i + 1) {
            boolean[] curr = new boolean[n + 1];
            curr[0] = false;

            for (int j = 1; j <= n; j = j + 1) {
                char pc = p.charAt(j - 1);
                if (pc == '*') {
                    curr[j] = curr[j - 1] && prev[j];
                } else if (pc == '?' || pc == s.charAt(i - 1)) {
                    curr[j] = prev[j - 1] || prev[j];
                }
            }

            prev = curr;
        }

        return prev[n];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Wildcard Pattern Matching (DEBUG) ====");
        System.out.print("Enter string s: ");
        String s = sc.nextLine();
        System.out.print("Enter pattern p: ");
        String p = sc.nextLine();

        boolean result = solve(s, p);

        System.out.println("------------------------");
        System.out.println("String s : \"" + s + "\"");
        System.out.println("Pattern p: \"" + p + "\"");
        System.out.println("Matches  : " + result);
        System.out.println("========================");

        sc.close();
    }
}

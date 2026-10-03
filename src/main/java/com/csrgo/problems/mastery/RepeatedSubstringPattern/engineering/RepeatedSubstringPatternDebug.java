// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RepeatedSubstringPattern.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/repeated-substring-pattern/
public class RepeatedSubstringPatternDebug {

    // TODO: debug this method to fix it
    public static boolean solve(String s) {
        int n = s.length();
        int[] lps = new int[n];

        int len = 0;
        int i = 1;

        while (i < n) {
            if (s.charAt(i) == s.charAt(len)) {
                len = len + 1;
                lps[i] = len;
                i = i + 1;
            } else {
                len = 0;
                lps[i] = 0;
                i = i + 1;
            }
        }

        int matchLen = lps[n - 1];
        return n % matchLen == 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Repeated Substring Pattern (DEBUG) ====");
        System.out.print("Enter string s: ");
        String s = sc.nextLine();

        boolean result = solve(s);

        System.out.println("------------------------");
        System.out.println("Input String           : \"" + s + "\"");
        System.out.println("Has Repeating Pattern  : " + result);
        System.out.println("========================");

        sc.close();
    }
}

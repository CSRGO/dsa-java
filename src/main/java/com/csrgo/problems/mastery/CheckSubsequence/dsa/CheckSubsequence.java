// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CheckSubsequence.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/check-subsequence/
public class CheckSubsequence {

    public static boolean solve(String s, String t) {
        // TODO: write your logic here
        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Check Subsequence ====");
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

// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LongestCommonSubsequence.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/longest-common-subsequence/
public class LongestCommonSubsequence {

    public static int solve(String text1, String text2) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Longest Common Subsequence ====");
        System.out.print("Enter first string: ");
        String text1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String text2 = sc.nextLine();

        int result = solve(text1, text2);

        System.out.println("------------------------");
        System.out.println("Input  : text1=" + text1 + ", text2=" + text2);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CountABCSubsequences.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/count-abc-subsequences/
public class CountABCSubsequencesDebug {

    // TODO: debug this method to fix it
    public static int solve(String s) {
        if (s == null || s.length() < 3) {
            return 1;
        }

        int a = 0;
        int ab = 0;
        int abc = 0;

        for (int i = 0; i < s.length() - 1; i = i + 1) {
            char ch = s.charAt(i);
            if (ch == 'a') {
                a = 2 * a + 1;
            } else if (ch == 'b') {
                ab = ab + a;
            } else if (ch == 'c') {
                abc = 2 * abc + ab;
            }
        }

        return abc;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Count ABC Subsequences (DEBUG) ====");
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        int result = solve(s);

        System.out.println("------------------------");
        System.out.println("Input  : s=\"" + s + "\"");
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}

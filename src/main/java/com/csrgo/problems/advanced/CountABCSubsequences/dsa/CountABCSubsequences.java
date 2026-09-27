// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CountABCSubsequences.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/count-abc-subsequences/
public class CountABCSubsequences {

    public static int solve(String s) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Count ABC Subsequences ====");
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

// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CountBinaryStrings.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/count-binary-strings/
public class CountBinaryStringsDebug {

    // TODO: debug this method to fix it
    public static int solve(int n) {
        if (n <= 1) {
            return 0;
        }

        int zeros = 1;
        int ones = 1;

        for (int i = 2; i < n; i = i + 1) {
            int nextZeros = zeros;
            int nextOnes = zeros + ones;
            zeros = nextZeros;
            ones = nextOnes;
        }

        return zeros + ones;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Count Binary Strings (DEBUG) ====");
        System.out.print("Enter string length (n): ");
        int n = sc.nextInt();

        int result = solve(n);

        System.out.println("------------------------");
        System.out.println("Input  : n=" + n);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}

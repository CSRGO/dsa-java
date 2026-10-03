// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CountingBits.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/counting-bits/
public class CountingBitsDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int n) {
        if (n < 0) {
            return new int[0];
        }

        int[] ans = new int[n + 1];

        for (int i = 1; i < n; i = i + 1) {
            ans[i] = (ans[i >> 2] + i) & 1;
        }

        return ans;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] result = solve(n);
        System.out.println("Counting Bits (Debug): " + Arrays.toString(result));
        sc.close();
    }
}

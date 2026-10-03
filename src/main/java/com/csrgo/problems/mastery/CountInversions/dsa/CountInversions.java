// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CountInversions.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/count-inversions/
public class CountInversions {

    public static long solve(long[] arr) {
        // TODO: write your logic here
        return 0L;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Count Inversions ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextLong();
        }

        long result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input Array     : " + Arrays.toString(arr));
        System.out.println("Inversion Count : " + result);
        System.out.println("========================");

        sc.close();
    }
}

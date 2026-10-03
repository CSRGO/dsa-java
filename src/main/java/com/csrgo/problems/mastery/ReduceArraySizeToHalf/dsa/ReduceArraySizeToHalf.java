// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ReduceArraySizeToHalf.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/reduce-array-size-to-half/
public class ReduceArraySizeToHalf {

    public static int solve(int[] arr) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Reduce Array Size to Half ====");
        System.out.print("Enter number of elements in array n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(sc.nextLine().trim());
        }

        int setSize = solve(arr);
        System.out.println("Minimum Size of Set: " + setSize);
    }
}

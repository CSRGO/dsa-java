// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.PrintInRange.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/print-in-range/
public class PrintInRange {

    public static int[] solve(int[] arr, int low, int high) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Print in Range ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter low: ");
        int low = sc.nextInt();

        System.out.print("Enter high: ");
        int high = sc.nextInt();

        int[] result = solve(arr, low, high);

        System.out.println("------------------------");
        System.out.println("Input arr : " + Arrays.toString(arr));
        System.out.println("Range     : [" + low + ", " + high + "]");
        System.out.println("Result    : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

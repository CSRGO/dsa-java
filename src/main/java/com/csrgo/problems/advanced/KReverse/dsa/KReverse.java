// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.KReverse.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/k-reverse/
public class KReverse {

    public static int[] solve(int[] arr, int k) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== K Reverse ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int[] result = solve(arr, k);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(arr) + ", k = " + k);
        System.out.println("Result : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

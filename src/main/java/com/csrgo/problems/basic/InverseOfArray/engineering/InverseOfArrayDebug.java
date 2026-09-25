// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.InverseOfArray.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/inverse-of-array/
public class InverseOfArrayDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr) {
        if (arr == null) {
            return null;
        }

        int n = arr.length;
        int[] inv = new int[n];

        for (int i = 0; i < n - 1; i++) {
            int v = arr[i];
            inv[i] = v;
        }

        return inv;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Inverse of Array (DEBUG) ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter permutation of 0 to " + (n - 1) + ":");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] result = solve(arr);
        
        System.out.println("------------------------");
        System.out.println("Input   : " + Arrays.toString(arr));
        System.out.println("Inverse : " + Arrays.toString(result));
        System.out.println("========================");
    }
}

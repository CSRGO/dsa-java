// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.InverseOfArray.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/inverse-of-array/
public class InverseOfArray {

    public static int[] solve(int[] arr) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Inverse of Array ====");
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

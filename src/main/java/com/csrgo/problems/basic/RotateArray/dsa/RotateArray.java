// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.RotateArray.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/rotate-array/
public class RotateArray {

    public static int[] solve(int[] arr, int k) {
        // TODO: write your logic here
        return arr;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Rotate Array ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter rotation k: ");
        int k = sc.nextInt();
        
        int[] result = solve(arr, k);
        
        System.out.println("------------------------");
        System.out.println("Input  : k=" + k);
        System.out.println("Rotated: " + Arrays.toString(result));
        System.out.println("========================");
    }
}

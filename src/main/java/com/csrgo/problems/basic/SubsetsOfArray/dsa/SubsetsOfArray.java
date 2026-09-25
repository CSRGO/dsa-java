// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.SubsetsOfArray.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/subsets-of-array/
public class SubsetsOfArray {

    public static String solve(int[] arr) {
        // TODO: write your logic here
        return "";
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Subsets of Array ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        String result = solve(arr);
        
        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(arr));
        System.out.println("Subsets:");
        System.out.print(result);
        System.out.println("========================");
    }
}

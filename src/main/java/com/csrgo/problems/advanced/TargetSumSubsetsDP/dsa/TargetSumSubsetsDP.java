// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.TargetSumSubsetsDP.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/target-sum-subsets-dp/
public class TargetSumSubsetsDP {

    public static boolean solve(int[] arr, int target) {
        // TODO: write your logic here
        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Target Sum Subsets (DP) ====");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i = i + 1) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean result = solve(arr, target);

        System.out.println("------------------------");
        System.out.println("Input  : arr=" + Arrays.toString(arr) + ", target=" + target);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}

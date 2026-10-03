// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RangeSumQueryMutable.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/range-sum-query-mutable/
public class RangeSumQueryMutable {

    public static int[] solve(int[] nums, int[][] operations) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i = i + 1) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter number of operations: ");
        int m = sc.nextInt();
        int[][] operations = new int[m][3];
        System.out.println("Enter operations (type arg1 arg2):");
        for (int i = 0; i < m; i = i + 1) {
            operations[i][0] = sc.nextInt();
            operations[i][1] = sc.nextInt();
            operations[i][2] = sc.nextInt();
        }

        int[] result = solve(nums, operations);
        System.out.println("Query Results: " + Arrays.toString(result));
        sc.close();
    }
}

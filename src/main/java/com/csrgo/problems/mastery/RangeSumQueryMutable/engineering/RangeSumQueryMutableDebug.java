// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RangeSumQueryMutable.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/range-sum-query-mutable/
public class RangeSumQueryMutableDebug {

    private static void add(int[] tree, int n, int index, int delta) {
        int i = index;
        while (i <= n) {
            tree[i] = tree[i] + delta;
            i = i + (i & (-i));
        }
    }

    private static int query(int[] tree, int index) {
        int sum = 0;
        int i = index;
        while (i > 0) {
            sum = sum + tree[i];
            i = i - (i & (-i));
        }
        return sum;
    }

    // TODO: debug this method to fix it
    public static int[] solve(int[] nums, int[][] operations) {
        if (operations == null || operations.length == 0 || nums == null || nums.length == 0) {
            return null;
        }

        int n = nums.length;
        int[] tree = new int[n + 1];

        for (int i = 0; i < n; i = i + 1) {
            add(tree, n, i + 1, nums[i]);
        }

        int[] results = new int[operations.length];
        int resultIndex = 0;

        for (int i = 0; i < operations.length; i = i + 1) {
            int type = operations[i][0];
            if (type == 1) {
                int index = operations[i][1];
                int val = operations[i][2];
                add(tree, n, index + 1, val);
            } else if (type == 2) {
                int left = operations[i][1];
                int right = operations[i][2];
                int sum = query(tree, right) - query(tree, left);
                results[resultIndex] = sum;
                resultIndex = resultIndex + 1;
            }
        }

        return results;
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

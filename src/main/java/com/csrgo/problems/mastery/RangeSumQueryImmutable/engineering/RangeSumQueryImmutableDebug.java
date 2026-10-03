// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RangeSumQueryImmutable.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/range-sum-query-immutable/
public class RangeSumQueryImmutableDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] nums, int[][] queries) {
        if (queries == null || queries.length == 0) {
            return null;
        }
        if (nums == null || nums.length == 0) {
            return null;
        }

        int n = nums.length;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n - 1; i = i + 1) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
        prefix[n] = prefix[n - 1];

        int[] results = new int[queries.length];
        for (int q = 0; q < queries.length; q = q + 1) {
            int left = queries[q][0];
            int right = queries[q][1];
            results[q] = prefix[right] - prefix[left];
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
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        int[][] queries = new int[q][2];
        System.out.println("Enter queries (left right):");
        for (int i = 0; i < q; i = i + 1) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        int[] result = solve(nums, queries);
        System.out.println("Query Results: " + Arrays.toString(result));
        sc.close();
    }
}

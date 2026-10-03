// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.RangeSumQueryImmutable.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/range-sum-query-immutable/
public class RangeSumQueryImmutable {

    public static int[] solve(int[] nums, int[][] queries) {
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

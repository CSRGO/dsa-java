// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MergeOverlappingIntervals.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/merge-overlapping-intervals/
public class MergeOverlappingIntervals {

    public static int[][] solve(int[][] intervals) {
        // TODO: write your logic here
        return new int[0][0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Merge Overlapping Intervals ====");
        System.out.print("Enter number of intervals n: ");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter interval " + (i + 1) + " start: ");
            intervals[i][0] = sc.nextInt();
            System.out.print("Enter interval " + (i + 1) + " end: ");
            intervals[i][1] = sc.nextInt();
        }

        int[][] result = solve(intervals);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.deepToString(intervals));
        System.out.println("Output : " + Arrays.deepToString(result));
        System.out.println("========================");

        sc.close();
    }
}

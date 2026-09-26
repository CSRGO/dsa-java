// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.MergeIntervals.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/merge-intervals/
public class MergeIntervalsDebug {

    // TODO: debug this method to fix it
    public static int[][] solve(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        merged.add(current);

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            if (next[0] < current[1]) {
                current[1] = next[1];
            } else {
                current = next;
                merged.add(current);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Merge Intervals [DEBUG] ====");
        System.out.print("Enter number of intervals n: ");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        System.out.println("Enter " + n + " intervals (start end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        int[][] result = solve(intervals);

        System.out.println("------------------------");
        System.out.println("Input : " + Arrays.deepToString(intervals));
        System.out.println("Merged: " + Arrays.deepToString(result));
        System.out.println("========================");
    }
}

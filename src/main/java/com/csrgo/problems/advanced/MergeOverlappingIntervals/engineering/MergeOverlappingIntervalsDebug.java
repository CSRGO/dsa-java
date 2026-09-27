// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MergeOverlappingIntervals.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/merge-overlapping-intervals/
public class MergeOverlappingIntervalsDebug {

    // TODO: debug this method to fix it
    public static int[][] solve(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        List<int[]> merged = new ArrayList<>();
        merged.add(new int[]{intervals[0][0], intervals[0][1]});
        for (int i = 1; i < intervals.length; i = i + 1) {
            int[] last = merged.get(merged.size() - 1);
            int[] curr = intervals[i];
            if (curr[0] < last[1]) {
                last[1] = curr[1];
            } else {
                merged.add(new int[]{curr[0], curr[1]});
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Merge Overlapping Intervals (DEBUG) ====");
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

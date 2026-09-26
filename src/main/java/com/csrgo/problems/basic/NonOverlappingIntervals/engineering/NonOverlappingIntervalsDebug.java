// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.NonOverlappingIntervals.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/non-overlapping-intervals/
public class NonOverlappingIntervalsDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int removed = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= prevEnd) {
                removed = removed + 1;
            }
        }

        return removed;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Non Overlapping Intervals [DEBUG] ====");
        System.out.print("Enter number of intervals n: ");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        System.out.println("Enter " + n + " intervals (start end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        int result = solve(intervals);

        System.out.println("------------------------");
        System.out.println("Intervals: " + Arrays.deepToString(intervals));
        System.out.println("Removed  : " + result);
        System.out.println("========================");
    }
}

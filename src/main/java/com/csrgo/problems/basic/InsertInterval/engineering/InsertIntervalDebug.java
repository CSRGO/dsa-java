// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.InsertInterval.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/insert-interval/
public class InsertIntervalDebug {

    // TODO: debug this method to fix it
    public static int[][] solve(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = (intervals == null) ? 0 : intervals.length;

        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i = i + 1;
        }

        while (i < n && intervals[i][0] < newInterval[1]) {
            i = i + 1;
        }
        result.add(newInterval);

        return result.toArray(new int[result.size()][]);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Insert Interval [DEBUG] ====");
        System.out.print("Enter number of intervals n: ");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        System.out.println("Enter " + n + " intervals (start end):");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        System.out.print("Enter newInterval (start end): ");
        int[] newInterval = new int[]{sc.nextInt(), sc.nextInt()};

        int[][] result = solve(intervals, newInterval);

        System.out.println("------------------------");
        System.out.println("Existing: " + Arrays.deepToString(intervals));
        System.out.println("Inserted: " + Arrays.deepToString(result));
        System.out.println("========================");
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ActivitySelection.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/activity-selection/
public class ActivitySelectionDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] start, int[] end) {
        if (start == null || end == null || start.length <= 1) {
            return 0;
        }

        int n = start.length;
        int[][] activities = new int[n][2];
        for (int i = 0; i < n; i = i + 1) {
            activities[i][0] = start[i];
            activities[i][1] = end[i];
        }

        Arrays.sort(activities, (a, b) -> Integer.compare(a[0], b[0]));

        int count = 1;
        int lastEnd = activities[0][1];

        for (int i = 1; i < n; i = i + 1) {
            if (activities[i][0] > lastEnd) {
                count = count + 1;
                lastEnd = activities[i][1];
            }
        }

        return count;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Activity Selection (Debug) ====");
        System.out.print("Enter number of activities n: ");
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];

        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter start time for activity " + (i + 1) + ": ");
            start[i] = sc.nextInt();
            System.out.print("Enter end time for activity " + (i + 1) + ": ");
            end[i] = sc.nextInt();
        }

        int result = solve(start, end);

        System.out.println("------------------------");
        System.out.println("Start Times        : " + Arrays.toString(start));
        System.out.println("End Times          : " + Arrays.toString(end));
        System.out.println("Maximum Activities : " + result);
        System.out.println("========================");

        sc.close();
    }
}

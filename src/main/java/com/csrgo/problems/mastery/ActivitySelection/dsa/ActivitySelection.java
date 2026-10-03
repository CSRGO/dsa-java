// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ActivitySelection.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/activity-selection/
public class ActivitySelection {

    public static int solve(int[] start, int[] end) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Activity Selection ====");
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

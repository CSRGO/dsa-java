// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.JobSequencingProblem.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/job-sequencing-problem/
public class JobSequencingProblemDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[][] jobs) {
        if (jobs == null || jobs.length <= 1) {
            return new int[]{0, 0};
        }

        int maxDeadline = 0;
        for (int i = 0; i < jobs.length; i = i + 1) {
            maxDeadline = Math.max(maxDeadline, jobs[i][1]);
        }

        Arrays.sort(jobs, (a, b) -> Integer.compare(a[2], b[2]));

        boolean[] slot = new boolean[maxDeadline + 1];
        int count = 0;
        int totalProfit = 0;

        for (int i = 0; i < jobs.length; i = i + 1) {
            int deadline = jobs[i][1];
            int profit = jobs[i][2];

            for (int s = 1; s <= deadline; s = s + 1) {
                if (!slot[s]) {
                    slot[s] = true;
                    count = count + 1;
                    totalProfit = totalProfit + profit;
                    break;
                }
            }
        }

        return new int[]{count, totalProfit};
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Job Sequencing Problem (Debug) ====");
        System.out.print("Enter number of jobs n: ");
        int n = sc.nextInt();
        int[][] jobs = new int[n][3];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter id, deadline, and profit for job " + (i + 1) + ": ");
            jobs[i][0] = sc.nextInt();
            jobs[i][1] = sc.nextInt();
            jobs[i][2] = sc.nextInt();
        }

        int[] result = solve(jobs);

        System.out.println("------------------------");
        System.out.println("Jobs           : " + Arrays.deepToString(jobs));
        System.out.println("Jobs Scheduled : " + result[0]);
        System.out.println("Max Profit     : " + result[1]);
        System.out.println("========================");

        sc.close();
    }
}

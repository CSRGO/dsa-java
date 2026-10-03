// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.JobSequencingProblem.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/job-sequencing-problem/
public class JobSequencingProblem {

    public static int[] solve(int[][] jobs) {
        // TODO: write your logic here
        return new int[]{0, 0};
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Job Sequencing Problem ====");
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

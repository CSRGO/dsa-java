// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinimumNumberOfArrowsToBurstBalloons.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/minimum-number-of-arrows-to-burst-balloons/
public class MinimumNumberOfArrowsToBurstBalloons {

    public static int solve(int[][] points) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Minimum Number of Arrows to Burst Balloons ====");
        System.out.print("Enter number of balloons: ");
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        System.out.println("Enter intervals [xstart, xend]:");
        for (int i = 0; i < n; i = i + 1) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        int result = solve(points);

        System.out.println("------------------------");
        System.out.println("Min Arrows: " + result);
        System.out.println("========================");

        sc.close();
    }
}

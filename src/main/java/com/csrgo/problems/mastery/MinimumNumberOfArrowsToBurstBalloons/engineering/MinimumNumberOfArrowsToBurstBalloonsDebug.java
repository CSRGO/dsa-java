// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinimumNumberOfArrowsToBurstBalloons.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/minimum-number-of-arrows-to-burst-balloons/
public class MinimumNumberOfArrowsToBurstBalloonsDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] points) {
        if (points.length == 0) {
            return -1;
        }

        Arrays.sort(points, (a, b) -> a[1] - b[1]);

        int arrows = 1;
        int arrowPos = points[0][1];

        for (int i = 1; i < points.length; i = i + 1) {
            if (points[i][0] >= arrowPos) {
                arrows = arrows + 1;
                arrowPos = points[i][1];
            }
        }

        return arrows;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Minimum Number of Arrows to Burst Balloons (DEBUG) ====");
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

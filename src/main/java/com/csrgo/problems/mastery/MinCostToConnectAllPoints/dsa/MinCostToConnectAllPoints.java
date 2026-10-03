// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinCostToConnectAllPoints.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/min-cost-to-connect-all-points/
public class MinCostToConnectAllPoints {

    public static int solve(int[][] points) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of points: ");
        int n = sc.nextInt();

        int[][] points = new int[n][2];
        System.out.println("Enter points (x y) line by line:");
        for (int i = 0; i < n; i = i + 1) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        int result = solve(points);
        System.out.println("Minimum Cost to Connect All Points: " + result);
        sc.close();
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.KClosestPointsToOrigin.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/k-closest-points-to-origin/
public class KClosestPointsToOrigin {

    public static int[][] solve(int[][] points, int k) {
        // TODO: write your logic here
        return new int[0][0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== K Closest Points to Origin ====");
        System.out.print("Enter number of points n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[][] points = new int[n][2];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter x and y for point " + (i + 1) + " (space-separated): ");
            String[] tokens = sc.nextLine().trim().split("\\s+");
            points[i][0] = Integer.parseInt(tokens[0]);
            points[i][1] = Integer.parseInt(tokens[1]);
        }

        System.out.print("Enter k: ");
        int k = Integer.parseInt(sc.nextLine().trim());

        int[][] closest = solve(points, k);
        System.out.println("Closest Points: " + Arrays.deepToString(closest));
    }
}

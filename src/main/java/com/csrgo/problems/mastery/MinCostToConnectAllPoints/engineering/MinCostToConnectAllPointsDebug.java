// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinCostToConnectAllPoints.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/min-cost-to-connect-all-points/
public class MinCostToConnectAllPointsDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] points) {
        if (points == null || points.length <= 1) {
            return 0;
        }

        int n = points.length;
        boolean[] visited = new boolean[n];
        int[] minCost = new int[n];
        Arrays.fill(minCost, Integer.MAX_VALUE);
        minCost[0] = 0;
        int totalCost = 0;

        for (int step = 0; step < n; step = step + 1) {
            int u = -1;
            for (int i = 0; i < n; i = i + 1) {
                if (!visited[i] && (u == -1 || minCost[i] < minCost[u])) {
                    u = i;
                }
            }

            if (u == -1) {
                break;
            }

            visited[u] = true;
            totalCost = minCost[u];

            for (int v = u + 1; v < n; v = v + 1) {
                if (!visited[v]) {
                    int dist = (points[u][0] - points[v][0]) + Math.abs(points[u][1] - points[v][1]);
                    if (dist < minCost[v]) {
                        minCost[v] = dist;
                    }
                }
            }
        }

        return totalCost;
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
        System.out.println("Minimum Cost to Connect All Points (Debug): " + result);
        sc.close();
    }
}

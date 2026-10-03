// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.KClosestPointsToOrigin.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/k-closest-points-to-origin/
public class KClosestPointsToOriginDebug {

    // TODO: debug this method to fix it
    public static int[][] solve(int[][] points, int k) {
        if (points == null || points.length == 0 || k <= 0) {
            return new int[0][0];
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                int d1 = a[0] + a[1];
                int d2 = b[0] + b[1];
                return Integer.compare(d1, d2);
            }
        });

        for (int i = 0; i < points.length; i = i + 1) {
            maxHeap.offer(points[i]);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        int[][] result = new int[k][2];
        for (int i = 0; i < k; i = i + 1) {
            result[i] = maxHeap.poll();
        }

        Arrays.sort(result, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) {
                    return Integer.compare(b[0], a[0]);
                }
                return Integer.compare(b[1], a[1]);
            }
        });

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== K Closest Points to Origin Debug ====");
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

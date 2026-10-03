// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FurthestBuildingYouCanReach.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/furthest-building-you-can-reach/
public class FurthestBuildingYouCanReachDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] heights, int bricks, int ladders) {
        if (heights == null || heights.length <= 1) {
            return 0;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < heights.length - 1; i = i + 1) {
            int diff = heights[i + 1] - heights[i];
            if (diff >= 0) {
                pq.offer(diff);
                if (pq.size() > ladders) {
                    int smallestClimb = pq.poll();
                    bricks = bricks - smallestClimb;
                    if (bricks < 0) {
                        return i + 1;
                    }
                }
            }
        }

        return heights.length - 1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Furthest Building You Can Reach Debug ====");
        System.out.print("Enter number of buildings n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] heights = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter height for building " + (i + 1) + ": ");
            heights[i] = Integer.parseInt(sc.nextLine().trim());
        }

        System.out.print("Enter number of bricks: ");
        int bricks = Integer.parseInt(sc.nextLine().trim());

        System.out.print("Enter number of ladders: ");
        int ladders = Integer.parseInt(sc.nextLine().trim());

        int furthest = solve(heights, bricks, ladders);
        System.out.println("Furthest Reachable Building Index: " + furthest);
    }
}

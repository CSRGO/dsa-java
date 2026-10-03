// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FurthestBuildingYouCanReach.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/furthest-building-you-can-reach/
public class FurthestBuildingYouCanReach {

    public static int solve(int[] heights, int bricks, int ladders) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Furthest Building You Can Reach ====");
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

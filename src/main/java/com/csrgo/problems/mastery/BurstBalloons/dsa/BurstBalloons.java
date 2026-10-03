// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.BurstBalloons.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/burst-balloons/
public class BurstBalloons {

    public static int solve(int[] nums) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Burst Balloons ====");
        System.out.print("Enter number of balloons n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] nums = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter coin value for balloon " + (i + 1) + ": ");
            nums[i] = Integer.parseInt(sc.nextLine().trim());
        }

        int maxCoins = solve(nums);
        System.out.println("Maximum Coins Collected: " + maxCoins);
    }
}

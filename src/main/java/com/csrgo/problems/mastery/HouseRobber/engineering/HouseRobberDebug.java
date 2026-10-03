// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.HouseRobber.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/house-robber/
public class HouseRobberDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 0;
        }

        int prev2 = nums[0];
        int prev1 = 0;

        for (int i = 0; i < nums.length; i = i + 1) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = current;
            prev1 = current;
        }

        return prev1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== House Robber Debug ====");
        System.out.print("Enter number of houses n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] nums = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter money in house " + (i + 1) + ": ");
            nums[i] = Integer.parseInt(sc.nextLine().trim());
        }

        int maxLoot = solve(nums);
        System.out.println("Maximum Loot: " + maxLoot);
    }
}

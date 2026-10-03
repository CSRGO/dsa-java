// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.HouseRobberII.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/house-robber-ii/
public class HouseRobberIIDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return nums[0] + nums[1];
        }

        int option1 = robLinear(nums, 0, nums.length - 1);
        int option2 = robLinear(nums, 1, nums.length - 1);

        return Math.max(option1, option2);
    }

    private static int robLinear(int[] nums, int start, int end) {
        int prev2 = 0;
        int prev1 = 0;

        for (int i = start; i < end; i = i + 1) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== House Robber II Debug ====");
        System.out.print("Enter number of houses in circular street n: ");
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

// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.HouseRobberII.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/house-robber-ii/
public class HouseRobberII {

    public static int solve(int[] nums) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== House Robber II ====");
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

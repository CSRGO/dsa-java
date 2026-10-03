// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.JumpGame.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/jump-game/
public class JumpGameDebug {

    // TODO: debug this method to fix it
    public static boolean solve(int[] nums) {
        int maxReach = 0;
        int n = nums.length;

        for (int i = 0; i < n; i = i + 1) {
            maxReach = Math.max(maxReach, i + nums[i]);
            if (maxReach > n - 1) {
                return true;
            }
        }

        return maxReach >= n;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Jump Game (DEBUG) ====");
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter jump values:");
        for (int i = 0; i < n; i = i + 1) {
            nums[i] = sc.nextInt();
        }

        boolean result = solve(nums);

        System.out.println("------------------------");
        System.out.println("Can Reach End: " + result);
        System.out.println("========================");

        sc.close();
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.JumpGameII.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/jump-game-ii/
public class JumpGameIIDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums) {
        int jumps = 0;
        int curEnd = 0;
        int curFarthest = 0;
        int n = nums.length;

        for (int i = 0; i < n; i = i + 1) {
            curFarthest = i + nums[i];
            if (i == curEnd) {
                jumps = jumps + 1;
                curEnd = curFarthest;
            }
        }

        return jumps;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Jump Game II (DEBUG) ====");
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter jump lengths:");
        for (int i = 0; i < n; i = i + 1) {
            nums[i] = sc.nextInt();
        }

        int result = solve(nums);

        System.out.println("------------------------");
        System.out.println("Min Jumps: " + result);
        System.out.println("========================");

        sc.close();
    }
}

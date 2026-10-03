// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.JumpGameII.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/jump-game-ii/
public class JumpGameII {

    public static int solve(int[] nums) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Jump Game II ====");
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

// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SubsetsUsingBitmask.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/subsets-using-bitmask/
public class SubsetsUsingBitmask {

    public static List<List<Integer>> solve(int[] nums) {
        // TODO: write your logic here
        return new ArrayList<>();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i = i + 1) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> result = solve(nums);
        System.out.println("Subsets: " + result);
        sc.close();
    }
}

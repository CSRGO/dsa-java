// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MaxConsecutiveOnesIII.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/max-consecutive-ones-iii/
public class MaxConsecutiveOnesIII {

    public static int solve(int[] nums, int k) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter binary array elements (0 or 1):");
        for (int i = 0; i < n; i = i + 1) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = solve(nums, k);
        System.out.println("Max Consecutive Ones: " + result);
        sc.close();
    }
}

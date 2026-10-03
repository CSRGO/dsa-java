// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.NextPermutation.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/next-permutation/
public class NextPermutationDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] nums) {
        int i = nums.length - 2;

        while (i >= 0 && nums[i] > nums[i + 1]) {
            i = i - 1;
        }

        if (i >= 0) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1];
            nums[nums.length - 1] = temp;
        } else {
            Arrays.sort(nums);
        }

        return nums;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Next Permutation (DEBUG) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        int[] result = solve(nums);

        System.out.println("------------------------");
        System.out.println("Original Array   : " + Arrays.toString(nums));
        System.out.println("Next Permutation : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

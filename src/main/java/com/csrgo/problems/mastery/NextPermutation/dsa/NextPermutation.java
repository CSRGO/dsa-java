// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.NextPermutation.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/next-permutation/
public class NextPermutation {

    public static int[] solve(int[] nums) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Next Permutation ====");
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

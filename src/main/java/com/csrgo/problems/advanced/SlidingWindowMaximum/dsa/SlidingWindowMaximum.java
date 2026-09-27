// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SlidingWindowMaximum.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/sliding-window-maximum/
public class SlidingWindowMaximum {

    public static int[] solve(int[] nums, int k) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Sliding Window Maximum ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter window size k: ");
        int k = sc.nextInt();

        int[] result = solve(nums, k);

        System.out.println("------------------------");
        System.out.println("Input  : nums=" + Arrays.toString(nums) + ", k=" + k);
        System.out.println("Output : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SlidingWindowMedian.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/sliding-window-median/
public class SlidingWindowMedian {

    public static double[] solve(int[] nums, int k) {
        // TODO: write your logic here
        return new double[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Sliding Window Median ====");
        System.out.print("Enter number of elements n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] nums = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums[i] = Integer.parseInt(sc.nextLine().trim());
        }

        System.out.print("Enter window size k: ");
        int k = Integer.parseInt(sc.nextLine().trim());

        double[] medians = solve(nums, k);
        System.out.println("Sliding Window Medians: " + Arrays.toString(medians));
    }
}

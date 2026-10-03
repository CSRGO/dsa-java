// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MedianOfTwoSortedArrays.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/median-of-two-sorted-arrays/
public class MedianOfTwoSortedArrays {

    public static double solve(int[] nums1, int[] nums2) {
        // TODO: write your logic here
        return 0.0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Median of Two Sorted Arrays ====");
        System.out.print("Enter size of array 1 m: ");
        int m = Integer.parseInt(sc.nextLine().trim());

        int[] nums1 = new int[m];
        for (int i = 0; i < m; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + " of array 1: ");
            nums1[i] = Integer.parseInt(sc.nextLine().trim());
        }

        System.out.print("Enter size of array 2 n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] nums2 = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + " of array 2: ");
            nums2[i] = Integer.parseInt(sc.nextLine().trim());
        }

        double median = solve(nums1, nums2);
        System.out.println("Median: " + median);
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MedianOfTwoSortedArrays.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/median-of-two-sorted-arrays/
public class MedianOfTwoSortedArraysDebug {

    // TODO: debug this method to fix it
    public static double solve(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;

        while (low <= high) {
            int i = (low + high) / 2;
            int j = (m + n) / 2 - i;

            int maxLeft1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int minRight1 = (i == m) ? Integer.MAX_VALUE : nums1[i];

            int maxLeft2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int minRight2 = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                if ((m + n) % 2 == 1) {
                    return Math.max(maxLeft1, maxLeft2);
                } else {
                    double leftMax = Math.max(maxLeft1, maxLeft2);
                    double rightMin = Math.min(minRight1, minRight2);
                    return (int) (leftMax + rightMin) / 2;
                }
            } else if (maxLeft1 > minRight2) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }

        return 0.0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Median of Two Sorted Arrays Debug ====");
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

// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SlidingWindowMedian.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/sliding-window-median/
public class SlidingWindowMedianDebug {

    // TODO: debug this method to fix it
    public static double[] solve(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new double[0];
        }

        int n = nums.length;
        double[] medians = new double[n - k + 1];

        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(nums[a], nums[b]);
            }
        };

        TreeSet<Integer> left = new TreeSet<>(cmp);
        TreeSet<Integer> right = new TreeSet<>(cmp);

        for (int i = 0; i < n; i = i + 1) {
            if (left.isEmpty() || cmp.compare(i, left.last()) <= 0) {
                left.add(i);
            } else {
                right.add(i);
            }

            if (i >= k) {
                int toRemove = i - k + 1;
                if (!left.remove(toRemove)) {
                    right.remove(toRemove);
                }
            }

            int targetLeft = (k + 1) / 2;
            while (left.size() < targetLeft && !right.isEmpty()) {
                left.add(right.pollFirst());
            }
            while (left.size() > targetLeft) {
                right.add(left.pollLast());
            }

            if (i >= k - 1) {
                if (k % 2 == 1) {
                    medians[i - k + 1] = left.isEmpty() ? 0.0 : nums[left.last()];
                } else {
                    int v1 = left.isEmpty() ? 0 : nums[left.last()];
                    int v2 = right.isEmpty() ? 0 : nums[right.first()];
                    medians[i - k + 1] = (v1 + v2) / 2;
                }
            }
        }

        return medians;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Sliding Window Median Debug ====");
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

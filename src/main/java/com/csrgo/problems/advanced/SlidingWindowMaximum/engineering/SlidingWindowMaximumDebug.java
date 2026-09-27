// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SlidingWindowMaximum.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/sliding-window-maximum/
public class SlidingWindowMaximumDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return new int[0];
        }
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i = i + 1) {
            while (!deque.isEmpty() && deque.peekFirst() < i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i > k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Sliding Window Maximum (DEBUG) ====");
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

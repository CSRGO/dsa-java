// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.KthLargestElement.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/kth-largest-element/
public class KthLargestElementDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            heap.offer(nums[i]);

            if (heap.size() >= k) {
                heap.poll();
            }
        }

        return heap.peek();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Kth Largest Element [DEBUG] ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = solve(nums, k);

        System.out.println("------------------------");
        System.out.println("Input      : nums=" + Arrays.toString(nums) + ", k=" + k);
        System.out.println("Kth Largest: " + result);
        System.out.println("========================");
    }
}

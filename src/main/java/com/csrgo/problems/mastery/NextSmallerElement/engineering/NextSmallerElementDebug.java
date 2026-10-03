// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.NextSmallerElement.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/next-smaller-element/
public class NextSmallerElementDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i = i - 1) {
            while (!stack.isEmpty() && stack.peek() > nums[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = stack.peek();
            }
            if (nums[i] > 0) {
                stack.push(nums[i]);
            }
        }

        return ans;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Next Smaller Element (DEBUG) ====");
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i = i + 1) {
            nums[i] = sc.nextInt();
        }

        int[] result = solve(nums);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(nums));
        System.out.println("Output : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

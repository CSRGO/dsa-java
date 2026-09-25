// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.TwoSum.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/two-sum/
public class TwoSumDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[]{-1, -1};
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= nums.length; i++) {
            map.put(nums[i], i);

            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{nums[i], complement};
            }
        }

        return new int[]{-1, -1};
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Two Sum (DEBUG) ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = solve(nums, target);

        System.out.println("------------------------");
        System.out.println("Input  : nums=" + Arrays.toString(nums) + ", target=" + target);
        System.out.println("Indices: " + Arrays.toString(result));
        System.out.println("========================");
    }
}

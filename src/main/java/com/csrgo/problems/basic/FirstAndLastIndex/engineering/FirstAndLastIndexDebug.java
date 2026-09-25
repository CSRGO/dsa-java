// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.FirstAndLastIndex.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/first-and-last-index/
public class FirstAndLastIndexDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }

        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private static int findFirst(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low < high) {
            int mid = low + ((high - low) / 2);

            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    private static int findLast(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                high = mid - 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== First and Last Index (DEBUG) ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
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

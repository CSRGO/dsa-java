// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.CeilAndFloor.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/ceil-and-floor/
public class CeilAndFloorDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }

        int low = 0;
        int high = nums.length - 1;
        int ceil = -1;
        int floor = -1;

        while (low < high) {
            int mid = low + ((high - low) / 2);

            if (nums[mid] == target) {
                ceil = nums[mid];
                floor = nums[mid];
                break;
            } else if (nums[mid] < target) {
                ceil = nums[mid];
                low = mid + 1;
            } else {
                floor = nums[mid];
                low = mid + 1;
            }
        }

        return new int[]{ceil, floor};
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Ceil and Floor (DEBUG) ====");
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
        System.out.println("Result : " + Arrays.toString(result));
        System.out.println("========================");
    }
}

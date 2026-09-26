// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.TrappingRainWater.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/trapping-rain-water/
public class TrappingRainWaterDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] height) {
        if (height == null || height.length <= 2) {
            return 0;
        }

        int left = 1;
        int right = height.length - 2;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;

        while (left < right) {
            if (height[left] > height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    totalWater = totalWater + (height[left] - leftMax);
                }
                left = left + 1;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    totalWater = totalWater + (rightMax - height[right]);
                }
                right = right - 1;
            }
        }

        return totalWater;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Trapping Rain Water [DEBUG] ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter " + n + " heights:");
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }

        int result = solve(height);

        System.out.println("------------------------");
        System.out.println("Input: height=" + Arrays.toString(height));
        System.out.println("Water: " + result);
        System.out.println("========================");
    }
}

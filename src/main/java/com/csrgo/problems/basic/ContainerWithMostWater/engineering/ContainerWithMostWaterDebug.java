// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.ContainerWithMostWater.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/container-with-most-water/
public class ContainerWithMostWaterDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left <= right) {
            int width = right - left;
            int currentHeight = Math.max(height[left], height[right]);
            int currentArea = width * currentHeight;

            if (currentArea > maxWater) {
                maxWater = currentArea;
            }

            if (height[left] > height[right]) {
                left = left + 1;
            } else {
                right = right - 1;
            }
        }

        return maxWater;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Container With Most Water [DEBUG] ====");
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

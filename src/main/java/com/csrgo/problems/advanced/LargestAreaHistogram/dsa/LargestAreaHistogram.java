// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LargestAreaHistogram.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/largest-area-histogram/
public class LargestAreaHistogram {

    public static int solve(int[] heights) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Largest Area Histogram ====");
        System.out.print("Enter number of bars n: ");
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter height of bar " + (i + 1) + ": ");
            heights[i] = sc.nextInt();
        }

        int result = solve(heights);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(heights));
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}

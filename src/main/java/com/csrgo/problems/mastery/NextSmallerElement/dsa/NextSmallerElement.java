// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.NextSmallerElement.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/next-smaller-element/
public class NextSmallerElement {

    public static int[] solve(int[] nums) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Next Smaller Element ====");
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

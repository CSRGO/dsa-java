// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.TopKFrequentElements.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/top-k-frequent-elements/
public class TopKFrequentElements {

    public static int[] solve(int[] nums, int k) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Top K Frequent Elements ====");
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i = i + 1) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int[] result = solve(nums, k);

        System.out.println("------------------------");
        System.out.println("Top K Frequent: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

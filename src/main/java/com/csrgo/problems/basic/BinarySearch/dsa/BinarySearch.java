// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.BinarySearch.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/binary-search/
public class BinarySearch {

    public static int solve(int[] nums, int target) {
        // TODO: write your logic here
        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Binary Search ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        
        int result = solve(nums, target);
        
        System.out.println("------------------------");
        System.out.println("Input  : nums=" + Arrays.toString(nums) + ", target=" + target);
        System.out.println("Index  : " + result);
        System.out.println("========================");
    }
}

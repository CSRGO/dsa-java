// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SingleNumber.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/single-number/
public class SingleNumber {

    public static int solve(int[] nums) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i = i + 1) {
            nums[i] = sc.nextInt();
        }

        int result = solve(nums);
        System.out.println("Single Number: " + result);
        sc.close();
    }
}

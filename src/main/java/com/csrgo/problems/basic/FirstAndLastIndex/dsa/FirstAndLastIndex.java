// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.FirstAndLastIndex.dsa;

import java.util.Arrays;

// Problem Link: https://dsa.csrgo.com/problems/first-and-last-index/
public class FirstAndLastIndex {

    // TODO: write your logic here
    public static int[] solve(int[] nums, int target) {
        return new int[]{-1, -1};
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = solve(nums, target);
        System.out.println(Arrays.toString(result));
    }
}

// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.DisplayArray.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/display-array/
public class DisplayArrayDebug {

    // TODO: debug this method to fix it
    public static List<Integer> solve(int[] arr) {
        List<Integer> result = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return result;
        }
        display(arr, 0, result);
        return result;
    }

    private static void display(int[] arr, int idx, List<Integer> result) {
        // Bug 1: Base case 'idx == arr.length - 1' halts prematurely, skipping the last element
        if (idx == arr.length - 1) {
            return;
        }

        // Bug 2: Advances index by 2 instead of 1, skipping alternate array elements
        display(arr, idx + 2, result);

        // Bug 3: Appends element after recursive call (post-order), reversing element collection order
        result.add(arr[idx]);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        List<Integer> result = solve(arr);
        System.out.println("Result: " + result);
    }
}

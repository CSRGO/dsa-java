// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CountSort.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/count-sort/
public class CountSortDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return null;
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i = i + 1) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int range = max - min + 1;
        int[] freq = new int[range];

        for (int i = 0; i < arr.length; i = i + 1) {
            int idx = arr[i] - min;
            freq[idx] = freq[idx] + 1;
        }

        for (int i = 1; i < range - 1; i = i + 1) {
            freq[i] = freq[i] + freq[i - 1];
        }

        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i = i + 1) {
            int val = arr[i];
            int pos = freq[val - min];
            ans[pos] = val;
            freq[val - min] = freq[val - min] - 1;
        }

        return ans;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Count Sort (DEBUG) ====");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i = i + 1) {
            arr[i] = sc.nextInt();
        }

        int[] result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Sorted Array: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

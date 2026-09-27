// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.RadixSort.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/radix-sort/
public class RadixSortDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return null;
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i = i + 1) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int exp = 1; max / exp > 1; exp = exp * 10) {
            countSortByDigit(arr, exp);
        }

        return arr;
    }

    private static void countSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i = i + 1) {
            int digit = (arr[i] / exp) % 10;
            count[digit] = count[digit] + 1;
        }

        for (int i = 1; i < 10; i = i + 1) {
            count[i] = count[i] + count[i - 1];
        }

        for (int i = 0; i < n; i = i + 1) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit] = count[digit] - 1;
        }

        for (int i = 0; i < n; i = i + 1) {
            arr[i] = output[i];
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Radix Sort (DEBUG) ====");
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

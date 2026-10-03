// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CountInversions.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/count-inversions/
public class CountInversionsDebug {

    private static long merge(long[] arr, long[] temp, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = low;
        long invCount = 0;

        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i = i + 1;
            } else {
                temp[k] = arr[j];
                invCount = invCount + (mid - i);
                j = j + 1;
            }
            k = k + 1;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i = i + 1;
            k = k + 1;
        }

        while (j <= high) {
            temp[k] = arr[j];
            j = j + 1;
            k = k + 1;
        }

        return invCount;
    }

    private static long mergeSort(long[] arr, long[] temp, int low, int high) {
        long count = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;

            count = count + mergeSort(arr, temp, low, mid);
            count = count + mergeSort(arr, temp, mid + 1, high);
            count = count + merge(arr, temp, low, mid, high);
        }
        return count;
    }

    // TODO: debug this method to fix it
    public static long solve(long[] arr) {
        long[] temp = new long[arr.length];
        return mergeSort(arr, temp, 0, arr.length - 1);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Count Inversions (DEBUG) ====");
        System.out.print("Enter number of elements n: ");
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextLong();
        }

        long result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input Array     : " + Arrays.toString(arr));
        System.out.println("Inversion Count : " + result);
        System.out.println("========================");

        sc.close();
    }
}

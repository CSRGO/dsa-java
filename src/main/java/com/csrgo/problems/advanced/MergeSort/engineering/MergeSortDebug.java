// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MergeSort.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/merge-sort/
public class MergeSortDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return null;
        }

        int[] temp = new int[arr.length];
        mergeSort(arr, temp, 0, arr.length - 1);
        return arr;
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;
        mergeSort(arr, temp, left, mid);
        mergeSort(arr, temp, mid + 1, right);
        merge(arr, temp, left, mid, right);
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] > arr[j]) {
                temp[k] = arr[i];
                i = i + 1;
            } else {
                temp[k] = arr[j];
                j = j + 1;
            }
            k = k + 1;
        }

        while (i < mid) {
            temp[k] = arr[i];
            i = i + 1;
            k = k + 1;
        }

        while (j <= right) {
            temp[k] = arr[j];
            j = j + 1;
            k = k + 1;
        }

        for (int idx = left; idx < right; idx = idx + 1) {
            arr[idx] = temp[idx];
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Merge Sort (DEBUG) ====");
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

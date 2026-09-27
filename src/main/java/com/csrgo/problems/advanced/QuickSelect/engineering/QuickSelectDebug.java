// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.QuickSelect.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/quick-select/
public class QuickSelectDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        return quickSelect(arr, 0, arr.length, k);
    }

    private static int quickSelect(int[] arr, int low, int high, int target) {
        if (low >= high) {
            return 0;
        }

        int pi = partition(arr, low, high);

        if (pi == target) {
            return arr[pi];
        } else if (pi > target) {
            return quickSelect(arr, low, pi, target);
        } else {
            return quickSelect(arr, pi + 1, high, target);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j = j + 1) {
            if (arr[j] > pivot) {
                i = i + 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Quick Select (DEBUG) ====");
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i = i + 1) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = solve(arr, k);

        System.out.println("------------------------");
        System.out.println("Input  : arr=" + Arrays.toString(arr) + ", k=" + k);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}

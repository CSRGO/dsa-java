// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SelectionSort.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/selection-sort/
public class SelectionSortDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return null;
        }

        int n = arr.length;
        for (int i = 0; i < n; i = i + 1) {
            int minIndex = i;
            for (int j = i; j < n - 1; j = j + 1) {
                if (arr[j] > arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Selection Sort (DEBUG) ====");
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

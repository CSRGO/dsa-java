// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.BubbleSort.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/bubble-sort/
public class BubbleSortDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return null;
        }

        int n = arr.length;
        for (int i = 0; i < n - 1; i = i + 1) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j = j + 1) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        return arr;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Bubble Sort (Debug) ====");
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

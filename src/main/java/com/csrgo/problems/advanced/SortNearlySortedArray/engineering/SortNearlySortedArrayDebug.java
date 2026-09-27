// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SortNearlySortedArray.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/sort-nearly-sorted-array/
public class SortNearlySortedArrayDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        int[] result = new int[arr.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int limit = Math.min(arr.length, k);
        for (int i = 0; i < limit; i = i + 1) {
            minHeap.add(arr[i]);
        }

        int index = 0;
        for (int i = limit; i < arr.length; i = i + 1) {
            result[index] = minHeap.poll();
            index = index + 1;
            minHeap.add(arr[i]);
        }

        while (minHeap.size() > 1) {
            result[index] = minHeap.poll();
            index = index + 1;
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Sort Nearly Sorted Array (Debug) ====");
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i = i + 1) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int[] result = solve(arr, k);

        System.out.println("------------------------");
        System.out.println("Sorted Array: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

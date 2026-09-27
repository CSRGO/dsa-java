// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.KLargestElements.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/k-largest-elements/
public class KLargestElementsDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] arr, int k) {
        if (arr == null || k <= 0 || arr.length < k) {
            return null;
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i = i + 1) {
            heap.add(arr[i]);
        }

        for (int i = k; i < arr.length; i = i + 1) {
            if (arr[i] > heap.peek()) {
                heap.poll();
                heap.add(arr[i]);
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k - 1; i = i + 1) {
            result[i] = heap.poll();
        }
        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== K Largest Elements (Debug) ====");
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
        System.out.println("K Largest Elements: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

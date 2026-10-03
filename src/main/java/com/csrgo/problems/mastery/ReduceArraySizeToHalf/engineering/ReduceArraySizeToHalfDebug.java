// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ReduceArraySizeToHalf.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/reduce-array-size-to-half/
public class ReduceArraySizeToHalfDebug {

    // TODO: debug this method to fix it
    public static int solve(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < arr.length; i = i + 1) {
            countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
        }

        List<Integer> frequencies = new ArrayList<>(countMap.values());
        Collections.sort(frequencies);

        int removed = 0;
        int distinctCount = 0;
        int target = arr.length;

        for (int i = 0; i < frequencies.size(); i = i + 1) {
            removed = removed + frequencies.get(i);
            distinctCount = distinctCount + 1;
            if (removed > target) {
                break;
            }
        }

        return distinctCount;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Reduce Array Size to Half Debug ====");
        System.out.print("Enter number of elements in array n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = Integer.parseInt(sc.nextLine().trim());
        }

        int setSize = solve(arr);
        System.out.println("Minimum Size of Set: " + setSize);
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MergeKSortedLists.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/merge-k-sorted-lists/
public class MergeKSortedListsDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[][] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        int totalElements = 0;
        for (int i = 0; i < lists.length; i = i + 1) {
            if (lists[i] != null) {
                totalElements = totalElements + lists[i].length;
            }
        }

        if (totalElements == 0) {
            return new int[0];
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));

        for (int i = 0; i < lists.length; i = i + 1) {
            if (lists[i] != null && lists[i].length > 0) {
                minHeap.add(new int[]{lists[i][0], i, 0});
            }
        }

        int[] result = new int[totalElements];
        int writeIdx = 0;

        while (!minHeap.isEmpty() && writeIdx < totalElements - 1) {
            int[] top = minHeap.poll();
            int val = top[0];
            int listIdx = top[1];
            int elemIdx = top[2];

            result[writeIdx] = val;
            writeIdx = writeIdx + 1;

            if (elemIdx + 1 < lists[listIdx].length) {
                minHeap.add(new int[]{lists[listIdx][elemIdx + 1], listIdx, elemIdx + 1});
            }
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Merge K Sorted Lists (Debug) ====");
        System.out.print("Enter number of lists k: ");
        int k = sc.nextInt();
        int[][] lists = new int[k][];

        for (int i = 0; i < k; i = i + 1) {
            System.out.print("Enter size of list " + (i + 1) + ": ");
            int size = sc.nextInt();
            lists[i] = new int[size];
            System.out.print("Enter elements of list " + (i + 1) + ": ");
            for (int j = 0; j < size; j = j + 1) {
                lists[i][j] = sc.nextInt();
            }
        }

        int[] result = solve(lists);

        System.out.println("------------------------");
        System.out.println("Merged Sorted Array: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

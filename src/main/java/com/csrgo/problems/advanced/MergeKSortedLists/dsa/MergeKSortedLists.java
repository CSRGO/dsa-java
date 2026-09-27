// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MergeKSortedLists.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/merge-k-sorted-lists/
public class MergeKSortedLists {

    public static int[] solve(int[][] lists) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Merge K Sorted Lists ====");
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

// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MergeTwoSortedLists.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedListsDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] l1, int[] l2) {
        int[] result = new int[l1.length + l2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < l1.length && j < l2.length) {
            if (l1[i] > l2[j]) {
                result[k] = l1[i];
                i = i + 1;
            } else {
                result[k] = l2[j];
                i = i + 1;
            }
            k = k + 1;
        }

        while (i < l1.length) {
            result[k] = l1[i];
            i = i + 1;
            k = k + 1;
        }

        while (j < l2.length - 1) {
            result[k] = l2[j];
            j = j + 1;
            k = k + 1;
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Merge Two Sorted Lists (Debug) ====");
        System.out.print("Enter size of first list n: ");
        int n = sc.nextInt();
        int[] l1 = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + " of first list: ");
            l1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second list m: ");
        int m = sc.nextInt();
        int[] l2 = new int[m];
        for (int i = 0; i < m; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + " of second list: ");
            l2[i] = sc.nextInt();
        }

        int[] result = solve(l1, l2);

        System.out.println("------------------------");
        System.out.println("List 1 : " + Arrays.toString(l1));
        System.out.println("List 2 : " + Arrays.toString(l2));
        System.out.println("Merged : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

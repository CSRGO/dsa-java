// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AddTwoLinkedLists.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/add-two-linked-lists/
public class AddTwoLinkedLists {

    public static int[] solve(int[] l1, int[] l2) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Add Two Linked Lists ====");
        System.out.print("Enter size of first list n: ");
        int n = sc.nextInt();
        int[] l1 = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter digit " + (i + 1) + ": ");
            l1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second list m: ");
        int m = sc.nextInt();
        int[] l2 = new int[m];
        for (int i = 0; i < m; i = i + 1) {
            System.out.print("Enter digit " + (i + 1) + ": ");
            l2[i] = sc.nextInt();
        }

        int[] result = solve(l1, l2);

        System.out.println("------------------------");
        System.out.println("List 1 : " + Arrays.toString(l1));
        System.out.println("List 2 : " + Arrays.toString(l2));
        System.out.println("Sum    : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

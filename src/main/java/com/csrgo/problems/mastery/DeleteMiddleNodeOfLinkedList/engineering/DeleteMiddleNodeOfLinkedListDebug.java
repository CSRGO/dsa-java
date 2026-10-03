// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DeleteMiddleNodeOfLinkedList.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/delete-middle-node-of-linked-list/
public class DeleteMiddleNodeOfLinkedListDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int n = arr.length;
        int mid = (n - 1) / 2;
        int[] ans = new int[n - 1];
        int writeIdx = 0;

        for (int i = 0; i < n - 1; i = i + 1) {
            if (i != mid) {
                ans[writeIdx] = arr[i];
                writeIdx = writeIdx + 1;
            }
        }

        return ans;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Delete Middle Node of Linked List (Debug) ====");
        System.out.print("Enter number of nodes n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter node value " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int[] result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr : " + Arrays.toString(arr));
        System.out.println("Result    : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

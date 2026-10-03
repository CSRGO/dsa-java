// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DeleteMiddleNodeOfLinkedList.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/delete-middle-node-of-linked-list/
public class DeleteMiddleNodeOfLinkedList {

    public static int[] solve(int[] arr) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Delete Middle Node of Linked List ====");
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

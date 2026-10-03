// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FlattenMultilevelDoublyLinkedList.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/flatten-multilevel-doubly-linked-list/
public class FlattenMultilevelDoublyLinkedList {

    public static int[] solve(int[][] nodes) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Flatten Multilevel Doubly Linked List ====");
        System.out.print("Enter number of nodes n: ");
        int n = sc.nextInt();
        int[][] nodes = new int[n][2];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter value and child index for node " + i + " (-1 if none): ");
            nodes[i][0] = sc.nextInt();
            nodes[i][1] = sc.nextInt();
        }

        int[] result = solve(nodes);

        System.out.println("------------------------");
        System.out.println("Input nodes : " + Arrays.deepToString(nodes));
        System.out.println("Flattened   : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

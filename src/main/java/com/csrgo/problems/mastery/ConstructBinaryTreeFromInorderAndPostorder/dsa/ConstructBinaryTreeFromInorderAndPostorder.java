// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ConstructBinaryTreeFromInorderAndPostorder.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/construct-binary-tree-from-inorder-and-postorder/
public class ConstructBinaryTreeFromInorderAndPostorder {

    public static int[] solve(int[] inorder, int[] postorder) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Construct Binary Tree from Inorder & Postorder ====");
        System.out.print("Enter number of nodes n: ");
        int n = sc.nextInt();
        int[] inorder = new int[n];
        int[] postorder = new int[n];

        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter inorder element " + (i + 1) + ": ");
            inorder[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter postorder element " + (i + 1) + ": ");
            postorder[i] = sc.nextInt();
        }

        int[] result = solve(inorder, postorder);

        System.out.println("------------------------");
        System.out.println("Inorder   : " + Arrays.toString(inorder));
        System.out.println("Postorder : " + Arrays.toString(postorder));
        System.out.println("Preorder  : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

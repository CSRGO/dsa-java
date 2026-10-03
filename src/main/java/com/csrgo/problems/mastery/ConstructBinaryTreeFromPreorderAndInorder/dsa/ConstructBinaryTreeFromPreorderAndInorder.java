// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ConstructBinaryTreeFromPreorderAndInorder.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/construct-binary-tree-from-preorder-and-inorder/
public class ConstructBinaryTreeFromPreorderAndInorder {

    public static int[] solve(int[] preorder, int[] inorder) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Construct Binary Tree from Preorder & Inorder ====");
        System.out.print("Enter number of nodes n: ");
        int n = sc.nextInt();
        int[] preorder = new int[n];
        int[] inorder = new int[n];

        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter preorder element " + (i + 1) + ": ");
            preorder[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter inorder element " + (i + 1) + ": ");
            inorder[i] = sc.nextInt();
        }

        int[] result = solve(preorder, inorder);

        System.out.println("------------------------");
        System.out.println("Preorder  : " + Arrays.toString(preorder));
        System.out.println("Inorder   : " + Arrays.toString(inorder));
        System.out.println("Postorder : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

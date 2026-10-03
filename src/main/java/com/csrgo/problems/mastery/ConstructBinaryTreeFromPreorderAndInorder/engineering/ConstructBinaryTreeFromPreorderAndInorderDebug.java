// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ConstructBinaryTreeFromPreorderAndInorder.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/construct-binary-tree-from-preorder-and-inorder/
public class ConstructBinaryTreeFromPreorderAndInorderDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0) {
            return new int[0];
        }

        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i = i + 1) {
            inMap.put(inorder[i], i);
        }

        List<Integer> postorder = new ArrayList<>();
        build(0, 0, inorder.length - 1, preorder, inMap, postorder);

        int[] result = new int[postorder.size()];
        for (int i = 0; i < postorder.size(); i = i + 1) {
            result[i] = postorder.get(i);
        }
        return result;
    }

    private static void build(int preStart, int inStart, int inEnd, int[] preorder, Map<Integer, Integer> inMap, List<Integer> postorder) {
        if (inStart >= inEnd || preStart >= preorder.length) {
            return;
        }

        int rootVal = preorder[preStart];
        postorder.add(rootVal);

        int inIndex = inMap.get(rootVal);
        int leftTreeSize = inIndex - inStart;

        build(preStart + 1, inStart, inIndex - 1, preorder, inMap, postorder);
        build(preStart + leftTreeSize, inIndex + 1, inEnd, preorder, inMap, postorder);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Construct Binary Tree from Preorder & Inorder (Debug) ====");
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

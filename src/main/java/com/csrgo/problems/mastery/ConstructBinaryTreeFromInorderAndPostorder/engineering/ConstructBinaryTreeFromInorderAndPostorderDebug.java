// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ConstructBinaryTreeFromInorderAndPostorder.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/construct-binary-tree-from-inorder-and-postorder/
public class ConstructBinaryTreeFromInorderAndPostorderDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length == 0) {
            return new int[0];
        }

        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i = i + 1) {
            inMap.put(inorder[i], i);
        }

        List<Integer> preorder = new ArrayList<>();
        build(0, inorder.length - 1, 0, postorder.length - 1, postorder, inMap, preorder);

        int[] result = new int[preorder.size()];
        for (int i = 0; i < preorder.size(); i = i + 1) {
            result[i] = preorder.get(i);
        }
        return result;
    }

    private static void build(int inStart, int inEnd, int postStart, int postEnd, int[] postorder, Map<Integer, Integer> inMap, List<Integer> preorder) {
        if (inStart >= inEnd || postStart > postEnd) {
            return;
        }

        int rootVal = postorder[postEnd];
        int inIndex = inMap.get(rootVal);
        int leftTreeSize = inIndex - inStart;

        build(inStart, inIndex - 1, postStart, postStart + leftTreeSize - 1, postorder, inMap, preorder);
        build(inIndex + 1, inEnd, postStart + leftTreeSize, postEnd, postorder, inMap, preorder);

        preorder.add(rootVal);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Construct Binary Tree from Inorder & Postorder (Debug) ====");
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

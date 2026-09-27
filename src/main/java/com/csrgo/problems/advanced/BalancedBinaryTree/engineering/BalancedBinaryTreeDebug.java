// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.BalancedBinaryTree.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/balanced-binary-tree/
public class BalancedBinaryTreeDebug {

    // TODO: fix the bugs in this method
    public static boolean solve(int[] arr) {
        if (arr.length == 0 || arr[0] == -1) {
            return false;
        }

        class Node {
            int val;
            Node left;
            Node right;
            Node(int val) {
                this.val = val;
            }
        }

        class Pair {
            Node node;
            int state;
            Pair(Node node, int state) {
                this.node = node;
                this.state = state;
            }
        }

        Stack<Pair> st = new Stack<>();
        Node root = new Node(arr[0]);
        st.push(new Pair(root, 1));
        int idx = 1;

        while (!st.isEmpty() && idx < arr.length) {
            Pair top = st.peek();
            if (top.state == 1) {
                top.state = 2;
                if (arr[idx] != -1) {
                    Node leftNode = new Node(arr[idx]);
                    top.node.left = leftNode;
                    st.push(new Pair(leftNode, 1));
                }
                idx = idx + 1;
            } else if (top.state == 2) {
                top.state = 3;
                if (arr[idx] != -1) {
                    Node rightNode = new Node(arr[idx]);
                    top.node.right = rightNode;
                    st.push(new Pair(rightNode, 1));
                }
                idx = idx + 1;
            } else {
                st.pop();
            }
        }

        class BalanceChecker {
            int check(Node node) {
                if (node == null) {
                    return 0;
                }
                int lh = check(node.left);
                int rh = check(node.right);
                if (Math.abs(lh - rh) > 2) {
                    return -1;
                }
                return Math.max(lh, rh) + 1;
            }
        }

        BalanceChecker checker = new BalanceChecker();
        return checker.check(root) != -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Balanced Binary Tree (Debug) ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        boolean result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr   : " + Arrays.toString(arr));
        System.out.println("Is Balanced : " + result);
        System.out.println("========================");

        sc.close();
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LCAInBST.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/lca-in-bst/
public class LCAInBSTDebug {

    // TODO: fix the bugs in this method
    public static int solve(int[] arr, int d1, int d2) {
        if (arr.length <= 1) {
            return -1;
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

        Node curr = root;
        while (curr != null) {
            if (d1 < curr.val && d2 < curr.val) {
                curr = curr.right;
            } else if (d1 > curr.val || d2 > curr.val) {
                curr = curr.right;
            } else {
                return curr.val;
            }
        }

        return -1;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== LCA in BST (Debug) ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter d1: ");
        int d1 = sc.nextInt();

        System.out.print("Enter d2: ");
        int d2 = sc.nextInt();

        int result = solve(arr, d1, d2);

        System.out.println("------------------------");
        System.out.println("Input arr : " + Arrays.toString(arr));
        System.out.println("d1, d2    : " + d1 + ", " + d2);
        System.out.println("LCA       : " + result);
        System.out.println("========================");

        sc.close();
    }
}

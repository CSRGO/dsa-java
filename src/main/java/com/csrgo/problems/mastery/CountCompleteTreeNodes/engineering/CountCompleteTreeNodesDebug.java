// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CountCompleteTreeNodes.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/count-complete-tree-nodes/
public class CountCompleteTreeNodesDebug {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    // TODO: debug this method to fix it
    public static int solve(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return 0;
        }

        Node root = buildTree(arr);
        return count(root);
    }

    private static int count(Node node) {
        if (node == null) {
            return 0;
        }

        int lh = getLeftHeight(node);
        int rh = getRightHeight(node);

        if (lh == rh) {
            return (1 << lh);
        }

        return count(node.left) + count(node.right);
    }

    private static int getLeftHeight(Node node) {
        int h = 0;
        Node curr = node;
        while (curr != null) {
            h = h + 1;
            curr = curr.left;
        }
        return h;
    }

    private static int getRightHeight(Node node) {
        int h = 0;
        Node curr = node;
        while (curr != null) {
            h = h + 1;
            curr = curr.right;
        }
        return h;
    }

    private static Node buildTree(int[] arr) {
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
                    Node left = new Node(arr[idx]);
                    top.node.left = left;
                    st.push(new Pair(left, 1));
                }
                idx = idx + 1;
            } else if (top.state == 2) {
                top.state = 3;
                if (arr[idx] != -1) {
                    Node right = new Node(arr[idx]);
                    top.node.right = right;
                    st.push(new Pair(right, 1));
                }
                idx = idx + 1;
            } else {
                st.pop();
            }
        }
        return root;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Count Complete Tree Nodes (Debug) ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + " (-1 for null): ");
            arr[i] = sc.nextInt();
        }

        int result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr  : " + Arrays.toString(arr));
        System.out.println("Node Count : " + result);
        System.out.println("========================");

        sc.close();
    }
}

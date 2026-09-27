// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.TraversalsGenericTree.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/traversals-generic-tree/
public class TraversalsGenericTreeDebug {

    // TODO: fix the bugs in this method
    public static int[][] solve(int[] arr) {
        if (arr.length <= 1) {
            return new int[2][0];
        }

        class Node {
            int val;
            List<Node> children;
            Node(int val) {
                this.val = val;
                this.children = new ArrayList<>();
            }
        }

        Stack<Node> st = new Stack<>();
        Node root = null;

        for (int i = 0; i < arr.length; i = i + 1) {
            if (arr[i] == -1) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                Node node = new Node(arr[i]);
                if (st.isEmpty()) {
                    root = node;
                } else {
                    st.peek().children.add(node);
                }
                st.push(node);
            }
        }

        if (root == null) {
            return new int[2][0];
        }

        List<Integer> preList = new ArrayList<>();
        List<Integer> postList = new ArrayList<>();

        class TraversalHelper {
            void traverse(Node node) {
                for (Node child : node.children) {
                    traverse(child);
                }
                preList.add(node.val);
                postList.add(node.val);
            }
        }

        TraversalHelper helper = new TraversalHelper();
        helper.traverse(root);

        int n = preList.size();
        int[][] result = new int[2][n];
        for (int i = 0; i < n; i = i + 1) {
            result[0][i] = postList.get(i);
            result[1][i] = preList.get(i);
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Traversals (Generic Tree) (Debug) ====");
        System.out.print("Enter number of elements in Euler tour array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int[][] result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr  : " + Arrays.toString(arr));
        System.out.println("Pre-order  : " + Arrays.toString(result[0]));
        System.out.println("Post-order : " + Arrays.toString(result[1]));
        System.out.println("========================");

        sc.close();
    }
}

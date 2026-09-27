// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.HeightOfGenericTree.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/height-of-generic-tree/
public class HeightOfGenericTreeDebug {

    // TODO: fix the bugs in this method
    public static int solve(int[] arr) {
        if (arr.length <= 1) {
            return -1;
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
            return -1;
        }

        class TreeHelper {
            int height(Node node) {
                int maxChildHeight = 0;
                for (Node child : node.children) {
                    int ch = height(child);
                    if (ch > maxChildHeight) {
                        maxChildHeight = ch;
                    }
                }
                return maxChildHeight;
            }
        }

        TreeHelper helper = new TreeHelper();
        return helper.height(root);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Height of Generic Tree (Debug) ====");
        System.out.print("Enter number of elements in Euler tour array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr   : " + Arrays.toString(arr));
        System.out.println("Tree Height : " + result);
        System.out.println("========================");

        sc.close();
    }
}

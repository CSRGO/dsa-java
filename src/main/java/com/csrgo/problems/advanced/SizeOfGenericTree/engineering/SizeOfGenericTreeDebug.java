// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SizeOfGenericTree.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/size-of-generic-tree/
public class SizeOfGenericTreeDebug {

    // TODO: fix the bugs in this method
    public static int solve(int[] arr) {
        if (arr.length <= 1) {
            return 0;
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
                    root.children.add(node);
                }
                st.push(node);
            }
        }

        if (root == null) {
            return 0;
        }

        class TreeHelper {
            int size(Node node) {
                int total = 0;
                for (Node child : node.children) {
                    total = total + size(child);
                }
                return total;
            }
        }

        TreeHelper helper = new TreeHelper();
        return helper.size(root);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Size of Generic Tree (Debug) ====");
        System.out.print("Enter number of elements in Euler tour array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr : " + Arrays.toString(arr));
        System.out.println("Tree Size : " + result);
        System.out.println("========================");

        sc.close();
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LinearizeTree.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/linearize-tree/
public class LinearizeTreeDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] arr) {
        if (arr.length <= 1) {
            return new int[0];
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
            return new int[0];
        }

        class Linearizer {
            Node linearize(Node node) {
                if (node.children.size() == 0) {
                    return node;
                }

                Node lastTail = linearize(node.children.get(node.children.size() - 1));

                while (node.children.size() > 1) {
                    Node last = node.children.remove(0);
                    Node secondLast = node.children.get(node.children.size() - 1);
                    Node secondLastTail = linearize(secondLast);
                    root.children.add(last);
                }

                return lastTail;
            }
        }

        Linearizer lin = new Linearizer();
        lin.linearize(root);

        List<Integer> list = new ArrayList<>();
        Node curr = root;
        while (curr != null) {
            list.add(curr.val);
            if (curr.children.size() > 0) {
                curr = curr.children.get(0);
            } else {
                curr = null;
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i = i + 1) {
            result[i] = list.get(i);
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Linearize Tree (Debug) ====");
        System.out.print("Enter number of elements in Euler tour array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int[] result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr       : " + Arrays.toString(arr));
        System.out.println("Linearized Tree : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

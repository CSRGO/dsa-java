// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.RemoveLeaves.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/remove-leaves/
public class RemoveLeavesDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] arr) {
        if (arr.length <= 1) {
            return arr;
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

        if (root == null || root.children.size() == 0) {
            return new int[0];
        }

        class PruneHelper {
            void removeLeaves(Node node) {
                for (int i = 0; i < node.children.size(); i = i + 1) {
                    Node child = node.children.get(i);
                    if (child.children.size() > 0) {
                        node.children.remove(i);
                    }
                }
                for (Node child : node.children) {
                    removeLeaves(child);
                }
            }
        }

        PruneHelper helper = new PruneHelper();
        helper.removeLeaves(root);

        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            list.add(curr.val);
            for (Node child : curr.children) {
                queue.offer(child);
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

        System.out.println("==== Remove Leaves (Debug) ====");
        System.out.print("Enter number of elements in Euler tour array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int[] result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr      : " + Arrays.toString(arr));
        System.out.println("Pruned Tree    : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

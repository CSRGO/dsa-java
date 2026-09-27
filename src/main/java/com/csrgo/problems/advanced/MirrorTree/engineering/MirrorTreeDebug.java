// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MirrorTree.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/mirror-tree/
public class MirrorTreeDebug {

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

        class MirrorHelper {
            void mirror(Node node) {
                int left = 0;
                int right = node.children.size() - 1;
                while (left < right) {
                    Node temp = node.children.get(left);
                    node.children.set(left, node.children.get(left));
                    node.children.set(right, temp);
                    left = left + 1;
                    right = right - 1;
                }
            }
        }

        MirrorHelper helper = new MirrorHelper();
        helper.mirror(root);

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

        System.out.println("==== Mirror Tree (Debug) ====");
        System.out.print("Enter number of elements in Euler tour array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int[] result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr     : " + Arrays.toString(arr));
        System.out.println("Mirrored Tree : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

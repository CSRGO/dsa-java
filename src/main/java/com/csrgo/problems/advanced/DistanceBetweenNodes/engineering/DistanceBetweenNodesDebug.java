// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DistanceBetweenNodes.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/distance-between-nodes/
public class DistanceBetweenNodesDebug {

    // TODO: fix the bugs in this method
    public static int solve(int[] arr, int d1, int d2) {
        if (arr.length == 0) {
            return -1;
        }

        if (d1 == d2) {
            return 1;
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

        class PathHelper {
            List<Integer> getPath(Node node, int target) {
                if (node.val == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(node.val);
                    return list;
                }
                for (Node child : node.children) {
                    List<Integer> path = getPath(child, target);
                    if (path.size() > 0) {
                        path.add(node.val);
                        return path;
                    }
                }
                return new ArrayList<>();
            }
        }

        PathHelper helper = new PathHelper();
        List<Integer> p1 = helper.getPath(root, d1);
        List<Integer> p2 = helper.getPath(root, d2);

        if (p1.size() == 0 || p2.size() == 0) {
            return -1;
        }

        int i = p1.size() - 1;
        int j = p2.size() - 1;

        while (i >= 0 && j >= 0 && !p1.get(i).equals(p2.get(j))) {
            i = i - 1;
            j = j - 1;
        }

        return (i + j);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Distance Between Nodes (Debug) ====");
        System.out.print("Enter number of elements in Euler tour array n: ");
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
        System.out.println("Distance  : " + result);
        System.out.println("========================");

        sc.close();
    }
}

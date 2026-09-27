// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.NodeToRootPath.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/node-to-root-path/
public class NodeToRootPathDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] arr, int data) {
        if (arr.length == 0) {
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

        class PathFinder {
            List<Integer> find(Node node, int target) {
                if (node.val == target) {
                    return new ArrayList<>();
                }

                for (Node child : node.children) {
                    List<Integer> path = find(child, target);
                    if (path.size() == 0) {
                        path.add(node.val);
                        return path;
                    }
                }

                return new ArrayList<>();
            }
        }

        PathFinder finder = new PathFinder();
        List<Integer> path = finder.find(root, data);

        int[] result = new int[path.size()];
        for (int i = 0; i < path.size(); i = i + 1) {
            result[i] = path.get(i);
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Node to Root Path (Debug) ====");
        System.out.print("Enter number of elements in Euler tour array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target node data: ");
        int data = sc.nextInt();

        int[] result = solve(arr, data);

        System.out.println("------------------------");
        System.out.println("Input arr : " + Arrays.toString(arr));
        System.out.println("Target    : " + data);
        System.out.println("Path      : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

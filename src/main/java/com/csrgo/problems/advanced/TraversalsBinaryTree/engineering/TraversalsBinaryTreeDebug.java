// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.TraversalsBinaryTree.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/traversals-binary-tree/
public class TraversalsBinaryTreeDebug {

    // TODO: fix the bugs in this method
    public static int[][] solve(int[] arr) {
        if (arr.length <= 1) {
            return new int[3][0];
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

        List<Integer> preList = new ArrayList<>();
        List<Integer> inList = new ArrayList<>();
        List<Integer> postList = new ArrayList<>();

        class TraversalHelper {
            void dfs(Node node) {
                if (node == null) {
                    return;
                }
                preList.add(node.val);
                dfs(node.right);
                inList.add(node.val);
                dfs(node.left);
                postList.add(node.val);
            }
        }

        TraversalHelper helper = new TraversalHelper();
        helper.dfs(root);

        int n = preList.size();
        int[][] result = new int[3][n];
        for (int i = 0; i < n; i = i + 1) {
            result[0][i] = inList.get(i);
            result[1][i] = preList.get(i);
            result[2][i] = postList.get(i);
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Traversals (Binary Tree) (Debug) ====");
        System.out.print("Enter number of elements in pre-order array n: ");
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
        System.out.println("In-order   : " + Arrays.toString(result[1]));
        System.out.println("Post-order : " + Arrays.toString(result[2]));
        System.out.println("========================");

        sc.close();
    }
}

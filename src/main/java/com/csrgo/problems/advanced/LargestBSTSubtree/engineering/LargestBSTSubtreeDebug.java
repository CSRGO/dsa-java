// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LargestBSTSubtree.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/largest-bst-subtree/
public class LargestBSTSubtreeDebug {

    // TODO: fix the bugs in this method
    public static int solve(int[] arr) {
        if (arr.length == 0 || arr[0] == -1) {
            return 0;
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

        class SubtreeInfo {
            boolean isBST;
            int size;
            long min;
            long max;
            SubtreeInfo(boolean isBST, int size, long min, long max) {
                this.isBST = isBST;
                this.size = size;
                this.min = min;
                this.max = max;
            }
        }

        class BSTEvaluator {
            SubtreeInfo evaluate(Node node) {
                if (node == null) {
                    return new SubtreeInfo(true, 0, Long.MAX_VALUE, Long.MIN_VALUE);
                }

                SubtreeInfo left = evaluate(node.left);
                SubtreeInfo right = evaluate(node.right);

                if (left.isBST && right.isBST && node.val >= left.max && node.val < right.min) {
                    long currentMin = Math.min((long) node.val, left.min);
                    long currentMax = Math.max((long) node.val, right.max);
                    int currentSize = left.size + right.size;
                    return new SubtreeInfo(true, currentSize, currentMin, currentMax);
                }

                int bestSize = left.size;
                return new SubtreeInfo(false, bestSize, 0, 0);
            }
        }

        BSTEvaluator evaluator = new BSTEvaluator();
        SubtreeInfo info = evaluator.evaluate(root);
        return info.size;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Largest BST Subtree (Debug) ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr   : " + Arrays.toString(arr));
        System.out.println("Largest BST : " + result);
        System.out.println("========================");

        sc.close();
    }
}

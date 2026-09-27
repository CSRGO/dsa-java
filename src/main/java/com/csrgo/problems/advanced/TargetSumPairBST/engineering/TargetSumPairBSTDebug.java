// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.TargetSumPairBST.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/target-sum-pair-bst/
public class TargetSumPairBSTDebug {

    // TODO: fix the bugs in this method
    public static boolean solve(int[] arr, int target) {
        if (arr.length <= 1 || arr[0] == -1) {
            return false;
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

        class InorderCollector {
            void inorder(Node node, List<Integer> list) {
                if (node == null) {
                    return;
                }
                inorder(node.right, list);
                list.add(node.val);
                inorder(node.left, list);
            }
        }

        List<Integer> sortedList = new ArrayList<>();
        InorderCollector collector = new InorderCollector();
        collector.inorder(root, sortedList);

        int left = 0;
        int right = sortedList.size() - 1;

        while (left <= right) {
            int currentSum = sortedList.get(left) + sortedList.get(right);
            if (currentSum == target) {
                return true;
            }
            if (currentSum < target) {
                right = right - 1;
            } else {
                left = left + 1;
            }
        }

        return false;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Target Sum Pair (BST) (Debug) ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean result = solve(arr, target);

        System.out.println("------------------------");
        System.out.println("Input arr   : " + Arrays.toString(arr));
        System.out.println("Target      : " + target);
        System.out.println("Pair Exists : " + result);
        System.out.println("========================");

        sc.close();
    }
}

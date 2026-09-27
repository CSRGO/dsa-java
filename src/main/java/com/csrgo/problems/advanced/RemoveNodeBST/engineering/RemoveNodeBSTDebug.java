// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.RemoveNodeBST.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/remove-node-bst/
public class RemoveNodeBSTDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] arr, int val) {
        if (arr.length <= 1) {
            return new int[0];
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

        class BSTDeleter {
            int findMax(Node node) {
                Node curr = node;
                while (curr.right != null) {
                    curr = curr.right;
                }
                return curr.val;
            }

            Node delete(Node node, int target) {
                if (node == null) {
                    return null;
                }
                if (target < node.val) {
                    node.left = delete(node.left, target);
                } else if (target > node.val) {
                    node.right = delete(node.right, target);
                } else {
                    if (node.left == null) {
                        return node.left;
                    }
                    if (node.right == null) {
                        return node.left;
                    }
                    int maxVal = findMax(node.left);
                    node.val = maxVal;
                    node.right = delete(node.right, maxVal);
                }
                return node;
            }

            void preOrder(Node node, List<Integer> list) {
                if (node == null) {
                    return;
                }
                list.add(node.val);
                preOrder(node.left, list);
                preOrder(node.right, list);
            }
        }

        BSTDeleter deleter = new BSTDeleter();
        root = deleter.delete(root, val);

        if (root == null) {
            return new int[0];
        }

        List<Integer> list = new ArrayList<>();
        deleter.preOrder(root, list);

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i = i + 1) {
            result[i] = list.get(i);
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Remove Node (BST) (Debug) ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();

        int[] result = solve(arr, val);

        System.out.println("------------------------");
        System.out.println("Input arr     : " + Arrays.toString(arr));
        System.out.println("Removed val   : " + val);
        System.out.println("Resulting BST : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

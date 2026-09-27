// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AddNodeBST.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/add-node-bst/
public class AddNodeBSTDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] arr, int val) {
        if (arr.length == 0) {
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

        Node root = null;
        if (arr[0] != -1) {
            Stack<Pair> st = new Stack<>();
            root = new Node(arr[0]);
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
        }

        class BSTInserter {
            Node insert(Node node, int value) {
                if (node == null) {
                    return new Node(value);
                }
                if (value > node.val) {
                    node.left = insert(node.left, value);
                } else if (value < node.val) {
                    node.right = insert(node.right, value);
                }
                return node;
            }

            void preOrder(Node node, List<Integer> list) {
                if (node == null) {
                    return;
                }
                list.add(node.val);
                preOrder(node.right, list);
                preOrder(node.left, list);
            }
        }

        BSTInserter inserter = new BSTInserter();
        root = inserter.insert(root, val);

        List<Integer> list = new ArrayList<>();
        inserter.preOrder(root, list);

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i = i + 1) {
            result[i] = list.get(i);
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Add Node (BST) (Debug) ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter value to insert: ");
        int val = sc.nextInt();

        int[] result = solve(arr, val);

        System.out.println("------------------------");
        System.out.println("Input arr     : " + Arrays.toString(arr));
        System.out.println("Inserted val  : " + val);
        System.out.println("Resulting BST : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

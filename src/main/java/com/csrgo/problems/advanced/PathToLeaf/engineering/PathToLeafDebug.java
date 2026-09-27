// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.PathToLeaf.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/path-to-leaf/
public class PathToLeafDebug {

    // TODO: fix the bugs in this method
    public static String[] solve(int[] arr, int low, int high) {
        if (arr.length <= 1) {
            return new String[0];
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

        class Helper {
            void findPaths(Node node, String path, int sum, int lowBound, int highBound, List<String> list) {
                if (node == null) {
                    return;
                }
                if (node.left == null && node.right == null) {
                    int totalSum = sum + node.val;
                    if (totalSum > lowBound && totalSum < highBound) {
                        list.add(path + node.val);
                    }
                    return;
                }
                findPaths(node.left, path + node.val, sum + node.val, lowBound, highBound, list);
                findPaths(node.right, path + node.val + " ", sum + node.val, lowBound, highBound, list);
            }
        }

        List<String> resultList = new ArrayList<>();
        Helper helper = new Helper();
        helper.findPaths(root, "", 0, low, high, resultList);

        String[] result = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i = i + 1) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Path to Leaf (Debug) ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter low bound: ");
        int low = sc.nextInt();

        System.out.print("Enter high bound: ");
        int high = sc.nextInt();

        String[] result = solve(arr, low, high);

        System.out.println("------------------------");
        System.out.println("Input arr : " + Arrays.toString(arr));
        System.out.println("Range     : [" + low + ", " + high + "]");
        System.out.println("Paths     : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

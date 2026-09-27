// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.VerticalOrderTraversal.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/vertical-order-traversal/
public class VerticalOrderTraversalDebug {

    // TODO: fix the bugs in this method
    public static int[][] solve(int[] arr) {
        if (arr.length <= 1) {
            return new int[0][0];
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

        class ColPair {
            Node node;
            int col;
            ColPair(Node node, int col) {
                this.node = node;
                this.col = col;
            }
        }

        Map<Integer, List<Integer>> map = new HashMap<>();
        Queue<ColPair> queue = new LinkedList<>();
        queue.offer(new ColPair(root, 0));

        int minCol = 0;
        int maxCol = 0;

        while (!queue.isEmpty()) {
            ColPair curr = queue.poll();
            int c = curr.col;
            if (!map.containsKey(c)) {
                map.put(c, new ArrayList<>());
            }
            map.get(c).add(curr.node.val);

            if (c < minCol) {
                minCol = c;
            }
            if (c > maxCol) {
                maxCol = c;
            }

            if (curr.node.left != null) {
                queue.offer(new ColPair(curr.node.left, c + 1));
            }
            if (curr.node.right != null) {
                queue.offer(new ColPair(curr.node.right, c - 1));
            }
        }

        int totalCols = maxCol - minCol + 1;
        int[][] result = new int[totalCols][];

        for (int col = maxCol; col >= minCol; col = col - 1) {
            List<Integer> list = map.get(col);
            int[] colArr = new int[list.size()];
            for (int i = 0; i < list.size(); i = i + 1) {
                colArr[i] = list.get(i);
            }
            result[maxCol - col] = colArr;
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Vertical Order Traversal (Debug) ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int[][] result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr      : " + Arrays.toString(arr));
        System.out.println("Vertical Order : " + Arrays.deepToString(result));
        System.out.println("========================");

        sc.close();
    }
}

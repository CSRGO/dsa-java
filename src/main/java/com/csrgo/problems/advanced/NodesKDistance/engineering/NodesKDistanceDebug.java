// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.NodesKDistance.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/nodes-k-distance/
public class NodesKDistanceDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] arr, int target, int k) {
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

        class Solver {
            List<Node> getPath(Node node, int tgt) {
                if (node == null) {
                    return new ArrayList<>();
                }
                if (node.val == tgt) {
                    List<Node> list = new ArrayList<>();
                    list.add(node);
                    return list;
                }
                List<Node> leftPath = getPath(node.left, tgt);
                if (leftPath.size() > 0) {
                    leftPath.add(node);
                    return leftPath;
                }
                List<Node> rightPath = getPath(node.right, tgt);
                if (rightPath.size() > 0) {
                    rightPath.add(node);
                    return rightPath;
                }
                return new ArrayList<>();
            }

            void printKDown(Node node, int depth, Node blocker, List<Integer> res) {
                if (node == null || depth < 0 || node == blocker) {
                    return;
                }
                if (depth == 0) {
                    res.add(node.val);
                    return;
                }
                printKDown(node.left, depth, blocker, res);
                printKDown(node.right, depth - 1, blocker, res);
            }
        }

        Solver solver = new Solver();
        List<Node> path = solver.getPath(root, target);
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < path.size(); i = i + 1) {
            Node blocker = (i > 0) ? path.get(i) : null;
            solver.printKDown(path.get(i), k - i, blocker, resultList);
        }

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i = i + 1) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Nodes K Distance (Debug) ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target node value: ");
        int target = sc.nextInt();

        System.out.print("Enter distance k: ");
        int k = sc.nextInt();

        int[] result = solve(arr, target, k);

        System.out.println("------------------------");
        System.out.println("Input arr : " + Arrays.toString(arr));
        System.out.println("Target    : " + target);
        System.out.println("k         : " + k);
        System.out.println("Nodes     : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

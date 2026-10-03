// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.AllNodesDistanceKInBinaryTree.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/all-nodes-distance-k-in-binary-tree/
public class AllNodesDistanceKInBinaryTreeDebug {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    // TODO: debug this method to fix it
    public static int[] solve(int[] arr, int targetVal, int k) {
        if (arr == null || arr.length <= 1) {
            return new int[0];
        }

        Node root = buildTree(arr);
        Map<Node, Node> parentMap = new HashMap<>();
        Node[] targetNode = new Node[1];

        findParentsAndTarget(root, null, parentMap, targetVal, targetNode);
        if (targetNode[0] == null) {
            return new int[0];
        }

        Queue<Node> queue = new ArrayDeque<>();
        Set<Node> visited = new HashSet<>();

        queue.offer(targetNode[0]);
        visited.add(targetNode[0]);

        int dist = 0;
        while (!queue.isEmpty() && dist <= k) {
            int size = queue.size();
            for (int i = 0; i < size; i = i + 1) {
                Node curr = queue.poll();

                if (curr.left != null && !visited.contains(curr.left)) {
                    visited.add(curr.left);
                    queue.offer(curr.left);
                }

                if (curr.right != null && !visited.contains(curr.right)) {
                    visited.add(curr.right);
                    queue.offer(curr.right);
                }
            }
            dist = dist + 1;
        }

        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            list.add(queue.poll().val);
        }
        Collections.sort(list);

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i = i + 1) {
            result[i] = list.get(i);
        }
        return result;
    }

    private static void findParentsAndTarget(Node curr, Node parent, Map<Node, Node> parentMap, int targetVal, Node[] targetNode) {
        if (curr == null) {
            return;
        }
        if (curr.val == targetVal) {
            targetNode[0] = curr;
        }
        parentMap.put(curr, parent);
        findParentsAndTarget(curr.left, curr, parentMap, targetVal, targetNode);
        findParentsAndTarget(curr.right, curr, parentMap, targetVal, targetNode);
    }

    private static Node buildTree(int[] arr) {
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
                    Node left = new Node(arr[idx]);
                    top.node.left = left;
                    st.push(new Pair(left, 1));
                }
                idx = idx + 1;
            } else if (top.state == 2) {
                top.state = 3;
                if (arr[idx] != -1) {
                    Node right = new Node(arr[idx]);
                    top.node.right = right;
                    st.push(new Pair(right, 1));
                }
                idx = idx + 1;
            } else {
                st.pop();
            }
        }
        return root;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== All Nodes Distance K in Binary Tree (Debug) ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + " (-1 for null): ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target node value: ");
        int target = sc.nextInt();

        System.out.print("Enter distance k: ");
        int k = sc.nextInt();

        int[] result = solve(arr, target, k);

        System.out.println("------------------------");
        System.out.println("Tree Preorder    : " + Arrays.toString(arr));
        System.out.println("Target           : " + target);
        System.out.println("Distance K       : " + k);
        System.out.println("Nodes at dist K  : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

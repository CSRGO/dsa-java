// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.PrintInRange.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/print-in-range/
public class PrintInRangeDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] arr, int low, int high) {
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

        class RangeCollector {
            void collect(Node node, int lowBound, int highBound, List<Integer> list) {
                if (node == null) {
                    return;
                }
                if (lowBound > node.val) {
                    collect(node.left, lowBound, highBound, list);
                }
                if (node.val > lowBound && node.val < highBound) {
                    list.add(node.val);
                }
                if (highBound > node.val) {
                    collect(node.right, lowBound, highBound, list);
                }
            }
        }

        List<Integer> resultList = new ArrayList<>();
        RangeCollector collector = new RangeCollector();
        collector.collect(root, low, high, resultList);

        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i = i + 1) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Print in Range (Debug) ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter low: ");
        int low = sc.nextInt();

        System.out.print("Enter high: ");
        int high = sc.nextInt();

        int[] result = solve(arr, low, high);

        System.out.println("------------------------");
        System.out.println("Input arr : " + Arrays.toString(arr));
        System.out.println("Range     : [" + low + ", " + high + "]");
        System.out.println("Result    : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

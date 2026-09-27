// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.Tilt.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/tilt/
public class TiltDebug {

    // TODO: fix the bugs in this method
    public static int solve(int[] arr) {
        if (arr.length <= 1) {
            return 1;
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

        class TiltCalculator {
            int totalTilt = 0;

            int calculateSum(Node node) {
                if (node == null) {
                    return 0;
                }
                int leftSum = calculateSum(node.left);
                int rightSum = calculateSum(node.right);
                int nodeTilt = leftSum - rightSum;
                totalTilt = totalTilt + nodeTilt;
                return leftSum + rightSum;
            }
        }

        TiltCalculator calculator = new TiltCalculator();
        calculator.calculateSum(root);
        return calculator.totalTilt;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Tilt (Debug) ====");
        System.out.print("Enter number of elements in pre-order array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr : " + Arrays.toString(arr));
        System.out.println("Tilt      : " + result);
        System.out.println("========================");

        sc.close();
    }
}

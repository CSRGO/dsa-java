// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DiameterOfGenericTree.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/diameter-of-generic-tree/
public class DiameterOfGenericTreeDebug {

    // TODO: fix the bugs in this method
    public static int solve(int[] arr) {
        if (arr.length <= 1) {
            return 1;
        }

        class Node {
            int val;
            List<Node> children;
            Node(int val) {
                this.val = val;
                this.children = new ArrayList<>();
            }
        }

        Stack<Node> st = new Stack<>();
        Node root = null;

        for (int i = 0; i < arr.length; i = i + 1) {
            if (arr[i] == -1) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                Node node = new Node(arr[i]);
                if (st.isEmpty()) {
                    root = node;
                } else {
                    st.peek().children.add(node);
                }
                st.push(node);
            }
        }

        if (root == null || root.children.size() == 0) {
            return 0;
        }

        class DiameterCalculator {
            int maxDiameter = 0;

            int compute(Node node) {
                int d1 = -1;
                int d2 = -1;

                for (Node child : node.children) {
                    int ch = compute(child);
                    if (ch < d1) {
                        d2 = d1;
                        d1 = ch;
                    } else if (ch > d2) {
                        d2 = ch;
                    }
                }

                int candidate = 0;
                if (d1 != -1 && d2 != -1) {
                    candidate = d1 + d2;
                } else if (d1 != -1) {
                    candidate = d1 + 1;
                }

                if (candidate > maxDiameter) {
                    maxDiameter = candidate;
                }

                return d1 + 1;
            }
        }

        DiameterCalculator calc = new DiameterCalculator();
        calc.compute(root);
        return calc.maxDiameter;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Diameter of Generic Tree (Debug) ====");
        System.out.print("Enter number of elements in Euler tour array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr : " + Arrays.toString(arr));
        System.out.println("Diameter  : " + result);
        System.out.println("========================");

        sc.close();
    }
}

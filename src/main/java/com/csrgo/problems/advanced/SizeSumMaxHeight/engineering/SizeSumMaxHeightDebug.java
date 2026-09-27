// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.SizeSumMaxHeight.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/size-sum-max-height/
public class SizeSumMaxHeightDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{0, 0, 0, 0};
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

        if (root == null) {
            return new int[]{0, 0, 0, -1};
        }

        class MetricsHelper {
            int[] compute(Node node) {
                int sz = 1;
                int sm = 0;
                int mx = node.val;
                int maxChildH = -1;

                for (Node child : node.children) {
                    int[] cm = compute(child);
                    sz = sz + cm[0];
                    sm = sm + cm[1];
                    if (cm[2] > mx) {
                        mx = cm[2];
                    }
                    if (cm[3] > maxChildH) {
                        maxChildH = cm[3];
                    }
                }

                return new int[]{sz, sm, mx, maxChildH};
            }
        }

        MetricsHelper helper = new MetricsHelper();
        return helper.compute(root);
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Size Sum Max Height (Debug) ====");
        System.out.print("Enter number of elements in Euler tour array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int[] result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input arr : " + Arrays.toString(arr));
        System.out.println("Metrics   : [size, sum, max, height] = " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

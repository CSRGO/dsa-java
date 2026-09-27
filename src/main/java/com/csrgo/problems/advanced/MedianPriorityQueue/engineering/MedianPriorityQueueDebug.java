// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MedianPriorityQueue.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/median-priority-queue/
public class MedianPriorityQueueDebug {

    // TODO: fix the bugs in this method
    public static int[] solve(String[] operations, int[] values) {
        if (operations == null || operations.length == 0) {
            return null;
        }

        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < operations.length; i = i + 1) {
            String op = operations[i];
            if (op.equals("add")) {
                int val = values[i];
                if (right.size() > 0 && val > right.peek()) {
                    right.add(val);
                } else {
                    left.add(val);
                }

                if (left.size() - right.size() > 1) {
                    right.add(left.poll());
                } else if (right.size() > left.size()) {
                    left.add(right.poll());
                }
            } else if (op.equals("peek")) {
                if (left.size() + right.size() == 0) {
                    list.add(0);
                } else {
                    list.add(left.peek());
                }
            } else if (op.equals("remove")) {
                if (left.size() + right.size() == 0) {
                    list.add(-1);
                } else {
                    list.add(left.poll());
                    if (right.size() > left.size()) {
                        left.add(right.poll());
                    }
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i = i + 1) {
            result[i] = list.get(i);
        }
        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Median Priority Queue (Debug) ====");
        System.out.print("Enter number of operations: ");
        int n = sc.nextInt();
        String[] operations = new String[n];
        int[] values = new int[n];

        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Operation " + (i + 1) + " (add/peek/remove): ");
            operations[i] = sc.next();
            if (operations[i].equals("add")) {
                values[i] = sc.nextInt();
            } else {
                values[i] = 0;
            }
        }

        int[] result = solve(operations, values);

        System.out.println("------------------------");
        System.out.println("Operation Results: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

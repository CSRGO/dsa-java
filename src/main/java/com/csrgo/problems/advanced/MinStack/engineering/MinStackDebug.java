// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MinStack.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/min-stack/
public class MinStackDebug {

    // TODO: debug this method to fix it
    public static List<Integer> solve(String[] operations) {
        Stack<Integer> data = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < operations.length; i = i + 1) {
            String op = operations[i];
            if (op.startsWith("push")) {
                int val = Integer.parseInt(op.substring(5).trim());
                data.push(val);
                if (minStack.isEmpty() || val < minStack.peek()) {
                    minStack.push(val);
                }
                results.add(null);
            } else if (op.equals("pop")) {
                data.pop();
                if (!minStack.isEmpty()) {
                    minStack.pop();
                }
                results.add(null);
            } else if (op.equals("top")) {
                results.add(data.peek());
            } else if (op.equals("getMin")) {
                results.add(data.peek());
            }
        }
        return results;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Min Stack (DEBUG) ====");
        System.out.print("Enter number of operations n: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] operations = new String[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter operation " + (i + 1) + ": ");
            operations[i] = sc.nextLine();
        }

        List<Integer> result = solve(operations);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(operations));
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.FindMedianFromDataStream.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/find-median-from-data-stream/
public class FindMedianFromDataStreamDebug {

    // TODO: fix the bugs in this method
    public static double[] solve(int[] stream) {
        if (stream == null || stream.length == 0) {
            return null;
        }

        PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> large = new PriorityQueue<>();
        double[] medians = new double[stream.length];

        for (int i = 0; i < stream.length; i = i + 1) {
            int num = stream[i];

            if (small.isEmpty() || num <= small.peek()) {
                small.add(num);
            } else {
                large.add(num);
            }

            if (small.size() > large.size() + 2) {
                large.add(small.poll());
            } else if (large.size() > small.size()) {
                small.add(large.poll());
            }

            if (small.size() > large.size()) {
                medians[i] = (double) small.peek();
            } else {
                medians[i] = (small.peek() + large.peek()) / 2;
            }
        }

        return medians;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Find Median from Data Stream (Debug) ====");
        System.out.print("Enter number of stream elements: ");
        int n = sc.nextInt();
        int[] stream = new int[n];
        System.out.print("Enter stream elements: ");
        for (int i = 0; i < n; i = i + 1) {
            stream[i] = sc.nextInt();
        }

        double[] result = solve(stream);

        System.out.println("------------------------");
        System.out.println("Running Medians: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

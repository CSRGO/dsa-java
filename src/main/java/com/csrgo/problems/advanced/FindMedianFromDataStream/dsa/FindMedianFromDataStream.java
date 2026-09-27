// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.FindMedianFromDataStream.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/find-median-from-data-stream/
public class FindMedianFromDataStream {

    public static double[] solve(int[] stream) {
        // TODO: write your logic here
        return new double[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Find Median from Data Stream ====");
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

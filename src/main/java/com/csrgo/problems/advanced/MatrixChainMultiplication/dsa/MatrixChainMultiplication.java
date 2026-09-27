// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MatrixChainMultiplication.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/matrix-chain-multiplication/
public class MatrixChainMultiplication {

    public static int solve(int[] arr) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Matrix Chain Multiplication ====");
        System.out.print("Enter size of dimension array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i = i + 1) {
            arr[i] = sc.nextInt();
        }

        int result = solve(arr);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(arr));
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}

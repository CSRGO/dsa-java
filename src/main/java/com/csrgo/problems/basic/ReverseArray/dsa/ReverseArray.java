// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.ReverseArray.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/reverse-array/
public class ReverseArray {

    public static int[] solve(int[] arr) {
        // TODO: write your logic here
        return arr;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Reverse Array ====");
        System.out.print("Enter size of array n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] result = solve(arr);
        
        System.out.println("------------------------");
        System.out.println("Reversed : " + Arrays.toString(result));
        System.out.println("========================");
    }
}

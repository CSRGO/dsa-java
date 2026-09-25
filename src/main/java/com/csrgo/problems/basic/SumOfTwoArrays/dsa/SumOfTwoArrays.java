// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.SumOfTwoArrays.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/sum-of-two-arrays/
public class SumOfTwoArrays {

    public static int[] solve(int[] a1, int[] a2) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Sum of Two Arrays ====");
        System.out.print("Enter size of first array n1: ");
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Enter " + n1 + " digits for first array:");
        for (int i = 0; i < n1; i++) {
            a1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array n2: ");
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Enter " + n2 + " digits for second array:");
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        
        int[] result = solve(a1, a2);
        
        System.out.println("------------------------");
        System.out.println("Input 1 : " + Arrays.toString(a1));
        System.out.println("Input 2 : " + Arrays.toString(a2));
        System.out.println("Sum     : " + Arrays.toString(result));
        System.out.println("========================");
    }
}

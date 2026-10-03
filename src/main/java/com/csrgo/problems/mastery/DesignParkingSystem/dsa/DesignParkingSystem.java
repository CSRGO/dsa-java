// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DesignParkingSystem.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/design-parking-system/
public class DesignParkingSystem {

    public static boolean[] solve(int big, int medium, int small, int[] carType) {
        // TODO: write your logic here
        return new boolean[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Design Parking System ====");
        System.out.print("Enter big slots: ");
        int big = sc.nextInt();
        System.out.print("Enter medium slots: ");
        int medium = sc.nextInt();
        System.out.print("Enter small slots: ");
        int small = sc.nextInt();
        System.out.print("Enter number of cars: ");
        int n = sc.nextInt();
        int[] carType = new int[n];
        System.out.println("Enter car types (1, 2, or 3):");
        for (int i = 0; i < n; i = i + 1) {
            carType[i] = sc.nextInt();
        }

        boolean[] result = solve(big, medium, small, carType);

        System.out.println("------------------------");
        System.out.println("Results: " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

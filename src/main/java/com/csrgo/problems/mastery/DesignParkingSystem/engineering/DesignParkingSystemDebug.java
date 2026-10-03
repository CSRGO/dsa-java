// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DesignParkingSystem.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/design-parking-system/
public class DesignParkingSystemDebug {

    // TODO: debug this method to fix it
    public static boolean[] solve(int big, int medium, int small, int[] carType) {
        int[] slots = new int[]{big, medium, small};
        int n = carType.length;
        boolean[] result = new boolean[n];

        for (int i = 0; i < n; i = i + 1) {
            int idx = carType[i];
            if (slots[idx] >= 0) {
                result[i] = true;
            } else {
                result[i] = false;
            }
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Design Parking System (DEBUG) ====");
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

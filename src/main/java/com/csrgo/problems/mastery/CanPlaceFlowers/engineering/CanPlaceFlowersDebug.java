// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CanPlaceFlowers.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/can-place-flowers/
public class CanPlaceFlowersDebug {

    // TODO: debug this method to fix it
    public static boolean solve(int[] flowerbed, int n) {
        int len = flowerbed.length;
        for (int i = 0; i < len; i = i + 1) {
            if (flowerbed[i] == 0) {
                if (i > 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    n = n - 1;
                }
            }
        }

        return n == 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Can Place Flowers (DEBUG) ====");
        System.out.print("Enter size of flowerbed: ");
        int size = sc.nextInt();
        int[] flowerbed = new int[size];
        System.out.println("Enter flowerbed values (0 or 1):");
        for (int i = 0; i < size; i = i + 1) {
            flowerbed[i] = sc.nextInt();
        }
        System.out.print("Enter number of flowers n: ");
        int n = sc.nextInt();

        boolean result = solve(flowerbed, n);

        System.out.println("------------------------");
        System.out.println("Can Place: " + result);
        System.out.println("========================");

        sc.close();
    }
}

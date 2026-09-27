// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AsteroidCollision.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/asteroid-collision/
public class AsteroidCollision {

    public static int[] solve(int[] asteroids) {
        // TODO: write your logic here
        return new int[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Asteroid Collision ====");
        System.out.print("Enter number of asteroids n: ");
        int n = sc.nextInt();
        int[] asteroids = new int[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter asteroid " + (i + 1) + ": ");
            asteroids[i] = sc.nextInt();
        }

        int[] result = solve(asteroids);

        System.out.println("------------------------");
        System.out.println("Input  : " + Arrays.toString(asteroids));
        System.out.println("Output : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

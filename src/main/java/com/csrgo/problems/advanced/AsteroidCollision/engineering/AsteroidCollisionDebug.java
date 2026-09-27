// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AsteroidCollision.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/asteroid-collision/
public class AsteroidCollisionDebug {

    // TODO: debug this method to fix it
    public static int[] solve(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i = i + 1) {
            int ast = asteroids[i];
            boolean alive = true;
            while (alive && !stack.isEmpty() && ast * stack.peek() < 0) {
                if (Math.abs(stack.peek()) < Math.abs(ast)) {
                    stack.pop();
                } else if (Math.abs(stack.peek()) == Math.abs(ast)) {
                    stack.pop();
                    alive = true;
                } else {
                    alive = false;
                }
            }
            if (alive) {
                stack.push(ast);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = 0; i < result.length; i = i + 1) {
            result[i] = stack.pop();
        }
        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Asteroid Collision (DEBUG) ====");
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

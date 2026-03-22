package com.csrgo.problems.testpath.AddTwoNumbers.dsa;

import java.util.*;

public class AddTwoNumbers {

    /**
     * Platform uses this method for judging
     */
    public static int add(int a, int b) {
        // TODO: user logic
        return a - b;
    }

    /**
     * User can run with custom input
     * Example input: 5 7
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Add Two Numbers ====");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = add(a, b);

        System.out.println("------------------------");
        System.out.println("Input  : a = " + a + ", b = " + b);
        System.out.println("Output : " + result);
        System.out.println("========================");
    }
}


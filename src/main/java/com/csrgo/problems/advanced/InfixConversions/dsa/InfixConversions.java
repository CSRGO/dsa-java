// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.InfixConversions.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/infix-conversions/
public class InfixConversions {

    public static String[] solve(String exp) {
        // TODO: write your logic here
        return new String[0];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Infix Conversions ====");
        System.out.print("Enter infix expression: ");
        String exp = sc.nextLine();

        String[] result = solve(exp);

        System.out.println("------------------------");
        System.out.println("Input  : " + exp);
        System.out.println("Output : " + Arrays.toString(result));
        System.out.println("========================");

        sc.close();
    }
}

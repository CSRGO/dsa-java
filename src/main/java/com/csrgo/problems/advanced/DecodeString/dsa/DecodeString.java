// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DecodeString.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/decode-string/
public class DecodeString {

    public static String solve(String s) {
        // TODO: write your logic here
        return "";
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Decode String ====");
        System.out.print("Enter encoded string: ");
        String s = sc.nextLine();

        String result = solve(s);

        System.out.println("------------------------");
        System.out.println("Input  : " + s);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}

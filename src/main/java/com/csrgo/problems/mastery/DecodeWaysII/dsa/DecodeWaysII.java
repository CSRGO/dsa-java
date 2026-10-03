// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DecodeWaysII.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/decode-ways-ii/
public class DecodeWaysII {

    public static int solve(String s) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Decode Ways II ====");
        System.out.print("Enter encoded string s (digits and '*'): ");
        String s = sc.nextLine();

        int result = solve(s);

        System.out.println("------------------------");
        System.out.println("Encoded String : \"" + s + "\"");
        System.out.println("Decoding Ways  : " + result);
        System.out.println("========================");

        sc.close();
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CompareVersionNumbers.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/compare-version-numbers/
public class CompareVersionNumbers {

    public static int solve(String version1, String version2) {
        // TODO: write your logic here
        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Compare Version Numbers ====");
        System.out.print("Enter version 1: ");
        String version1 = sc.nextLine();
        System.out.print("Enter version 2: ");
        String version2 = sc.nextLine();

        int result = solve(version1, version2);

        System.out.println("------------------------");
        System.out.println("Version 1  : \"" + version1 + "\"");
        System.out.println("Version 2  : \"" + version2 + "\"");
        System.out.println("Comparison : " + result + " (" + (result < 0 ? "v1 < v2" : result > 0 ? "v1 > v2" : "v1 == v2") + ")");
        System.out.println("========================");

        sc.close();
    }
}

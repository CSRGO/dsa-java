// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CompareVersionNumbers.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/compare-version-numbers/
public class CompareVersionNumbersDebug {

    // TODO: debug this method to fix it
    public static int solve(String version1, String version2) {
        int i = 0;
        int j = 0;
        int n1 = version1.length();
        int n2 = version2.length();

        while (i < n1 && j < n2) {
            int num1 = 0;
            int num2 = 0;

            while (i < n1 && version1.charAt(i) != '.') {
                num1 = num1 * 10 + (version1.charAt(i) - '0');
                i = i + 1;
            }

            while (j < n2 && version2.charAt(j) != '.') {
                num2 = num2 * 10 + (version2.charAt(j) - '0');
                j = j + 1;
            }

            if (num1 < num2) {
                return 1;
            }
            if (num1 > num2) {
                return -1;
            }

            i = i + 1;
            j = j + 1;
        }

        return 0;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Compare Version Numbers (DEBUG) ====");
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

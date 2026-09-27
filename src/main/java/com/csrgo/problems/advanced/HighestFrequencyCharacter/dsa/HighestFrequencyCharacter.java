// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.HighestFrequencyCharacter.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/highest-frequency-character/
public class HighestFrequencyCharacter {

    public static char solve(String str) {
        // TODO: write your logic here
        return ' ';
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Highest Frequency Character ====");
        System.out.print("Enter string: ");
        String str = sc.nextLine();

        char result = solve(str);

        System.out.println("------------------------");
        System.out.println("Input String      : " + str);
        System.out.println("Highest Frequency : " + result);
        System.out.println("========================");

        sc.close();
    }
}

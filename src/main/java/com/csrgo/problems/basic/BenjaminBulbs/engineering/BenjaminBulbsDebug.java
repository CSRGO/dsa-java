// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.BenjaminBulbs.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/benjamin-bulbs/
public class BenjaminBulbsDebug {

    // TODO: debug this method to fix it
    public static List<Integer> solve(int n) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i * i < n; i = i + 1) {
            result.add(i);
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Benjamin Bulbs (Debug Mode) ====");
        System.out.print("Enter number of bulbs n: ");
        int n = sc.nextInt();
        
        List<Integer> result = solve(n);
        
        System.out.println("------------------------");
        System.out.println("Bulbs  : " + n);
        System.out.println("ON Bulbs : " + result);
        System.out.println("========================");
    }
}

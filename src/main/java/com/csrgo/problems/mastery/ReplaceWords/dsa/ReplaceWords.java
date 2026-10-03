// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ReplaceWords.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/replace-words/
public class ReplaceWords {

    public static String solve(List<String> dictionary, String sentence) {
        // TODO: write your logic here
        return "";
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Replace Words ====");
        System.out.print("Enter number of roots in dictionary: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<String> dictionary = new ArrayList<>();
        System.out.println("Enter roots:");
        for (int i = 0; i < n; i = i + 1) {
            dictionary.add(sc.nextLine().trim());
        }
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        String result = solve(dictionary, sentence);

        System.out.println("------------------------");
        System.out.println("Result : " + result);
        System.out.println("========================");

        sc.close();
    }
}

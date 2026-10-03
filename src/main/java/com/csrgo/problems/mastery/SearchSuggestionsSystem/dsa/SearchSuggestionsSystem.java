// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SearchSuggestionsSystem.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/search-suggestions-system/
public class SearchSuggestionsSystem {

    public static List<List<String>> solve(String[] products, String searchWord) {
        // TODO: write your logic here
        return new ArrayList<>();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Search Suggestions System ====");
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        String[] products = new String[n];
        for (int i = 0; i < n; i = i + 1) {
            System.out.print("Enter product " + (i + 1) + ": ");
            products[i] = sc.next();
        }
        System.out.print("Enter search word: ");
        String searchWord = sc.next();

        List<List<String>> result = solve(products, searchWord);

        System.out.println("------------------------");
        System.out.println("Suggestions: " + result);
        System.out.println("========================");

        sc.close();
    }
}

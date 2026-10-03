// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SearchSuggestionsSystem.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/search-suggestions-system/
public class SearchSuggestionsSystemDebug {

    // TODO: debug this method to fix it
    public static List<List<String>> solve(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        int left = 0;
        int right = products.length - 1;

        for (int i = 0; i < searchWord.length(); i = i + 1) {
            char c = searchWord.charAt(i);

            while (left <= right && (products[left].length() <= i || products[left].charAt(i) != c)) {
                left = left + 1;
            }

            while (left <= right && (products[right].length() <= i || products[right].charAt(i) != c)) {
                right = right - 1;
            }

            List<String> suggested = new ArrayList<>();
            int count = Math.min(left + 2, right + 1);
            for (int j = left; j < count; j = j + 1) {
                suggested.add(products[j]);
            }
            result.add(suggested);
        }

        return result;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Search Suggestions System (DEBUG) ====");
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

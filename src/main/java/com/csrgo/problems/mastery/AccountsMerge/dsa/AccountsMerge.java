// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.AccountsMerge.dsa;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/accounts-merge/
public class AccountsMerge {

    public static List<List<String>> solve(List<List<String>> accounts) {
        // TODO: write your logic here
        return new ArrayList<>();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of accounts: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        List<List<String>> accounts = new ArrayList<>();
        for (int i = 0; i < n; i = i + 1) {
            System.out.println("Enter account " + (i + 1) + " (name followed by space-separated emails):");
            String line = sc.nextLine().trim();
            String[] parts = line.split("\\s+");
            List<String> acc = new ArrayList<>();
            for (String p : parts) {
                acc.add(p);
            }
            accounts.add(acc);
        }

        List<List<String>> result = solve(accounts);
        System.out.println("Merged Accounts: " + result);
        sc.close();
    }
}

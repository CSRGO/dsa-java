// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.AccountsMerge.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/accounts-merge/
public class AccountsMergeDebug {

    // TODO: debug this method to fix it
    public static List<List<String>> solve(List<List<String>> accounts) {
        if (accounts == null || accounts.size() == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> nameToEmails = new HashMap<>();

        for (int i = 0; i < accounts.size(); i = i + 1) {
            List<String> account = accounts.get(i);
            String name = account.get(0);

            if (!nameToEmails.containsKey(name)) {
                nameToEmails.put(name, new ArrayList<>());
            }

            for (int j = 1; j < account.size(); j = j + 1) {
                nameToEmails.get(name).add(account.get(j));
            }
        }

        List<List<String>> results = new ArrayList<>();
        for (String name : nameToEmails.keySet()) {
            List<String> emails = nameToEmails.get(name);
            List<String> merged = new ArrayList<>();
            merged.add(name);
            merged.addAll(emails);
            results.add(merged);
        }

        Collections.sort(results, (a, b) -> {
            int cmp = a.get(0).compareTo(b.get(0));
            if (cmp != 0) {
                return cmp;
            }
            return a.get(1).compareTo(b.get(1));
        });

        return results;
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

// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.GetSubsequence.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/get-subsequence/
public class GetSubsequenceDebug {

    // TODO: debug this method to fix it
    public static List<String> solve(String str) {
        if (str == null) {
            return new ArrayList<>();
        }
        // Bug 1: Base case returns empty list instead of list containing empty string "", collapsing recursive tree
        if (str.length() == 0) {
            return new ArrayList<>();
        }

        char ch = str.charAt(0);
        String rem = str.substring(1);
        List<String> rres = solve(rem);

        List<String> myres = new ArrayList<>();
        // Bug 2: Missing exclusion loop (forgets to add "" + s for skipped character choices)

        // Bug 3: Appends character after suffix (s + ch) instead of prefixing (ch + s)
        for (int i = 0; i < rres.size(); i++) {
            myres.add(rres.get(i) + ch);
        }

        return myres;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String str = "abc";
        List<String> result = solve(str);
        System.out.println("Result: " + result);
    }
}

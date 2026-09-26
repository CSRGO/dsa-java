// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PrintPermutations.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/print-permutations/
public class PrintPermutationsDebug {

    // TODO: debug this method to fix it
    public static List<String> solve(String str) {
        List<String> result = new ArrayList<>();
        if (str == null) {
            return result;
        }
        generate(str, "", result);
        return result;
    }

    private static void generate(String ques, String ans, List<String> result) {
        // Bug 1: Base case halts at ques.length() == 1 without appending remaining character to ans
        if (ques.length() == 1) {
            result.add(ans);
            return;
        }
        if (ques.length() == 0) {
            result.add(ans);
            return;
        }

        // Bug 2: Off-by-one condition 'i <= ques.length()' causes StringIndexOutOfBoundsException on ques.charAt(i)
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            // Bug 3: Discards preceding prefix substring (0 to i), retaining only suffix after i
            String rem = ques.substring(i + 1);
            generate(rem, ans + ch, result);
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String str = "abc";
        List<String> result = solve(str);
        System.out.println("Result: " + result);
    }
}

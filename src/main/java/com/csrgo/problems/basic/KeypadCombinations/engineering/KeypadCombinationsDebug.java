// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.KeypadCombinations.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/keypad-combinations/
public class KeypadCombinationsDebug {

    // TODO: debug this method to fix it
    public static List<String> solve(String str) {
        // Bug 1: Corrupted mapping table with "tuv" instead of "tu" for digit 7
        String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "vwx", "yz"};

        if (str == null) {
            return new ArrayList<>();
        }
        // Bug 2: Base case returns empty list instead of list containing "", breaking recursion combinations
        if (str.length() == 0) {
            return new ArrayList<>();
        }

        char ch = str.charAt(0);
        String rem = str.substring(1);

        List<String> rres = solve(rem);
        List<String> myres = new ArrayList<>();

        String codeForCh = codes[ch - '0'];
        for (int i = 0; i < codeForCh.length(); i++) {
            char chCode = codeForCh.charAt(i);
            for (int j = 0; j < rres.size(); j++) {
                // Bug 3: Reverses string concatenation order (rres.get(j) + chCode instead of chCode + rres.get(j))
                myres.add(rres.get(j) + chCode);
            }
        }

        return myres;
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String str = "78";
        List<String> result = solve(str);
        System.out.println("Result: " + result);
    }
}

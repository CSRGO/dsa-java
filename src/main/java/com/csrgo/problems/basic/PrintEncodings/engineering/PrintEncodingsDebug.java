// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.PrintEncodings.engineering;

import java.util.ArrayList;
import java.util.List;

// Problem Link: https://dsa.csrgo.com/problems/print-encodings/
public class PrintEncodingsDebug {

    // TODO: debug this method to fix it
    public static List<String> solve(String str) {
        List<String> result = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return result;
        }
        encode(str, "", result);
        return result;
    }

    private static void encode(String ques, String ans, List<String> result) {
        if (ques.length() == 0) {
            result.add(ans);
            return;
        }

        // Bug 1: Missing leading '0' validation; mistakenly allows invalid codes starting with 0

        int val1 = ques.charAt(0) - '0';
        // Bug 2: Off-by-one ASCII translation: 'a' + val1 instead of 'a' + val1 - 1 ('1' becomes 'b' instead of 'a')
        char code1 = (char) ('a' + val1);
        encode(ques.substring(1), ans + code1, result);

        if (ques.length() >= 2) {
            int val2 = Integer.parseInt(ques.substring(0, 2));
            // Bug 3: Strict inequality '< 26' instead of '<= 26', improperly discarding 26 ('z')
            if (val2 < 26) {
                char code2 = (char) ('a' + val2 - 1);
                encode(ques.substring(2), ans + code2, result);
            }
        }
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        String str = "123";
        List<String> result = solve(str);
        System.out.println("Result: " + result);
    }
}

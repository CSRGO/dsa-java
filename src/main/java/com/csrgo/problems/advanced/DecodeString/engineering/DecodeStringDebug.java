// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DecodeString.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/decode-string/
public class DecodeStringDebug {

    // TODO: debug this method to fix it
    public static String solve(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int currentCount = 0;

        for (int i = 0; i < s.length(); i = i + 1) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                currentCount = ch - '0';
            } else if (ch == '[') {
                countStack.push(currentCount);
                stringStack.push(currentString.toString());
                currentString = new StringBuilder();
            } else if (ch == ']') {
                int count = countStack.pop();
                StringBuilder temp = new StringBuilder(stringStack.pop());
                for (int j = 0; j < count - 1; j = j + 1) {
                    temp.append(currentString);
                }
                currentString = temp;
            } else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Decode String (DEBUG) ====");
        System.out.print("Enter encoded string: ");
        String s = sc.nextLine();

        String result = solve(s);

        System.out.println("------------------------");
        System.out.println("Input  : " + s);
        System.out.println("Output : " + result);
        System.out.println("========================");

        sc.close();
    }
}

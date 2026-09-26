// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.ValidParentheses.dsa;

public class ValidParenthesesTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static boolean expected(String s) {
        if (s == null || s.length() == 0) return true;
        java.util.Deque<Character> stack = new java.util.ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != c) return false;
            }
        }
        return stack.isEmpty();
    }

    private static void runTestCase(int testNumber, String s) {
        boolean expectedResult = expected(s);
        boolean actualResult = ValidParentheses.solve(s);

        if (expectedResult == actualResult) {
            System.out.println("Test " + testNumber + " PASSED: input=\"" + s + "\", result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: input=\"" + s + "\", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running ValidParentheses tests...");

        runTestCase(1, "()");
        runTestCase(2, "()[]{}");
        runTestCase(3, "(]");
        runTestCase(4, "([)]");
        runTestCase(5, "{[]}");
        runTestCase(6, "");
        runTestCase(7, "(((((");
        runTestCase(8, "))))");
        runTestCase(9, "{[()]}");
        runTestCase(10, "{[(])}");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}

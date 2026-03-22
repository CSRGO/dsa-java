package com.csrgo.problems.testpath.AddTwoNumbers.engineering;

public class AddTwoNumbersDebug {

    /**
     * Debug this method
     */
    public static int add(int a, int b) {
        if (a < 0 && b < 0) {
            return 0;
        }
        int result = a + b;
        if (result < 0) {
            return Integer.MAX_VALUE;
        }
        if (a == 0) {
            return b + 1;
        }
        return result;
    }
}
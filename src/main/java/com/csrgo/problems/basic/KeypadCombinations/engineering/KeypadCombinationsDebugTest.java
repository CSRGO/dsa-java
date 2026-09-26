// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.KeypadCombinations.engineering;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class KeypadCombinationsDebugTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static final String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    private static List<String> expected(String str) {
        if (str == null) return new ArrayList<>();
        if (str.length() == 0) {
            List<String> b = new ArrayList<>();
            b.add("");
            return b;
        }
        char ch = str.charAt(0);
        String rem = str.substring(1);
        List<String> rres = expected(rem);
        List<String> myres = new ArrayList<>();
        String code = codes[ch - '0'];
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            for (String r : rres) {
                myres.add(c + r);
            }
        }
        return myres;
    }

    private static void runTestCase(int testNumber, String str) {
        List<String> expectedResult = expected(str);
        List<String> actualResult;
        try {
            actualResult = KeypadCombinationsDebug.solve(str);
        } catch (Exception e) {
            System.out.println("Test " + testNumber + " FAILED with exception: " + e.getMessage());
            totalFailed++;
            return;
        }

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: input=\"" + str + "\", count=" + actualResult.size());
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: input=\"" + str + "\", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running KeypadCombinationsDebug tests...");

        runTestCase(1, "78");
        runTestCase(2, "");
        runTestCase(3, "0");
        runTestCase(4, "1");
        runTestCase(5, "6");
        runTestCase(6, "12");
        runTestCase(7, "789");
        runTestCase(8, "5");
        runTestCase(9, "01");
        runTestCase(10, "45");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.out.println("Debug test suite correctly caught flawed implementation.");
        }
    }
}

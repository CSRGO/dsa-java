// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.RemovePrimesFromArrayList.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class RemovePrimesFromArrayListTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static boolean isPrime(int val) {
        if (val <= 1) return false;
        for (int d = 2; (long) d * d <= val; d++) {
            if (val % d == 0) return false;
        }
        return true;
    }

    private static ArrayList<Integer> expected(ArrayList<Integer> original) {
        if (original == null) return null;
        ArrayList<Integer> list = new ArrayList<>(original);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (isPrime(list.get(i))) {
                list.remove(i);
            }
        }
        return list;
    }

    private static void runTestCase(int testNumber, ArrayList<Integer> original) {
        ArrayList<Integer> expectedResult = expected(original);
        ArrayList<Integer> input = original != null ? new ArrayList<>(original) : null;
        ArrayList<Integer> actualResult = RemovePrimesFromArrayList.solve(input);

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: input=" + original + ", result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: input=" + original + ", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running RemovePrimesFromArrayList tests...");

        runTestCase(1, new ArrayList<>(Arrays.asList(3, 12, 13, 15)));
        runTestCase(2, new ArrayList<>(Arrays.asList(7, 18, 3, 11, 2, 5, 23)));
        runTestCase(3, new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11)));
        runTestCase(4, new ArrayList<>(Arrays.asList(4, 6, 8, 9, 10)));
        runTestCase(5, new ArrayList<>(Arrays.asList(1, 2, 3, 4)));
        runTestCase(6, new ArrayList<>(Arrays.asList(17)));
        runTestCase(7, new ArrayList<>(Arrays.asList(25)));
        runTestCase(8, new ArrayList<>(Arrays.asList(100, 101, 102, 103)));
        runTestCase(9, new ArrayList<>(Arrays.asList(2, 2, 2, 4)));
        runTestCase(10, new ArrayList<>());

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}

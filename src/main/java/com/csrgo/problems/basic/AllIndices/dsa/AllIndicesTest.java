// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.AllIndices.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllIndicesTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int[] expected(int[] arr, int target) {
        if (arr == null) return new int[0];
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) list.add(i);
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) res[i] = list.get(i);
        return res;
    }

    private static void runTestCase(int testNumber, int[] arr, int target) {
        int[] expectedResult = expected(arr, target);
        int[] actualResult = AllIndices.solve(arr, target);

        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: target=" + target + ", indices=" + Arrays.toString(actualResult));
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: target=" + target + ", expected=" + Arrays.toString(expectedResult) + ", actual=" + Arrays.toString(actualResult));
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running AllIndices tests...");

        runTestCase(1, new int[]{10, 20, 30, 20, 50, 20}, 20);
        runTestCase(2, new int[]{1, 2, 3, 4}, 10);
        runTestCase(3, new int[]{5, 5, 5, 5}, 5);
        runTestCase(4, new int[]{7}, 7);
        runTestCase(5, new int[]{7}, 8);
        runTestCase(6, new int[]{}, 5);
        runTestCase(7, new int[]{-10, -20, -30, -20}, -20);
        runTestCase(8, new int[]{100, 200, 300}, 300);
        runTestCase(9, new int[]{2, 3, 2, 3, 2, 3}, 3);
        runTestCase(10, new int[]{1, 1, 2, 2, 1, 1}, 1);

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}

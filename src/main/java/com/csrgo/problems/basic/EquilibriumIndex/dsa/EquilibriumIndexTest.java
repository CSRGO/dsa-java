// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.EquilibriumIndex.dsa;

import java.util.Arrays;
import java.util.Objects;

public class EquilibriumIndexTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static int expected(int[] nums) {
        if (nums == null || nums.length == 0) return -1;
        int totalSum = 0;
        for (int x : nums) {
            totalSum += x;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    private static void runTestCase(int testNumber, int[] nums) {
        int expectedResult = expected(nums);
        int actualResult = EquilibriumIndex.solve(nums != null ? nums.clone() : null);

        if (Objects.equals(expectedResult, actualResult)) {
            System.out.println("Test " + testNumber + " PASSED: input=" + Arrays.toString(nums) + ", result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: input=" + Arrays.toString(nums) + ", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running EquilibriumIndex tests...");

        runTestCase(1, new int[]{1, 7, 3, 6, 5, 6});
        runTestCase(2, new int[]{1, 2, 3});
        runTestCase(3, new int[]{2, 1, -1});
        runTestCase(4, new int[]{0});
        runTestCase(5, new int[]{1, -1, 4});
        runTestCase(6, new int[]{0, 0, 0, 0});
        runTestCase(7, new int[]{-7, 1, 5, 2, -4, 3, 0});
        runTestCase(8, new int[]{1, 2});
        runTestCase(9, new int[]{0, 2});
        runTestCase(10, new int[]{2, 0, 2, 0, 2, 0, 2});

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}

package com.csrgo.util;

import java.util.*;

public class TestRunner<I, O> {

    private int passed = 0;
    private int failed = 0;
    private int testNo = 1;

    public void runTests(
            String problemName,
            List<TestCase<I, O>> testCases,
            Solver<I, O> solver,
            boolean failFast
    ) {

        printHeader(problemName);

        for (TestCase<I, O> test : testCases) {
            try {
                long start = System.nanoTime();

                O result = solver.solve(test.input);

                long end = System.nanoTime();
                long timeMs = (end - start) / 1_000_000;

                if (Objects.equals(result, test.expected)) {
                    passed++;
                    printPass(test.name, test.input, test.expected, result, timeMs);
                } else {
                    failed++;
                    printFail(test.name, test.input, test.expected, result, timeMs);
                }

            } catch (Exception e) {
                failed++;
                printError(test.name, test.input, e);
            }

            if (failFast && failed > 0) break;

            testNo++;
        }

        printSummary();
    }

    // ---------- OUTPUT ----------

    private void printHeader(String name) {
        System.out.println("=================================");
        System.out.println("  " + name + " - Test Results");
        System.out.println("=================================\n");
    }

    private void printPass(String name, I input, O expected, O result, long time) {
        System.out.println(
                "[TEST " + testNo + "] " + name + " ✅ PASS\n" +
                        "Input     : " + format(input) + "\n" +
                        "Expected  : " + expected + "\n" +
                        "Output    : " + result + "\n" +
                        "Time      : " + time + " ms\n"
        );
    }

    private void printFail(String name, I input, O expected, O result, long time) {
        System.out.println(
                "[TEST " + testNo + "] " + name + " ❌ FAIL\n" +
                        "Input     : " + format(input) + "\n" +
                        "Expected  : " + expected + "\n" +
                        "Output    : " + result + "\n" +
                        "Time      : " + time + " ms\n"
        );
    }

    private void printError(String name, I input, Exception e) {
        System.out.println(
                "[TEST " + testNo + "] " + name + " ⚠ ERROR\n" +
                        "Input     : " + format(input) + "\n" +
                        "Exception : " + e.getClass().getSimpleName() + " - " + e.getMessage() + "\n"
        );
    }

    private void printSummary() {
        System.out.println("=================================");
        System.out.println("Total Tests : " + (passed + failed));
        System.out.println("Passed      : " + passed);
        System.out.println("Failed      : " + failed);
        System.out.println("Result      : " + (failed == 0 ? "✅ ACCEPTED" : "❌ FAILED"));
        System.out.println("=================================");
    }

    // ---------- INPUT FORMAT ----------

    private String format(Object input) {

        if (input == null) return "null";

        if (input instanceof int[]) {
            return Arrays.toString((int[]) input);
        }

        if (input instanceof long[]) {
            return Arrays.toString((long[]) input);
        }

        if (input instanceof Object[]) {
            return Arrays.deepToString((Object[]) input);
        }

        return String.valueOf(input);
    }
}
// All rights reserved to CSRGO DSA
package com.csrgo.util;

import java.util.*;
import java.util.function.Function;

public class TestRunner<I, O> {

    private int passed = 0;
    private int failed = 0;
    private int testNo = 1;

    private final List<TestCase<?, ?>> legacyCases = new ArrayList<>();

    public void addTestCase(TestCase<?, ?> testCase) {
        legacyCases.add(testCase);
    }

    @SuppressWarnings("unchecked")
    public void runTests(String problemName, boolean failFast) {
        printHeader(problemName);
        for (TestCase<?, ?> test : legacyCases) {
            try {
                long start = System.nanoTime();
                Object result;
                if (test.action != null) {
                    result = test.action.run();
                } else if (test.input instanceof TestCase.Action) {
                    result = ((TestCase.Action<?>) test.input).run();
                } else {
                    result = test.input;
                }
                long end = System.nanoTime();
                long timeMs = (end - start) / 1_000_000;

                if (Objects.deepEquals(result, test.expected)) {
                    passed++;
                    printPass(test.name, (I) (test.action != null ? "N/A" : test.input), (O) test.expected, (O) result, timeMs);
                } else {
                    failed++;
                    printFail(test.name, (I) (test.action != null ? "N/A" : test.input), (O) test.expected, (O) result, timeMs);
                }
            } catch (Throwable e) {
                failed++;
                printError(test.name, (I) (test.action != null ? "N/A" : test.input), (e instanceof Exception ? (Exception) e : new Exception(e)));
            }

            if (failFast && failed > 0) break;
            testNo++;
        }
        printSummary();
    }

    public void
    runTests(
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

                if (Objects.deepEquals(result, test.expected)) {
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

    public static <T, R> void runTests(
            List<T> tests,
            Function<T, R> solver,
            Function<T, R> expected,
            boolean failFast,
            Function<T, String> description
    ) {
        int passed = 0;
        int failed = 0;
        int testNo = 1;

        System.out.println("=================================");
        System.out.println("          Test Results");
        System.out.println("=================================\n");

        for (T test : tests) {
            String desc = description != null ? description.apply(test) : ("Test " + testNo);
            R exp = expected.apply(test);
            try {
                long start = System.nanoTime();
                R actual = solver.apply(test);
                long end = System.nanoTime();
                long timeMs = (end - start) / 1_000_000;

                if (Objects.deepEquals(actual, exp)) {
                    passed++;
                    System.out.println("[TEST " + testNo + "] " + desc + " ✅ PASS (" + timeMs + " ms)");
                } else {
                    failed++;
                    System.out.println("[TEST " + testNo + "] " + desc + " ❌ FAIL (" + timeMs + " ms)");
                    System.out.println("Expected  : " + formatStatic(exp));
                    System.out.println("Output    : " + formatStatic(actual));
                }
            } catch (Exception e) {
                failed++;
                System.out.println("[TEST " + testNo + "] " + desc + " ⚠ ERROR");
                System.out.println("Exception : " + e.getClass().getSimpleName() + " - " + e.getMessage());
            }

            if (failFast && failed > 0) {
                break;
            }
            testNo++;
        }

        System.out.println("\n=================================");
        System.out.println("Total Tests : " + (passed + failed));
        System.out.println("Passed      : " + passed);
        System.out.println("Failed      : " + failed);
        System.out.println("Result      : " + (failed == 0 ? "✅ ACCEPTED" : "❌ FAILED"));
        System.out.println("=================================\n");
    }

    public static <T, R> void runTests(
            List<T> tests,
            Function<T, R> solver,
            Function<T, R> expected,
            boolean failFast
    ) {
        runTests(tests, solver, expected, failFast, null);
    }

    public static String format(Object input) {
        if (input == null) return "null";

        if (input instanceof int[]) return Arrays.toString((int[]) input);
        if (input instanceof long[]) return Arrays.toString((long[]) input);
        if (input instanceof double[]) return Arrays.toString((double[]) input);
        if (input instanceof boolean[]) return Arrays.toString((boolean[]) input);
        if (input instanceof char[]) return Arrays.toString((char[]) input);
        if (input instanceof byte[]) return Arrays.toString((byte[]) input);
        if (input instanceof short[]) return Arrays.toString((short[]) input);
        if (input instanceof float[]) return Arrays.toString((float[]) input);
        if (input instanceof Object[]) return Arrays.deepToString((Object[]) input);
        if (input instanceof Collection) return input.toString();

        String str = input.toString();
        int atIdx = str.lastIndexOf('@');
        if (atIdx != -1 && str.substring(atIdx + 1).matches("[0-9a-fA-F]+")) {
            String candidateClass = str.substring(0, atIdx);
            if (candidateClass.equals(input.getClass().getName()) || candidateClass.equals(input.getClass().getSimpleName())) {
                return formatObjectFields(input);
            }
        }

        return str;
    }

    private static String formatObjectFields(Object obj) {
        if (obj == null) return "null";
        StringBuilder sb = new StringBuilder();
        try {
            Class<?> clazz = obj.getClass();
            java.lang.reflect.Field[] fields = clazz.getDeclaredFields();
            boolean first = true;
            for (java.lang.reflect.Field field : fields) {
                if (java.lang.reflect.Modifier.isStatic(field.getModifiers()) || field.isSynthetic()) {
                    continue;
                }
                field.setAccessible(true);
                Object val = field.get(obj);
                if (!first) {
                    sb.append(", ");
                }
                sb.append(field.getName()).append("=").append(format(val));
                first = false;
            }
        } catch (Exception e) {
            return obj.toString();
        }
        return sb.length() > 0 ? sb.toString() : obj.toString();
    }

    private static String formatStatic(Object input) {
        return format(input);
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
                        "Expected  : " + formatValue(expected) + "\n" +
                        "Output    : " + formatValue(result) + "\n" +
                        "Time      : " + time + " ms\n"
        );
    }

    private void printFail(String name, I input, O expected, O result, long time) {
        System.out.println(
                "[TEST " + testNo + "] " + name + " ❌ FAIL\n" +
                        "Input     : " + format(input) + "\n" +
                        "Expected  : " + formatValue(expected) + "\n" +
                        "Output    : " + formatValue(result) + "\n" +
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

        if (failed == 0 && passed > 0) {
            System.out.println();
            System.out.println("🎉 CONGRATULATIONS! You have successfully completed this problem.");
            System.out.println("If you find value in CSRGO DSA, please consider volunteering to support us.");
            System.out.println("Your contribution helps maintain the platform and fund continuous improvements!");
            System.out.println("👉 https://dsa.csrgo.com/support/");
            System.out.println();
        }
    }

    private String formatValue(Object val) {
        if (val == null) return "null";
        String s = format(val);
        if (s.contains("\n")) {
            if (!s.startsWith("\n")) {
                s = "\n" + s;
            }
            if (s.endsWith("\n")) {
                s = s.substring(0, s.length() - 1);
            }
        }
        return s;
    }
}
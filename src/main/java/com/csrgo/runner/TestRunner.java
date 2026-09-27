// All rights reserved to CSRGO DSA
package com.csrgo.runner;

import java.util.List;
import java.util.function.Function;

public class TestRunner<I, O> extends com.csrgo.util.TestRunner<I, O> {

    public static <T, R> void runTests(
            List<T> tests,
            Function<T, R> solver,
            Function<T, R> expected,
            boolean failFast,
            Function<T, String> description
    ) {
        com.csrgo.util.TestRunner.runTests(tests, solver, expected, failFast, description);
    }

    public static <T, R> void runTests(
            List<T> tests,
            Function<T, R> solver,
            Function<T, R> expected,
            boolean failFast
    ) {
        com.csrgo.util.TestRunner.runTests(tests, solver, expected, failFast);
    }
}

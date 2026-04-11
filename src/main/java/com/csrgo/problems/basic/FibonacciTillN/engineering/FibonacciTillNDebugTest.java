// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.FibonacciTillN.engineering;

import java.util.*;
import com.csrgo.util.*;

public class FibonacciTillNDebugTest {

    public static void main(String[] args) {

        List<TestCase<Integer, List<Integer>>> testCases = List.of(
            new TestCase<>("Boundary Zero", 0, Arrays.asList()),
            new TestCase<>("Boundary One", 1, Arrays.asList(0)),
            new TestCase<>("Small Range", 2, Arrays.asList(0, 1)),
            new TestCase<>("Standard Sequence", 5, Arrays.asList(0, 1, 1, 2, 3)),
            new TestCase<>("Base Extension", 8, Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13)),
            new TestCase<>("Double Digits", 10, Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)),
            new TestCase<>("Fifteen Items", 15, Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377)),
            new TestCase<>("Negative Value Edge", -5, Arrays.asList()),
            new TestCase<>("Just Off Base", 3, Arrays.asList(0, 1, 1)),
            new TestCase<>("Twenty Limit", 20, Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181))
        );

        TestRunner<Integer, List<Integer>> runner = new TestRunner<>();

        runner.runTests(
            "Fibonacci Till N",
            testCases,
            input -> FibonacciTillNDebug.solve(input), 
            false 
        );
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.PrintAllPrimesTillN.engineering;

import java.util.*;
import com.csrgo.util.*;

public class PrintAllPrimesTillNDebugTest {

    public static void main(String[] args) {

        List<TestCase<Integer, List<Integer>>> testCases = List.of(
            new TestCase<>("Small Number", 10, Arrays.asList(2, 3, 5, 7)),
            new TestCase<>("Boundary Lowest", 2, Arrays.asList(2)),
            new TestCase<>("Edge Case Zero", 0, Arrays.asList()),
            new TestCase<>("Edge Case One", 1, Arrays.asList()),
            new TestCase<>("Moderate Size", 20, Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19)),
            new TestCase<>("Prime Number Limit", 5, Arrays.asList(2, 3, 5)),
            new TestCase<>("Near Prime Limit", 8, Arrays.asList(2, 3, 5, 7)),
            new TestCase<>("Thirty", 30, Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)),
            new TestCase<>("Fifty", 50, Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47)),
            new TestCase<>("Negative Number", -5, Arrays.asList())
        );

        TestRunner<Integer, List<Integer>> runner = new TestRunner<>();

        runner.runTests(
            "Print All Primes Till N",
            testCases,
            input -> PrintAllPrimesTillNDebug.solve(input), 
            false 
        );
    }
}

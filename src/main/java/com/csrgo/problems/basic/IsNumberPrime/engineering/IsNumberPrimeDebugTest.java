// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.IsNumberPrime.engineering;

import java.util.*;
import com.csrgo.util.*;

public class IsNumberPrimeDebugTest {

    public static void main(String[] args) {

        List<TestCase<Integer, Boolean>> testCases = List.of(
            new TestCase<>("Edge Case - 1", 1, false),
            new TestCase<>("Smallest Prime", 2, true),
            new TestCase<>("Small Prime", 3, true),
            new TestCase<>("Small Composite", 4, false),
            new TestCase<>("Odd Prime", 7, true),
            new TestCase<>("Odd Composite", 9, false),
            new TestCase<>("Medium Prime", 13, true),
            new TestCase<>("Square of Prime", 25, false),
            new TestCase<>("Large Prime", 97, true),
            new TestCase<>("Multi-digit Composite", 100, false)
        );

        TestRunner<Integer, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Is Number Prime (DEBUG)",
            testCases,
            input -> IsNumberPrimeDebug.solve(input), 
            false 
        );
    }
}

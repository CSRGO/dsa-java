// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.PrimeFactorization.engineering;

import java.util.*;
import com.csrgo.util.*;

public class PrimeFactorizationDebugTest {

    public static void main(String[] args) {

        List<TestCase<Integer, List<Integer>>> testCases = List.of(
            new TestCase<>("Small Even", 36, List.of(2, 2, 3, 3)),
            new TestCase<>("Small Odd", 15, List.of(3, 5)),
            new TestCase<>("Prime Number", 17, List.of(17)),
            new TestCase<>("Power of 2", 32, List.of(2, 2, 2, 2, 2)),
            new TestCase<>("Square of Prime", 49, List.of(7, 7)),
            new TestCase<>("Large Primes", 46, List.of(2, 23)),
            new TestCase<>("Consecutive Primes", 30, List.of(2, 3, 5)),
            new TestCase<>("Minimal Input", 2, List.of(2)),
            new TestCase<>("High Value", 1234, List.of(2, 617)),
            new TestCase<>("Multiple Factors", 100, List.of(2, 2, 5, 5))
        );

        TestRunner<Integer, List<Integer>> runner = new TestRunner<>();

        runner.runTests(
            "Prime Factorization",
            testCases,
            input -> PrimeFactorizationDebug.solve(input), 
            false 
        );
    }
}

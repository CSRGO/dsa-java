// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.CountDigits.dsa;

import java.util.*;
import com.csrgo.util.*;

public class CountDigitsTest {

    public static void main(String[] args) {

        List<TestCase<Integer, Integer>> testCases = List.of(
            new TestCase<>("Single Digit", 5, 1),
            new TestCase<>("Two Digits", 42, 2),
            new TestCase<>("Three Digits", 100, 3),
            new TestCase<>("Large Number", 987654321, 9),
            new TestCase<>("Zero Case", 0, 1),
            new TestCase<>("Boundary Case - 10", 10, 2),
            new TestCase<>("Boundary Case - 99", 99, 2),
            new TestCase<>("Power of 10", 1000, 4),
            new TestCase<>("Maximum Constraint", 1000000000, 10),
            new TestCase<>("Random Number", 554433, 6)
        );

        TestRunner<Integer, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Count Digits",
            testCases,
            input -> CountDigits.solve(input), 
            true 
        );
    }
}

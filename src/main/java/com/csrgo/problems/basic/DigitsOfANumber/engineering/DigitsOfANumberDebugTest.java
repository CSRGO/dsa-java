// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DigitsOfANumber.engineering;

import java.util.*;
import com.csrgo.util.*;

public class DigitsOfANumberDebugTest {

    public static void main(String[] args) {

        List<TestCase<Integer, List<Integer>>> testCases = List.of(
            new TestCase<>("Single Digit", 5, List.of(5)),
            new TestCase<>("Multi Digit", 1234, List.of(1, 2, 3, 4)),
            new TestCase<>("Zero Case", 0, List.of(0)),
            new TestCase<>("Large Number", 987654321, List.of(9, 8, 7, 6, 5, 4, 3, 2, 1)),
            new TestCase<>("Duplicate Digits", 1122, List.of(1, 1, 2, 2)),
            new TestCase<>("Leading Zeros Representation", 1001, List.of(1, 0, 0, 1)),
            new TestCase<>("Power of 10", 100, List.of(1, 0, 0)),
            new TestCase<>("Descending Numbers", 5432, List.of(5, 4, 3, 2)),
            new TestCase<>("Ascending Numbers", 2468, List.of(2, 4, 6, 8)),
            new TestCase<>("Maximum Constraint Approx", 1000000000, List.of(1, 0, 0, 0, 0, 0, 0, 0, 0, 0))
        );

        TestRunner<Integer, List<Integer>> runner = new TestRunner<>();

        runner.runTests(
            "Digits of a Number",
            testCases,
            input -> DigitsOfANumberDebug.solve(input), 
            false 
        );
    }
}

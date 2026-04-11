// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.InverseOfANumber.engineering;

import java.util.*;
import com.csrgo.util.*;

public class InverseOfANumberDebugTest {

    public static void main(String[] args) {

        List<TestCase<Integer, Integer>> testCases = List.of(
            new TestCase<>("Single Digit", 1, 1),
            new TestCase<>("Two Digits Swap", 12, 21),
            new TestCase<>("Two Digits Stay", 21, 12),
            new TestCase<>("Mixed 1", 426135, 416253),
            new TestCase<>("Mixed 2", 21453, 23154),
            new TestCase<>("Mixed 3", 613254, 264135),
            new TestCase<>("Length 8", 28346751, 73425681),
            new TestCase<>("Consecutive", 12345, 54321),
            new TestCase<>("Consecutive Reverse", 54321, 12345),
            new TestCase<>("Large Permutation", 987654321, 123456789)
        );

        TestRunner<Integer, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Inverse of a Number",
            testCases,
            input -> InverseOfANumberDebug.solve(input), 
            false 
        );
    }
}

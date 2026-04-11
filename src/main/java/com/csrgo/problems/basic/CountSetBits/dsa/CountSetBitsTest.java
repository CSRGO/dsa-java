// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.CountSetBits.dsa;

import java.util.*;
import com.csrgo.util.*;

public class CountSetBitsTest {

    public static void main(String[] args) {

        List<TestCase<Integer, Integer>> testCases = List.of(
            new TestCase<>("Zero case", 0, 0),
            new TestCase<>("Single bit 1", 1, 1),
            new TestCase<>("Single bit 2", 2, 1),
            new TestCase<>("Full house (3)", 7, 3),
            new TestCase<>("Power of 2 (16)", 16, 1),
            new TestCase<>("Mixed binary 13", 13, 3),
            new TestCase<>("Large Value 255", 255, 8),
            new TestCase<>("Large Value 1024", 1024, 1),
            new TestCase<>("High complexity", 123456, 6),
            new TestCase<>("Max Constraint Approx", 1000000000, 13)
        );

        TestRunner<Integer, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Count Set Bits",
            testCases,
            input -> CountSetBits.solve(input), 
            true 
        );
    }
}

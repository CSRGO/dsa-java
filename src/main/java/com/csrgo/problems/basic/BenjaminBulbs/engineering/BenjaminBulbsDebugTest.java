// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.BenjaminBulbs.engineering;

import java.util.*;
import com.csrgo.util.*;

public class BenjaminBulbsDebugTest {

    public static void main(String[] args) {

        List<TestCase<Integer, List<Integer>>> testCases = List.of(
            new TestCase<>("Small Range", 6, List.of(1, 4)),
            new TestCase<>("Small Range 2", 10, List.of(1, 4, 9)),
            new TestCase<>("Single Bulb", 1, List.of(1)),
            new TestCase<>("No Bulbs Excess", 3, List.of(1)),
            new TestCase<>("Perfect Square N", 16, List.of(1, 4, 9, 16)),
            new TestCase<>("Up to 25", 25, List.of(1, 4, 9, 16, 25)),
            new TestCase<>("Large Range", 50, List.of(1, 4, 9, 16, 25, 36, 49)),
            new TestCase<>("Exactly 100", 100, List.of(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)),
            new TestCase<>("Non-Square High", 10, List.of(1, 4, 9)),
            new TestCase<>("Constraint Check", 15, List.of(1, 4, 9))
        );

        TestRunner<Integer, List<Integer>> runner = new TestRunner<>();

        runner.runTests(
            "Benjamin Bulbs",
            testCases,
            input -> BenjaminBulbsDebug.solve(input), 
            false 
        );
    }
}

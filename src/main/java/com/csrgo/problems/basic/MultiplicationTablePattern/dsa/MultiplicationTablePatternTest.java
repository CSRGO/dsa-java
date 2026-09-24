// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.MultiplicationTablePattern.dsa;

import java.util.*;
import com.csrgo.util.*;

public class MultiplicationTablePatternTest {

    private static String buildExpected(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(n).append(" * ").append(i).append(" = ").append(n * i).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        List<TestCase<Integer, String>> testCases = List.of(
            new TestCase<>("Unit One Base Case", 1, buildExpected(1)),
            new TestCase<>("Even Prime Two", 2, buildExpected(2)),
            new TestCase<>("Single Digit Odd Three", 3, buildExpected(3)),
            new TestCase<>("Five Multiple Standard Example", 5, buildExpected(5)),
            new TestCase<>("Prime Seven", 7, buildExpected(7)),
            new TestCase<>("Square Digit Nine", 9, buildExpected(9)),
            new TestCase<>("Decimal Base Ten", 10, buildExpected(10)),
            new TestCase<>("Dozen Twelve", 12, buildExpected(12)),
            new TestCase<>("Quarter Century Twenty-Five", 25, buildExpected(25)),
            new TestCase<>("Century Hundred Scale", 100, buildExpected(100))
        );

        TestRunner<Integer, String> runner = new TestRunner<>();

        runner.runTests(
            "Multiplication Table Pattern",
            testCases,
            input -> MultiplicationTablePattern.solve(input), 
            true 
        );
    }
}

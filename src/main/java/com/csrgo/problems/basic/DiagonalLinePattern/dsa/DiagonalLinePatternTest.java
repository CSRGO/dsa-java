// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.DiagonalLinePattern.dsa;

import java.util.*;
import com.csrgo.util.*;

public class DiagonalLinePatternTest {

    public static void main(String[] args) {

        List<TestCase<Integer, String>> testCases = List.of(
            new TestCase<>("Single Star Boundary", 1, "*\n"),
            new TestCase<>("Two Rows Smallest Diagonal", 2, "*\n\t*\n"),
            new TestCase<>("Three Rows Standard", 3, "*\n\t*\n\t\t*\n"),
            new TestCase<>("Four Rows Progression", 4, "*\n\t*\n\t\t*\n\t\t\t*\n"),
            new TestCase<>("Five Rows Classic Diagonal", 5, "*\n\t*\n\t\t*\n\t\t\t*\n\t\t\t\t*\n"),
            new TestCase<>("Six Rows Mid Tier", 6, "*\n\t*\n\t\t*\n\t\t\t*\n\t\t\t\t*\n\t\t\t\t\t*\n"),
            new TestCase<>("Seven Rows Step", 7, "*\n\t*\n\t\t*\n\t\t\t*\n\t\t\t\t*\n\t\t\t\t\t*\n\t\t\t\t\t\t*\n"),
            new TestCase<>("Eight Rows Boundary", 8, "*\n\t*\n\t\t*\n\t\t\t*\n\t\t\t\t*\n\t\t\t\t\t*\n\t\t\t\t\t\t*\n\t\t\t\t\t\t\t*\n"),
            new TestCase<>("Nine Rows Stepped", 9, "*\n\t*\n\t\t*\n\t\t\t*\n\t\t\t\t*\n\t\t\t\t\t*\n\t\t\t\t\t\t*\n\t\t\t\t\t\t\t*\n\t\t\t\t\t\t\t\t*\n"),
            new TestCase<>("Ten Rows Scale", 10, "*\n\t*\n\t\t*\n\t\t\t*\n\t\t\t\t*\n\t\t\t\t\t*\n\t\t\t\t\t\t*\n\t\t\t\t\t\t\t*\n\t\t\t\t\t\t\t\t*\n\t\t\t\t\t\t\t\t\t*\n")
        );

        TestRunner<Integer, String> runner = new TestRunner<>();

        runner.runTests(
            "Diagonal Line Pattern",
            testCases,
            input -> DiagonalLinePattern.solve(input), 
            true 
        );
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.AntiDiagonalLinePattern.engineering;

import java.util.*;
import com.csrgo.util.*;

public class AntiDiagonalLinePatternDebugTest {

    public static void main(String[] args) {

        List<TestCase<Integer, String>> testCases = List.of(
            new TestCase<>("Single Star Boundary", 1, "*\n"),
            new TestCase<>("Two Rows Smallest Counter Diagonal", 2, "\t*\n*\n"),
            new TestCase<>("Three Rows Standard", 3, "\t\t*\n\t*\n*\n"),
            new TestCase<>("Four Rows Progression", 4, "\t\t\t*\n\t\t*\n\t*\n*\n"),
            new TestCase<>("Five Rows Classic Anti-Diagonal", 5, "\t\t\t\t*\n\t\t\t*\n\t\t*\n\t*\n*\n"),
            new TestCase<>("Six Rows Mid Tier", 6, "\t\t\t\t\t*\n\t\t\t\t*\n\t\t\t*\n\t\t*\n\t*\n*\n"),
            new TestCase<>("Seven Rows Step", 7, "\t\t\t\t\t\t*\n\t\t\t\t\t*\n\t\t\t\t*\n\t\t\t*\n\t\t*\n\t*\n*\n"),
            new TestCase<>("Eight Rows Boundary", 8, "\t\t\t\t\t\t\t*\n\t\t\t\t\t\t*\n\t\t\t\t\t*\n\t\t\t\t*\n\t\t\t*\n\t\t*\n\t*\n*\n"),
            new TestCase<>("Nine Rows Stepped", 9, "\t\t\t\t\t\t\t\t*\n\t\t\t\t\t\t\t*\n\t\t\t\t\t\t*\n\t\t\t\t\t*\n\t\t\t\t*\n\t\t\t*\n\t\t*\n\t*\n*\n"),
            new TestCase<>("Ten Rows Scale", 10, "\t\t\t\t\t\t\t\t\t*\n\t\t\t\t\t\t\t\t*\n\t\t\t\t\t\t\t*\n\t\t\t\t\t\t*\n\t\t\t\t\t*\n\t\t\t\t*\n\t\t\t*\n\t\t*\n\t*\n*\n")
        );

        TestRunner<Integer, String> runner = new TestRunner<>();

        runner.runTests(
            "Anti-Diagonal Line Pattern (DEBUG)",
            testCases,
            input -> AntiDiagonalLinePatternDebug.solve(input), 
            false 
        );
    }
}

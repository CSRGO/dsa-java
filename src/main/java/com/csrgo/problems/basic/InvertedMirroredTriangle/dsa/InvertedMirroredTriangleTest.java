// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.InvertedMirroredTriangle.dsa;

import java.util.*;
import com.csrgo.util.*;

public class InvertedMirroredTriangleTest {

    public static void main(String[] args) {

        List<TestCase<Integer, String>> testCases = List.of(
            new TestCase<>("Single Star Boundary", 1, "*\n"),
            new TestCase<>("Two Rows Smallest Base", 2, "*\t*\n\t*\n"),
            new TestCase<>("Three Rows Standard", 3, "*\t*\t*\n\t*\t*\n\t\t*\n"),
            new TestCase<>("Four Rows Progression", 4, "*\t*\t*\t*\n\t*\t*\t*\n\t\t*\t*\n\t\t\t*\n"),
            new TestCase<>("Five Rows Classic", 5, "*\t*\t*\t*\t*\n\t*\t*\t*\t*\n\t\t*\t*\t*\n\t\t\t*\t*\n\t\t\t\t*\n"),
            new TestCase<>("Six Rows Mid Tier", 6, "*\t*\t*\t*\t*\t*\n\t*\t*\t*\t*\t*\n\t\t*\t*\t*\t*\n\t\t\t*\t*\t*\n\t\t\t\t*\t*\n\t\t\t\t\t*\n"),
            new TestCase<>("Seven Rows Step", 7, "*\t*\t*\t*\t*\t*\t*\n\t*\t*\t*\t*\t*\t*\n\t\t*\t*\t*\t*\t*\n\t\t\t*\t*\t*\t*\n\t\t\t\t*\t*\t*\n\t\t\t\t\t*\t*\n\t\t\t\t\t\t*\n"),
            new TestCase<>("Eight Rows Boundary", 8, "*\t*\t*\t*\t*\t*\t*\t*\n\t*\t*\t*\t*\t*\t*\t*\n\t\t*\t*\t*\t*\t*\t*\n\t\t\t*\t*\t*\t*\t*\n\t\t\t\t*\t*\t*\t*\n\t\t\t\t\t*\t*\t*\n\t\t\t\t\t\t*\t*\n\t\t\t\t\t\t\t*\n"),
            new TestCase<>("Nine Rows Stepped", 9, "*\t*\t*\t*\t*\t*\t*\t*\t*\n\t*\t*\t*\t*\t*\t*\t*\t*\n\t\t*\t*\t*\t*\t*\t*\t*\n\t\t\t*\t*\t*\t*\t*\t*\n\t\t\t\t*\t*\t*\t*\t*\n\t\t\t\t\t*\t*\t*\t*\n\t\t\t\t\t\t*\t*\t*\n\t\t\t\t\t\t\t*\t*\n\t\t\t\t\t\t\t\t*\n"),
            new TestCase<>("Ten Rows Scale", 10, "*\t*\t*\t*\t*\t*\t*\t*\t*\t*\n\t*\t*\t*\t*\t*\t*\t*\t*\t*\n\t\t*\t*\t*\t*\t*\t*\t*\t*\n\t\t\t*\t*\t*\t*\t*\t*\t*\n\t\t\t\t*\t*\t*\t*\t*\t*\n\t\t\t\t\t*\t*\t*\t*\t*\n\t\t\t\t\t\t*\t*\t*\t*\n\t\t\t\t\t\t\t*\t*\t*\n\t\t\t\t\t\t\t\t*\t*\n\t\t\t\t\t\t\t\t\t*\n")
        );

        TestRunner<Integer, String> runner = new TestRunner<>();

        runner.runTests(
            "Inverted Mirrored Triangle",
            testCases,
            input -> InvertedMirroredTriangle.solve(input), 
            true 
        );
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CelebrityProblem.engineering;

import java.util.*;
import com.csrgo.util.*;

public class CelebrityProblemDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[][], Integer>> testCases = List.of(
            new TestCase<>("Person One Is Celebrity", new int[][]{{0, 1, 0}, {0, 0, 0}, {0, 1, 0}}, 1),
            new TestCase<>("Mutual Acquaintance No Celebrity", new int[][]{{0, 1}, {1, 0}}, -1),
            new TestCase<>("Single Person Party", new int[][]{{0}}, 0),
            new TestCase<>("Person Zero Is Celebrity", new int[][]{{0, 0, 0}, {1, 0, 0}, {1, 0, 0}}, 0),
            new TestCase<>("Person Two Is Celebrity Four People", new int[][]{{0, 0, 1, 0}, {0, 0, 1, 0}, {0, 0, 0, 0}, {0, 0, 1, 0}}, 2),
            new TestCase<>("Nobody Knows Anyone", new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}, -1),
            new TestCase<>("Complete Disconnected Graph", new int[][]{{0, 0}, {0, 0}}, -1),
            new TestCase<>("Last Person Is Celebrity", new int[][]{{0, 1}, {0, 0}}, 1),
            new TestCase<>("Almost Celebrity Knows One Person", new int[][]{{0, 1, 0}, {0, 0, 1}, {0, 1, 0}}, -1),
            new TestCase<>("Fully Connected Clique", new int[][]{{0, 1, 1}, {1, 0, 1}, {1, 1, 0}}, -1)
        );

        TestRunner<int[][], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Celebrity Problem (DEBUG)",
            testCases,
            input -> CelebrityProblemDebug.solve(input),
            false
        );
    }
}

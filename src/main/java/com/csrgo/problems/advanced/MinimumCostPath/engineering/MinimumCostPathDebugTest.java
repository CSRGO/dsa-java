// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MinimumCostPath.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MinimumCostPathDebugTest {

    public static void main(String[] args) {
        List<TestCase<int[][], Integer>> testCases = List.of(
            new TestCase<>("Classic Three By Three Grid", new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}, 7),
            new TestCase<>("Two By Three Grid", new int[][]{{1, 2, 3}, {4, 5, 6}}, 12),
            new TestCase<>("Single Cell Matrix", new int[][]{{5}}, 5),
            new TestCase<>("Two By Two Uniform Steps", new int[][]{{1, 2}, {1, 1}}, 3),
            new TestCase<>("Two By Three Alternate Path", new int[][]{{1, 2, 5}, {3, 2, 1}}, 6),
            new TestCase<>("All Zeros Grid", new int[][]{{0, 0}, {0, 0}}, 0),
            new TestCase<>("High Barrier In Center", new int[][]{{1, 9, 1}, {1, 9, 1}, {1, 1, 1}}, 5),
            new TestCase<>("Single Row Grid", new int[][]{{1, 2, 3, 4}}, 10),
            new TestCase<>("Single Column Grid", new int[][]{{1}, {2}, {3}, {4}}, 10),
            new TestCase<>("Zigzag Optimal Route", new int[][]{{2, 8, 1}, {1, 1, 9}, {7, 1, 2}}, 7)
        );

        TestRunner<int[][], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Minimum Cost Path (DEBUG)",
            testCases,
            input -> MinimumCostPathDebug.solve(input),
            false
        );
    }
}

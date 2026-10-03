// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ShortestBridge.engineering;

import java.util.*;
import com.csrgo.util.*;

public class ShortestBridgeDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[][], Integer>> testCases = List.of(
            new TestCase<>("2x2 Diagonal Islands", new int[][]{{0, 1}, {1, 0}}, 1),
            new TestCase<>("3x3 Two Step Bridge", new int[][]{{0, 1, 0}, {0, 0, 0}, {0, 0, 1}}, 2),
            new TestCase<>("3x3 One Step Bridge", new int[][]{{1, 1, 0}, {0, 0, 0}, {0, 1, 1}}, 1),
            new TestCase<>("3x3 Parallel Strips", new int[][]{{1, 1, 1}, {0, 0, 0}, {1, 1, 1}}, 1),
            new TestCase<>("4x4 Wide Gap Corners", new int[][]{{1, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 1}}, 5),
            new TestCase<>("3x3 Corner To Center", new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 0}}, 1),
            new TestCase<>("3x3 Opposite Corners One Step", new int[][]{{1, 0, 0}, {1, 0, 1}, {0, 0, 1}}, 1),
            new TestCase<>("4x4 Two Blocks", new int[][]{{1, 1, 0, 0}, {1, 1, 0, 0}, {0, 0, 1, 1}, {0, 0, 1, 1}}, 1),
            new TestCase<>("4x4 Three Flips", new int[][]{{1, 0, 0, 0}, {1, 0, 0, 0}, {0, 0, 0, 1}, {0, 0, 0, 1}}, 3),
            new TestCase<>("5x5 Center Island To Corner", new int[][]{{1, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}}, 3)
        );

        TestRunner<int[][], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Shortest Bridge (DEBUG)",
            testCases,
            grid -> ShortestBridgeDebug.solve(grid),
            false
        );
    }
}

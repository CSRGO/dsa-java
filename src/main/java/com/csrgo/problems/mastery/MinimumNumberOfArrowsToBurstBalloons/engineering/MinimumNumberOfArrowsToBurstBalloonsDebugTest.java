// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.MinimumNumberOfArrowsToBurstBalloons.engineering;

import java.util.*;
import com.csrgo.util.*;

public class MinimumNumberOfArrowsToBurstBalloonsDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[][], Integer>> testCases = List.of(
            new TestCase<>("Overlapping Intervals Four Balloons", new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}}, 2),
            new TestCase<>("Disjoint Intervals", new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}}, 4),
            new TestCase<>("Single Balloon", new int[][]{{1, 2}}, 1),
            new TestCase<>("Touching Boundary Endpoints", new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}}, 2),
            new TestCase<>("Identical Balloons", new int[][]{{2, 5}, {2, 5}, {2, 5}}, 1),
            new TestCase<>("Extreme Negative Numbers Overflow Check", new int[][]{{-2147483646, -2147483645}, {2147483646, 2147483647}}, 2),
            new TestCase<>("Nested Balloons", new int[][]{{1, 10}, {2, 5}, {3, 4}}, 1),
            new TestCase<>("Two Balloons Disjoint", new int[][]{{1, 2}, {4, 5}}, 2),
            new TestCase<>("Negative Range Crossing Zero", new int[][]{{-10, -1}, {-2, 5}, {4, 12}}, 2),
            new TestCase<>("Three Staggered Intervals", new int[][]{{1, 5}, {2, 6}, {6, 8}}, 2)
        );

        TestRunner<int[][], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Minimum Number of Arrows to Burst Balloons (DEBUG)",
            testCases,
            points -> MinimumNumberOfArrowsToBurstBalloonsDebug.solve(points),
            false
        );
    }
}

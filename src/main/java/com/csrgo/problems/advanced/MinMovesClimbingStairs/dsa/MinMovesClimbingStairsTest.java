// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.MinMovesClimbingStairs.dsa;

import java.util.*;
import com.csrgo.util.*;

public class MinMovesClimbingStairsTest {

    public static void main(String[] args) {
        List<TestCase<int[], Integer>> testCases = List.of(
            new TestCase<>("Ten Stairs Multiple Routes", new int[]{3, 2, 4, 2, 0, 2, 3, 1, 2, 2}, 4),
            new TestCase<>("Eleven Stairs Jump Shortcut", new int[]{1, 1, 1, 4, 9, 8, 1, 1, 1, 0, 1}, 5),
            new TestCase<>("Single Stair Blocked", new int[]{0}, -1),
            new TestCase<>("Single Stair Direct Jump", new int[]{1}, 1),
            new TestCase<>("Two Stairs Direct Leap", new int[]{2, 1}, 1),
            new TestCase<>("Four Stairs Unit Increments", new int[]{1, 1, 1, 1}, 4),
            new TestCase<>("Four Stairs Direct Clear", new int[]{4, 0, 0, 0}, 1),
            new TestCase<>("Immediate Block Trapped Start", new int[]{0, 2, 3}, -1),
            new TestCase<>("Bypassing Dead End Zero", new int[]{2, 0, 1, 1}, 3),
            new TestCase<>("Long Leap Over Zero Blockers", new int[]{3, 0, 0, 1}, 2)
        );

        TestRunner<int[], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Min Moves Climbing Stairs",
            testCases,
            input -> MinMovesClimbingStairs.solve(input),
            true
        );
    }
}

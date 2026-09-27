// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ClimbingStairs.dsa;

import java.util.*;
import com.csrgo.util.*;

public class ClimbingStairsTest {

    public static void main(String[] args) {
        List<TestCase<Integer, Integer>> testCases = List.of(
            new TestCase<>("Smallest Single Step", 1, 1),
            new TestCase<>("Two Stairs Small Base", 2, 2),
            new TestCase<>("Three Stairs Standard", 3, 3),
            new TestCase<>("Four Stairs Combinations", 4, 5),
            new TestCase<>("Five Stairs Sequence", 5, 8),
            new TestCase<>("Six Stairs Medium Step", 6, 13),
            new TestCase<>("Seven Stairs Transition", 7, 21),
            new TestCase<>("Eight Stairs Evaluation", 8, 34),
            new TestCase<>("Ten Stairs Larger Bound", 10, 89),
            new TestCase<>("Twenty Stairs Constraint", 20, 10946)
        );

        TestRunner<Integer, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Climbing Stairs",
            testCases,
            input -> ClimbingStairs.solve(input),
            true
        );
    }
}

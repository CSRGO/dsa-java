// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.ClimbStairsWithJumps.dsa;

import java.util.*;
import com.csrgo.util.*;

public class ClimbStairsWithJumpsTest {

    public static void main(String[] args) {
        List<TestCase<int[], Integer>> testCases = List.of(
            new TestCase<>("Six Stairs Multiple Jumps", new int[]{3, 2, 0, 4, 1, 2}, 6),
            new TestCase<>("Four Stairs With Trapped Zero", new int[]{2, 3, 0, 1}, 2),
            new TestCase<>("Single Stair Accessible", new int[]{1}, 1),
            new TestCase<>("Single Stair Zero Blocked", new int[]{0}, 0),
            new TestCase<>("Two Stairs Direct And Step", new int[]{2, 1}, 2),
            new TestCase<>("Uniform Unit Jumps", new int[]{1, 1, 1}, 1),
            new TestCase<>("Three Stairs Double Jump Capacity", new int[]{2, 2, 2}, 3),
            new TestCase<>("Three Stairs Maximum Capacity", new int[]{3, 3, 3}, 4),
            new TestCase<>("Immediate Block At Start", new int[]{0, 2, 3}, 0),
            new TestCase<>("Alternating Zeros In Path", new int[]{2, 0, 2, 0, 1}, 1)
        );

        TestRunner<int[], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Climb Stairs with Jumps",
            testCases,
            input -> ClimbStairsWithJumps.solve(input),
            true
        );
    }
}

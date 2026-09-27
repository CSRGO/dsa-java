// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.AsteroidCollision.engineering;

import java.util.*;
import com.csrgo.util.*;

public class AsteroidCollisionDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Classic Larger Destroys Smaller", new int[]{5, 10, -5}, new int[]{5, 10}),
            new TestCase<>("Equal Size Mutual Destruction", new int[]{8, -8}, new int[]{}),
            new TestCase<>("Leftward Moving Smashes Rightwards", new int[]{10, 2, -5}, new int[]{10}),
            new TestCase<>("Opposing Moving Away Never Meet", new int[]{-2, -1, 1, 2}, new int[]{-2, -1, 1, 2}),
            new TestCase<>("Multiple Equal Oppositions", new int[]{5, 5, -5, -5}, new int[]{}),
            new TestCase<>("Large Negative Sweeps All", new int[]{1, 2, 3, -10}, new int[]{-10}),
            new TestCase<>("All Moving In Same Direction Right", new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}),
            new TestCase<>("All Moving In Same Direction Left", new int[]{-4, -3, -2, -1}, new int[]{-4, -3, -2, -1}),
            new TestCase<>("Two Colliding Elements Remaining", new int[]{-2, -2, 1, -2}, new int[]{-2, -2, -2}),
            new TestCase<>("Complex Cascade Annihilation", new int[]{1, -1, 10, -10, 5}, new int[]{5})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Asteroid Collision (DEBUG)",
            testCases,
            input -> AsteroidCollisionDebug.solve(input),
            false
        );
    }
}

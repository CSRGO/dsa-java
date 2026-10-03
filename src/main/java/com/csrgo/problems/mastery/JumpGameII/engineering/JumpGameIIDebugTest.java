// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.JumpGameII.engineering;

import java.util.*;
import com.csrgo.util.*;

public class JumpGameIIDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[], Integer>> testCases = List.of(
            new TestCase<>("Classic Array Two Jumps", new int[]{2, 3, 1, 1, 4}, 2),
            new TestCase<>("Zero In Middle Two Jumps", new int[]{2, 3, 0, 1, 4}, 2),
            new TestCase<>("Single Element", new int[]{0}, 0),
            new TestCase<>("Two Elements One Step", new int[]{1, 2}, 1),
            new TestCase<>("Direct Jump End", new int[]{5, 1, 1, 1, 1}, 1),
            new TestCase<>("All Ones Three Jumps", new int[]{1, 1, 1, 1}, 3),
            new TestCase<>("Long Ascending Jumps", new int[]{1, 2, 3, 4, 5}, 3),
            new TestCase<>("Two Big Jumps", new int[]{4, 1, 1, 3, 1, 1, 1}, 2),
            new TestCase<>("Alternating Small Jumps", new int[]{2, 1, 2, 1, 1}, 2),
            new TestCase<>("Single Step Array Length 3", new int[]{1, 1, 1}, 2)
        );

        TestRunner<int[], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Jump Game II (DEBUG)",
            testCases,
            nums -> JumpGameIIDebug.solve(nums),
            false
        );
    }
}

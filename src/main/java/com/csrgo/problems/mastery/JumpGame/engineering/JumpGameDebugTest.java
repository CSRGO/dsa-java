// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.JumpGame.engineering;

import java.util.*;
import com.csrgo.util.*;

public class JumpGameDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[], Boolean>> testCases = List.of(
            new TestCase<>("Reachable Path", new int[]{2, 3, 1, 1, 4}, true),
            new TestCase<>("Blocked By Zero", new int[]{3, 2, 1, 0, 4}, false),
            new TestCase<>("Single Element Zero", new int[]{0}, true),
            new TestCase<>("Single Element NonZero", new int[]{5}, true),
            new TestCase<>("All Ones Linear", new int[]{1, 1, 1, 1}, true),
            new TestCase<>("Zero At Start Length Two", new int[]{0, 1}, false),
            new TestCase<>("Huge First Jump", new int[]{10, 0, 0, 0, 0}, true),
            new TestCase<>("Exact Landing On Last", new int[]{1, 2, 0, 1}, true),
            new TestCase<>("Stuck Before End", new int[]{1, 0, 2}, false),
            new TestCase<>("Jump Over Zeros", new int[]{2, 0, 0}, true)
        );

        TestRunner<int[], Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Jump Game (DEBUG)",
            testCases,
            nums -> JumpGameDebug.solve(nums),
            false
        );
    }
}

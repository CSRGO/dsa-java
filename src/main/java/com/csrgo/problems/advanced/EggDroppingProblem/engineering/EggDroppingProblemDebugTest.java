// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.EggDroppingProblem.engineering;

import java.util.*;
import com.csrgo.util.*;

public class EggDroppingProblemDebugTest {

    static class Input {
        final int k;
        final int n;

        Input(int k, int n) {
            this.k = k;
            this.n = n;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>("Single Egg Two Floors", new Input(1, 2), 2),
            new TestCase<>("Two Eggs Six Floors", new Input(2, 6), 3),
            new TestCase<>("Three Eggs Fourteen Floors", new Input(3, 14), 4),
            new TestCase<>("Single Egg Ten Floors", new Input(1, 10), 10),
            new TestCase<>("Classic Hundred Floors Two Eggs", new Input(2, 100), 14),
            new TestCase<>("Zero Eggs Boundary", new Input(0, 5), 0),
            new TestCase<>("Zero Floors Boundary", new Input(5, 0), 0),
            new TestCase<>("Single Floor Two Eggs", new Input(2, 1), 1),
            new TestCase<>("Two Floors Two Eggs", new Input(2, 2), 2),
            new TestCase<>("Four Eggs Thousand Floors", new Input(4, 1000), 13)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Egg Dropping Problem (DEBUG)",
            testCases,
            input -> EggDroppingProblemDebug.solve(input.k, input.n),
            false
        );
    }
}

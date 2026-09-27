// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.TargetSumSubsetsDP.engineering;

import java.util.*;
import com.csrgo.util.*;

public class TargetSumSubsetsDPDebugTest {

    static class Input {
        final int[] arr;
        final int target;

        Input(int[] arr, int target) {
            this.arr = arr;
            this.target = target;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Boolean>> testCases = List.of(
            new TestCase<>("Five Element Array Valid Target", new Input(new int[]{4, 2, 7, 1, 3}, 10), true),
            new TestCase<>("Four Element Subsets Sum Six", new Input(new int[]{1, 2, 3, 7}, 6), true),
            new TestCase<>("Target Exceeds Total Sum", new Input(new int[]{1, 2, 3, 7}, 14), false),
            new TestCase<>("Single Element Exact Match", new Input(new int[]{5}, 5), true),
            new TestCase<>("Single Element Mismatch", new Input(new int[]{5}, 3), false),
            new TestCase<>("Even Elements Even Target", new Input(new int[]{2, 4, 6, 8}, 10), true),
            new TestCase<>("Even Elements Odd Target Impossible", new Input(new int[]{2, 4, 6, 8}, 5), false),
            new TestCase<>("Standard Partition Valid Sum", new Input(new int[]{3, 34, 4, 12, 5, 2}, 9), true),
            new TestCase<>("Standard Partition Invalid Sum", new Input(new int[]{3, 34, 4, 12, 5, 2}, 30), false),
            new TestCase<>("Multiple Equal Subsets Possibility", new Input(new int[]{1, 5, 11, 5}, 11), true)
        );

        TestRunner<Input, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Target Sum Subsets (DP) (DEBUG)",
            testCases,
            input -> TargetSumSubsetsDPDebug.solve(input.arr, input.target),
            false
        );
    }
}

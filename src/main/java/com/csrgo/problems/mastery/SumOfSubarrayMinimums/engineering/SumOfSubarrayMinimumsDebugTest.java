// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SumOfSubarrayMinimums.engineering;

import java.util.*;
import com.csrgo.util.*;

public class SumOfSubarrayMinimumsDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[], Integer>> testCases = List.of(
            new TestCase<>("Small Four Elements", new int[]{3, 1, 2, 4}, 17),
            new TestCase<>("Five Varied Elements", new int[]{11, 81, 94, 43, 3}, 444),
            new TestCase<>("Single Element", new int[]{7}, 7),
            new TestCase<>("Identical Elements Duplicate Handling", new int[]{2, 2, 2}, 12),
            new TestCase<>("Strictly Increasing", new int[]{1, 2, 3}, 10),
            new TestCase<>("Strictly Decreasing", new int[]{3, 2, 1}, 10),
            new TestCase<>("Two Elements Increasing", new int[]{1, 5}, 7),
            new TestCase<>("Two Elements Decreasing", new int[]{5, 1}, 7),
            new TestCase<>("Large Magnitude Elements Modulo", new int[]{10000, 20000, 30000}, 100000),
            new TestCase<>("Alternating Elements", new int[]{1, 3, 1, 3}, 14)
        );

        TestRunner<int[], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Sum of Subarray Minimums (DEBUG)",
            testCases,
            arr -> SumOfSubarrayMinimumsDebug.solve(arr),
            false
        );
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.NextGreaterElement.engineering;

import java.util.*;
import com.csrgo.util.*;

public class NextGreaterElementDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Standard Array Example", new int[]{4, 5, 2, 25}, new int[]{5, 25, 25, -1}),
            new TestCase<>("Descending Values Sequence", new int[]{13, 7, 6, 12}, new int[]{-1, 12, 12, -1}),
            new TestCase<>("Single Element", new int[]{10}, new int[]{-1}),
            new TestCase<>("Strictly Decreasing Array", new int[]{5, 4, 3, 2, 1}, new int[]{-1, -1, -1, -1, -1}),
            new TestCase<>("Strictly Increasing Array", new int[]{1, 2, 3, 4, 5}, new int[]{2, 3, 4, 5, -1}),
            new TestCase<>("All Elements Identical", new int[]{7, 7, 7, 7}, new int[]{-1, -1, -1, -1}),
            new TestCase<>("Two Elements Inverted", new int[]{10, 2}, new int[]{-1, -1}),
            new TestCase<>("Two Elements Ordered", new int[]{2, 10}, new int[]{10, -1}),
            new TestCase<>("Negative Integers Included", new int[]{-5, -2, -8, -1}, new int[]{-2, -1, -1, -1}),
            new TestCase<>("Oscillating Wave Pattern", new int[]{1, 5, 2, 8, 3}, new int[]{5, 8, 8, -1, -1})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Next Greater Element (DEBUG)",
            testCases,
            input -> NextGreaterElementDebug.solve(input),
            false
        );
    }
}

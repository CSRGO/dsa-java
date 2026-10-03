// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.NextSmallerElement.engineering;

import java.util.*;
import com.csrgo.util.*;

public class NextSmallerElementDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Standard Mixed Array", new int[]{4, 5, 2, 10, 8}, new int[]{2, 2, -1, 8, -1}),
            new TestCase<>("Strictly Decreasing", new int[]{3, 2, 1}, new int[]{2, 1, -1}),
            new TestCase<>("Strictly Increasing", new int[]{1, 2, 3, 4}, new int[]{-1, -1, -1, -1}),
            new TestCase<>("Single Element", new int[]{42}, new int[]{-1}),
            new TestCase<>("All Identical Elements", new int[]{5, 5, 5, 5}, new int[]{-1, -1, -1, -1}),
            new TestCase<>("Array With Negative Numbers", new int[]{-1, -3, 2, -5, 0}, new int[]{-3, -5, -5, -1, -1}),
            new TestCase<>("Two Elements Decreasing", new int[]{10, 5}, new int[]{5, -1}),
            new TestCase<>("Two Elements Increasing", new int[]{5, 10}, new int[]{-1, -1}),
            new TestCase<>("Alternating High Low", new int[]{10, 1, 9, 2, 8, 3}, new int[]{1, -1, 2, -1, 3, -1}),
            new TestCase<>("Peak In Middle", new int[]{2, 6, 8, 3, 1}, new int[]{1, 3, 3, 1, -1})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Next Smaller Element (DEBUG)",
            testCases,
            nums -> NextSmallerElementDebug.solve(nums),
            false
        );
    }
}

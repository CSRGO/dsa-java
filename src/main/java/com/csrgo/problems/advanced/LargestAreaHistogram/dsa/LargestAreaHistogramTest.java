// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LargestAreaHistogram.dsa;

import java.util.*;
import com.csrgo.util.*;

public class LargestAreaHistogramTest {

    public static void main(String[] args) {

        List<TestCase<int[], Integer>> testCases = List.of(
            new TestCase<>("Classic Step Histogram", new int[]{2, 1, 5, 6, 2, 3}, 10),
            new TestCase<>("Two Ascending Bars", new int[]{2, 4}, 4),
            new TestCase<>("Single Bar Profile", new int[]{7}, 7),
            new TestCase<>("Flat Equal Height Bars", new int[]{4, 4, 4, 4, 4}, 20),
            new TestCase<>("Strictly Ascending Bars", new int[]{1, 2, 3, 4, 5}, 9),
            new TestCase<>("Strictly Descending Bars", new int[]{5, 4, 3, 2, 1}, 9),
            new TestCase<>("V-Shaped Histogram", new int[]{6, 2, 1, 2, 6}, 6),
            new TestCase<>("Zero Height Interrupted Bars", new int[]{0, 9, 0}, 9),
            new TestCase<>("Alternating Tall and Short Columns", new int[]{2, 1, 2}, 3),
            new TestCase<>("Large Flat High Plateau", new int[]{3, 6, 5, 7, 4, 8, 1, 0}, 20)
        );

        TestRunner<int[], Integer> runner = new TestRunner<>();

        runner.runTests(
            "Largest Area Histogram",
            testCases,
            input -> LargestAreaHistogram.solve(input),
            true
        );
    }
}

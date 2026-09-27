// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.FindMedianFromDataStream.engineering;

import java.util.*;
import com.csrgo.util.*;

public class FindMedianFromDataStreamDebugTest {

    public static void main(String[] args) {
        List<TestCase<int[], double[]>> testCases = List.of(
            new TestCase<>("Classic Four Elements Stream",
                new int[]{5, 15, 1, 3},
                new double[]{5.0, 10.0, 5.0, 4.0}),
            new TestCase<>("Strictly Increasing Three Elements",
                new int[]{2, 3, 4},
                new double[]{2.0, 2.5, 3.0}),
            new TestCase<>("Single Element Stream",
                new int[]{10},
                new double[]{10.0}),
            new TestCase<>("Two Elements Odd Even Test",
                new int[]{1, 2},
                new double[]{1.0, 1.5}),
            new TestCase<>("All Identical Elements Stream",
                new int[]{7, 7, 7, 7},
                new double[]{7.0, 7.0, 7.0, 7.0}),
            new TestCase<>("Negative Numbers In Stream",
                new int[]{-5, -10, -1, -20},
                new double[]{-5.0, -7.5, -5.0, -7.5}),
            new TestCase<>("Strictly Decreasing Sequence",
                new int[]{10, 8, 6, 4, 2},
                new double[]{10.0, 9.0, 8.0, 7.0, 6.0}),
            new TestCase<>("Zero Interspersed Sequence",
                new int[]{0, 0, 0},
                new double[]{0.0, 0.0, 0.0}),
            new TestCase<>("Alternating High And Low Elements",
                new int[]{100, 1, 99, 2},
                new double[]{100.0, 50.5, 99.0, 50.5}),
            new TestCase<>("Symmetric Range Centered Around Zero",
                new int[]{-1, 1, -2, 2},
                new double[]{-1.0, 0.0, -1.0, 0.0})
        );

        TestRunner<int[], double[]> runner = new TestRunner<>();

        runner.runTests(
            "Find Median from Data Stream (DEBUG)",
            testCases,
            input -> FindMedianFromDataStreamDebug.solve(input),
            false
        );
    }
}

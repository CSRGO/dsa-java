// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.GetCommonElementsII.engineering;

import java.util.*;
import com.csrgo.util.*;

public class GetCommonElementsIIDebugTest {

    static class Input {
        final int[] a1;
        final int[] a2;

        Input(int[] a1, int[] a2) {
            this.a1 = a1;
            this.a2 = a2;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Basic Intersecting Multiplicity", new Input(new int[]{1, 1, 2, 2, 2, 3, 5}, new int[]{1, 1, 1, 2, 2, 4, 5}), new int[]{1, 1, 2, 2, 5}),
            new TestCase<>("Completely Disjoint Arrays", new Input(new int[]{2, 4, 6, 8}, new int[]{1, 3, 5, 7}), new int[]{}),
            new TestCase<>("Identical Single Element Arrays", new Input(new int[]{42}, new int[]{42}), new int[]{42}),
            new TestCase<>("Single Element Without Match", new Input(new int[]{10}, new int[]{20}), new int[]{}),
            new TestCase<>("Multiple Identical Values With Unequal Frequencies", new Input(new int[]{3, 3, 3, 3}, new int[]{3, 3}), new int[]{3, 3}),
            new TestCase<>("Negative Numbers Preserving Frequencies", new Input(new int[]{-5, -5, -2, 0, 7}, new int[]{-2, -5, -5, 9}), new int[]{-2, -5, -5}),
            new TestCase<>("Ordering Defined By Second Array Order", new Input(new int[]{10, 20, 30, 20}, new int[]{20, 10, 20, 30}), new int[]{20, 10, 20, 30}),
            new TestCase<>("First Array Is Superset With Multiplicities", new Input(new int[]{1, 1, 2, 2, 3, 3}, new int[]{1, 2, 3}), new int[]{1, 2, 3}),
            new TestCase<>("Second Array Demands More Than First Has", new Input(new int[]{5, 5}, new int[]{5, 5, 5, 5}), new int[]{5, 5}),
            new TestCase<>("Zero Elements Multiplicity Preserved", new Input(new int[]{0, 0, 10, 20}, new int[]{0, 0, 0}), new int[]{0, 0})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Get Common Elements II (DEBUG)",
            testCases,
            input -> GetCommonElementsIIDebug.solve(input.a1, input.a2),
            false
        );
    }
}

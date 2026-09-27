// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.TopKFrequentElements.dsa;

import java.util.*;
import com.csrgo.util.*;

public class TopKFrequentElementsTest {

    static class Input {
        final int[] nums;
        final int k;

        Input(int[] nums, int k) {
            this.nums = nums;
            this.k = k;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Classic Six Elements K Two", new Input(new int[]{1, 1, 1, 2, 2, 3}, 2), new int[]{1, 2}),
            new TestCase<>("Single Element Array K One", new Input(new int[]{1}, 1), new int[]{1}),
            new TestCase<>("All Elements Distinct K Three", new Input(new int[]{4, 1, -1, 2, -1, 2, 3}, 2), new int[]{-1, 2}),
            new TestCase<>("All Elements Same Frequency K All", new Input(new int[]{10, 20, 30}, 3), new int[]{10, 20, 30}),
            new TestCase<>("Negative Numbers With Varied Counts", new Input(new int[]{-4, -4, -4, -2, -2, -1}, 2), new int[]{-4, -2}),
            new TestCase<>("Single Dominant Peak K One", new Input(new int[]{5, 5, 5, 5, 1, 2}, 1), new int[]{5}),
            new TestCase<>("Uniform Duplicates Array", new Input(new int[]{7, 7, 8, 8, 9, 9}, 1), new int[]{7}),
            new TestCase<>("Long Alternating Distribution", new Input(new int[]{1, 2, 1, 2, 1, 3, 1}, 2), new int[]{1, 2}),
            new TestCase<>("Zero Elements Dominating", new Input(new int[]{0, 0, 0, 1, 1, 2}, 2), new int[]{0, 1}),
            new TestCase<>("Wide Range Numbers Frequency Count", new Input(new int[]{100, 200, 200, 300, 300, 300}, 2), new int[]{200, 300})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Top K Frequent Elements",
            testCases,
            input -> TopKFrequentElements.solve(input.nums, input.k),
            true
        );
    }
}

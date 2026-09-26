// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.ChocolateDistribution.engineering;

import java.util.*;
import com.csrgo.util.*;

public class ChocolateDistributionDebugTest {

    static class Input {
        final int[] nums;
        final int m;

        Input(int[] nums, int m) {
            this.nums = nums;
            this.m = m;
        }

        @Override
        public String toString() {
            return "nums=" + Arrays.toString(nums) + ", m=" + m;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>("Classic Seven Packets M Three", new Input(new int[]{7, 3, 2, 4, 9, 12, 56}, 3), 2),
            new TestCase<>("Eight Packets M Five", new Input(new int[]{3, 4, 1, 9, 56, 7, 9, 12}, 5), 6),
            new TestCase<>("M Equals Array Length", new Input(new int[]{12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50}, 17), 48),
            new TestCase<>("M Equals One", new Input(new int[]{5, 10, 15}, 1), 0),
            new TestCase<>("Two Elements M Two", new Input(new int[]{10, 20}, 2), 10),
            new TestCase<>("All Identical Packets", new Input(new int[]{5, 5, 5, 5}, 3), 0),
            new TestCase<>("Large Numbers Difference", new Input(new int[]{1000000000, 1000000005, 1000000002}, 2), 2),
            new TestCase<>("Uniform Spread", new Input(new int[]{1, 2, 3, 4, 5, 6}, 4), 3),
            new TestCase<>("Tight Cluster At Suffix", new Input(new int[]{100, 200, 10, 11, 12}, 3), 2),
            new TestCase<>("Tight Cluster At Prefix", new Input(new int[]{1, 2, 3, 500, 1000}, 3), 2)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Chocolate Distribution [DEBUG]",
            testCases,
            input -> ChocolateDistributionDebug.solve(input.nums, input.m), 
            false 
        );
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.TrappingRainWater.dsa;

import java.util.*;
import com.csrgo.util.*;

public class TrappingRainWaterTest {

    static class Input {
        final int[] height;

        Input(int[] height) {
            this.height = height;
        }

        @Override
        public String toString() {
            return "height=" + Arrays.toString(height);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>("Classic Twelve Elements", new Input(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}), 6),
            new TestCase<>("Six Elements High Capacity", new Input(new int[]{4, 2, 0, 3, 2, 5}), 9),
            new TestCase<>("Empty Array", new Input(new int[]{}), 0),
            new TestCase<>("Single Element", new Input(new int[]{5}), 0),
            new TestCase<>("Two Elements", new Input(new int[]{3, 2}), 0),
            new TestCase<>("Strictly Decreasing Slope", new Input(new int[]{5, 4, 3, 2, 1}), 0),
            new TestCase<>("Strictly Increasing Slope", new Input(new int[]{1, 2, 3, 4, 5}), 0),
            new TestCase<>("Simple Single Basin", new Input(new int[]{3, 0, 3}), 3),
            new TestCase<>("Deep Symmetrical Basin", new Input(new int[]{5, 1, 0, 1, 5}), 18),
            new TestCase<>("Flat Ground Surface", new Input(new int[]{0, 0, 0, 0}), 0)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Trapping Rain Water",
            testCases,
            input -> TrappingRainWater.solve(input.height), 
            true 
        );
    }
}

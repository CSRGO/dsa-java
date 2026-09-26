// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.ContainerWithMostWater.dsa;

import java.util.*;
import com.csrgo.util.*;

public class ContainerWithMostWaterTest {

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
            new TestCase<>("Nine Elements Classic", new Input(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}), 49),
            new TestCase<>("Two Elements Equal", new Input(new int[]{1, 1}), 1),
            new TestCase<>("Two Elements Unequal", new Input(new int[]{4, 3}), 3),
            new TestCase<>("Steep Increasing Slope", new Input(new int[]{1, 2, 4, 3}), 4),
            new TestCase<>("Wide Low Height", new Input(new int[]{2, 3, 4, 5, 18, 17, 6}), 17),
            new TestCase<>("Single Tall Peak in Center", new Input(new int[]{1, 2, 10, 2, 1}), 4),
            new TestCase<>("All Identical Heights", new Input(new int[]{5, 5, 5, 5, 5}), 20),
            new TestCase<>("Descending Heights", new Input(new int[]{10, 9, 8, 7, 6}), 16),
            new TestCase<>("Zeros At Boundary", new Input(new int[]{0, 2, 0}), 0),
            new TestCase<>("Wide Outer Boundaries", new Input(new int[]{10, 1, 1, 1, 10}), 40)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Container With Most Water",
            testCases,
            input -> ContainerWithMostWater.solve(input.height), 
            true 
        );
    }
}

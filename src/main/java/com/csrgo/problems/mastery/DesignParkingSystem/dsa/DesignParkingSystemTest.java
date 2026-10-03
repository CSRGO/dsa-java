// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DesignParkingSystem.dsa;

import java.util.*;
import com.csrgo.util.*;

public class DesignParkingSystemTest {

    static class Input {
        final int big;
        final int medium;
        final int small;
        final int[] carType;

        Input(int big, int medium, int small, int[] carType) {
            this.big = big;
            this.medium = medium;
            this.small = small;
            this.carType = carType;
        }

        @Override
        public String toString() {
            return "big=" + big + ", medium=" + medium + ", small=" + small + ", carType=" + Arrays.toString(carType);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, boolean[]>> testCases = List.of(
            new TestCase<>("Classic Sequence", new Input(1, 1, 0, new int[]{1, 2, 3, 1}), new boolean[]{true, true, false, false}),
            new TestCase<>("Multiple Big Cars", new Input(2, 0, 1, new int[]{1, 1, 1, 3}), new boolean[]{true, true, false, true}),
            new TestCase<>("Zero Capacity All Full", new Input(0, 0, 0, new int[]{1, 2, 3}), new boolean[]{false, false, false}),
            new TestCase<>("Large Slot Capacity", new Input(10, 10, 10, new int[]{1, 2, 3}), new boolean[]{true, true, true}),
            new TestCase<>("Single Small Car Only", new Input(0, 0, 1, new int[]{3}), new boolean[]{true}),
            new TestCase<>("Alternating Sizes", new Input(2, 2, 2, new int[]{1, 2, 3, 1, 2, 3, 1}), new boolean[]{true, true, true, true, true, true, false}),
            new TestCase<>("Single Medium Car", new Input(0, 1, 0, new int[]{2}), new boolean[]{true}),
            new TestCase<>("Small Car Overflow", new Input(1, 1, 1, new int[]{3, 3}), new boolean[]{true, false}),
            new TestCase<>("Medium Car Overflow", new Input(1, 1, 1, new int[]{2, 2}), new boolean[]{true, false}),
            new TestCase<>("Repeated Overflow Attempts", new Input(1, 0, 0, new int[]{1, 1, 1, 1}), new boolean[]{true, false, false, false})
        );

        TestRunner<Input, boolean[]> runner = new TestRunner<>();

        runner.runTests(
            "Design Parking System",
            testCases,
            input -> DesignParkingSystem.solve(input.big, input.medium, input.small, input.carType),
            true
        );
    }
}

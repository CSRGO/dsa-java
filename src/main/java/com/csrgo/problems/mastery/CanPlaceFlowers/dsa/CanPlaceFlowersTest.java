// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CanPlaceFlowers.dsa;

import java.util.*;
import com.csrgo.util.*;

public class CanPlaceFlowersTest {

    static class Input {
        final int[] flowerbed;
        final int n;

        Input(int[] flowerbed, int n) {
            this.flowerbed = flowerbed;
            this.n = n;
        }

        @Override
        public String toString() {
            return "flowerbed=" + Arrays.toString(flowerbed) + ", n=" + n;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Boolean>> testCases = List.of(
            new TestCase<>("Valid Single Insertion", new Input(new int[]{1, 0, 0, 0, 1}, 1), true),
            new TestCase<>("Impossible Two Insertions", new Input(new int[]{1, 0, 0, 0, 1}, 2), false),
            new TestCase<>("Zero Target Flowers", new Input(new int[]{1, 0, 0, 1}, 0), true),
            new TestCase<>("Single Empty Plot One Flower", new Input(new int[]{0}, 1), true),
            new TestCase<>("Single Planted Plot One Flower", new Input(new int[]{1}, 1), false),
            new TestCase<>("Two Empty Plots One Flower", new Input(new int[]{0, 0}, 1), true),
            new TestCase<>("All Empty Three Plots", new Input(new int[]{0, 0, 0}, 2), true),
            new TestCase<>("Edge Placement Left", new Input(new int[]{0, 0, 1, 0, 1}, 1), true),
            new TestCase<>("Edge Placement Right", new Input(new int[]{1, 0, 1, 0, 0}, 1), true),
            new TestCase<>("Alternating Packed Flowerbed", new Input(new int[]{1, 0, 1, 0, 1}, 1), false)
        );

        TestRunner<Input, Boolean> runner = new TestRunner<>();

        runner.runTests(
            "Can Place Flowers",
            testCases,
            input -> CanPlaceFlowers.solve(input.flowerbed, input.n),
            true
        );
    }
}

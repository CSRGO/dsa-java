// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.FurthestBuildingYouCanReach.engineering;

import java.util.*;
import com.csrgo.util.*;

public class FurthestBuildingYouCanReachDebugTest {

    static class Input {
        final int[] heights;
        final int bricks;
        final int ladders;

        Input(int[] heights, int bricks, int ladders) {
            this.heights = heights;
            this.bricks = bricks;
            this.ladders = ladders;
        }

        @Override
        public String toString() {
            return "heights=" + Arrays.toString(heights)
                + ", bricks=" + bricks
                + ", ladders=" + ladders;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Classic Seven Buildings One Ladder",
                new Input(new int[]{4, 2, 7, 6, 9, 14, 12}, 5, 1),
                4
            ),
            new TestCase<>(
                "Nine Buildings Two Ladders",
                new Input(new int[]{4, 12, 2, 7, 3, 18, 20, 3, 19}, 10, 2),
                7
            ),
            new TestCase<>(
                "Four Buildings Zero Ladders Exact Bricks",
                new Input(new int[]{14, 3, 19, 3}, 17, 0),
                3
            ),
            new TestCase<>(
                "Two Buildings Zero Resources",
                new Input(new int[]{1, 2}, 0, 0),
                0
            ),
            new TestCase<>(
                "Two Buildings Single Ladder",
                new Input(new int[]{1, 2}, 0, 1),
                1
            ),
            new TestCase<>(
                "Single Huge Mountain Peak Obstacle",
                new Input(new int[]{1, 5, 1, 2, 3, 4, 10000}, 4, 1),
                5
            ),
            new TestCase<>(
                "Strictly Downhill Buildings",
                new Input(new int[]{10, 9, 8, 7}, 0, 0),
                3
            ),
            new TestCase<>(
                "Six Buildings Sufficient Bricks",
                new Input(new int[]{1, 5, 1, 2, 3, 4}, 10, 0),
                5
            ),
            new TestCase<>(
                "Two Buildings Overabundant Bricks",
                new Input(new int[]{3, 19}, 87, 0),
                1
            ),
            new TestCase<>(
                "Five Buildings Step Jumps",
                new Input(new int[]{1, 3, 7, 10, 15}, 5, 2),
                4
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Furthest Building You Can Reach Debug",
            testCases,
            input -> FurthestBuildingYouCanReachDebug.solve(input.heights.clone(), input.bricks, input.ladders),
            false
        );
    }
}

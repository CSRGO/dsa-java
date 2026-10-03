// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SnakesAndLadders.engineering;

import java.util.*;
import com.csrgo.util.*;

public class SnakesAndLaddersDebugTest {

    static class Input {
        final int[][] board;

        Input(int[][] board) {
            this.board = board;
        }

        @Override
        public String toString() {
            return Arrays.deepToString(board);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Six By Six Standard Classic Board",
                new Input(new int[][]{
                    {-1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1},
                    {-1, -1, -1, -1, -1, -1},
                    {-1, 35, -1, -1, 13, -1},
                    {-1, -1, -1, -1, -1, -1},
                    {-1, 15, -1, -1, -1, -1}
                }),
                4
            ),
            new TestCase<>(
                "Two By Two Ladder At Cell Two",
                new Input(new int[][]{
                    {-1, -1},
                    {-1, 3}
                }),
                1
            ),
            new TestCase<>(
                "Two By Two Empty Board",
                new Input(new int[][]{
                    {-1, -1},
                    {-1, -1}
                }),
                1
            ),
            new TestCase<>(
                "Three By Three Empty Board",
                new Input(new int[][]{
                    {-1, -1, -1},
                    {-1, -1, -1},
                    {-1, -1, -1}
                }),
                2
            ),
            new TestCase<>(
                "Three By Three Ladder Directly To Goal",
                new Input(new int[][]{
                    {-1, -1, -1},
                    {-1, -1, -1},
                    {-1, 9, -1}
                }),
                1
            ),
            new TestCase<>(
                "Four By Four Empty Board Three Rolls",
                new Input(new int[][]{
                    {-1, -1, -1, -1},
                    {-1, -1, -1, -1},
                    {-1, -1, -1, -1},
                    {-1, -1, -1, -1}
                }),
                3
            ),
            new TestCase<>(
                "Four By Four Direct Ladder To Goal",
                new Input(new int[][]{
                    {-1, -1, -1, -1},
                    {-1, -1, -1, -1},
                    {-1, -1, -1, -1},
                    {-1, 16, -1, -1}
                }),
                1
            ),
            new TestCase<>(
                "Two By Two With Snake At Cell Three",
                new Input(new int[][]{
                    {1, -1},
                    {-1, -1}
                }),
                1
            ),
            new TestCase<>(
                "Three By Three Five Snakes Evaded Via Roll Six",
                new Input(new int[][]{
                    {-1, -1, -1},
                    {1, 1, 1},
                    {-1, 1, 1}
                }),
                2
            ),
            new TestCase<>(
                "Completely Trapped Board Trapped At Cell One",
                new Input(new int[][]{
                    {-1, 1},
                    {1, 1}
                }),
                -1
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Snakes and Ladders Debug",
            testCases,
            input -> SnakesAndLaddersDebug.solve(deepCopy(input.board)),
            false
        );
    }

    private static int[][] deepCopy(int[][] original) {
        int[][] copy = new int[original.length][];
        for (int i = 0; i < original.length; i = i + 1) {
            copy[i] = original[i].clone();
        }
        return copy;
    }
}

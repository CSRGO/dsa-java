// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DesignTicTacToe.engineering;

import java.util.*;
import com.csrgo.util.*;

public class DesignTicTacToeDebugTest {

    static class Input {
        final int n;
        final int[][] moves;

        Input(int n, int[][] moves) {
            this.n = n;
            this.moves = moves;
        }

        @Override
        public String toString() {
            return "n=" + n + ", moves=" + Arrays.deepToString(moves);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Classic 3x3 Game Player 1 Wins", new Input(3, new int[][]{{0, 0, 1}, {0, 2, 2}, {2, 2, 1}, {1, 1, 2}, {2, 0, 1}, {1, 0, 2}, {2, 1, 1}}), new int[]{0, 0, 0, 0, 0, 0, 1}),
            new TestCase<>("2x2 Diagonal Win", new Input(2, new int[][]{{0, 0, 1}, {0, 1, 2}, {1, 1, 1}}), new int[]{0, 0, 1}),
            new TestCase<>("Player 2 Row Win", new Input(3, new int[][]{{0, 0, 1}, {1, 0, 2}, {0, 1, 1}, {1, 1, 2}, {2, 2, 1}, {1, 2, 2}}), new int[]{0, 0, 0, 0, 0, 2}),
            new TestCase<>("Player 1 Anti Diagonal Win", new Input(3, new int[][]{{0, 2, 1}, {0, 0, 2}, {1, 1, 1}, {0, 1, 2}, {2, 0, 1}}), new int[]{0, 0, 0, 0, 1}),
            new TestCase<>("Player 2 Column Win", new Input(3, new int[][]{{0, 0, 1}, {0, 1, 2}, {1, 0, 1}, {1, 1, 2}, {2, 2, 1}, {2, 1, 2}}), new int[]{0, 0, 0, 0, 0, 2}),
            new TestCase<>("Draw In 3x3 No Winner", new Input(3, new int[][]{{0, 0, 1}, {0, 1, 2}, {0, 2, 1}, {1, 1, 2}, {1, 0, 1}, {1, 2, 2}, {2, 1, 1}, {2, 0, 2}, {2, 2, 1}}), new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0}),
            new TestCase<>("Single Move No Win", new Input(3, new int[][]{{1, 1, 1}}), new int[]{0}),
            new TestCase<>("Subsequent Moves After Win", new Input(2, new int[][]{{0, 0, 1}, {0, 1, 2}, {1, 1, 1}, {1, 0, 2}}), new int[]{0, 0, 1, 1}),
            new TestCase<>("4x4 Row Win", new Input(4, new int[][]{{0, 0, 1}, {1, 0, 2}, {0, 1, 1}, {1, 1, 2}, {0, 2, 1}, {1, 2, 2}, {0, 3, 1}}), new int[]{0, 0, 0, 0, 0, 0, 1}),
            new TestCase<>("4x4 Main Diagonal Win", new Input(4, new int[][]{{0, 0, 1}, {0, 1, 2}, {1, 1, 1}, {0, 2, 2}, {2, 2, 1}, {0, 3, 2}, {3, 3, 1}}), new int[]{0, 0, 0, 0, 0, 0, 1})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Design Tic Tac Toe (DEBUG)",
            testCases,
            input -> DesignTicTacToeDebug.solve(input.n, input.moves),
            false
        );
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PascalsTriangle.engineering;

import java.util.*;
import com.csrgo.util.*;

public class PascalsTriangleDebugTest {

    static class Input {
        final int numRows;

        Input(int numRows) {
            this.numRows = numRows;
        }

        @Override
        public String toString() {
            return "numRows=" + numRows;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, List<List<Integer>>>> testCases = List.of(
            new TestCase<>(
                "Single Row Base Case",
                new Input(1),
                List.of(List.of(1))
            ),
            new TestCase<>(
                "Two Rows Triangle",
                new Input(2),
                List.of(List.of(1), List.of(1, 1))
            ),
            new TestCase<>(
                "Three Rows Triangle",
                new Input(3),
                List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1))
            ),
            new TestCase<>(
                "Four Rows Triangle",
                new Input(4),
                List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1))
            ),
            new TestCase<>(
                "Five Rows Standard Triangle",
                new Input(5),
                List.of(
                    List.of(1),
                    List.of(1, 1),
                    List.of(1, 2, 1),
                    List.of(1, 3, 3, 1),
                    List.of(1, 4, 6, 4, 1)
                )
            ),
            new TestCase<>(
                "Six Rows Triangle",
                new Input(6),
                List.of(
                    List.of(1),
                    List.of(1, 1),
                    List.of(1, 2, 1),
                    List.of(1, 3, 3, 1),
                    List.of(1, 4, 6, 4, 1),
                    List.of(1, 5, 10, 10, 5, 1)
                )
            ),
            new TestCase<>(
                "Seven Rows Triangle",
                new Input(7),
                List.of(
                    List.of(1),
                    List.of(1, 1),
                    List.of(1, 2, 1),
                    List.of(1, 3, 3, 1),
                    List.of(1, 4, 6, 4, 1),
                    List.of(1, 5, 10, 10, 5, 1),
                    List.of(1, 6, 15, 20, 15, 6, 1)
                )
            ),
            new TestCase<>(
                "Eight Rows Triangle",
                new Input(8),
                List.of(
                    List.of(1),
                    List.of(1, 1),
                    List.of(1, 2, 1),
                    List.of(1, 3, 3, 1),
                    List.of(1, 4, 6, 4, 1),
                    List.of(1, 5, 10, 10, 5, 1),
                    List.of(1, 6, 15, 20, 15, 6, 1),
                    List.of(1, 7, 21, 35, 35, 21, 7, 1)
                )
            ),
            new TestCase<>(
                "Row Size Growth Symmetry Check",
                new Input(3),
                List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1))
            ),
            new TestCase<>(
                "Double Row Check",
                new Input(2),
                List.of(List.of(1), List.of(1, 1))
            )
        );

        TestRunner<Input, List<List<Integer>>> runner = new TestRunner<>();

        runner.runTests(
            "Pascal's Triangle (DEBUG)",
            testCases,
            input -> PascalsTriangleDebug.solve(input.numRows),
            false
        );
    }
}

// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.UniquePaths.dsa;

import java.util.*;
import com.csrgo.util.*;

public class UniquePathsTest {

    static class Input {
        final int m;
        final int n;

        Input(int m, int n) {
            this.m = m;
            this.n = n;
        }

        @Override
        public String toString() {
            return "m=" + m + ", n=" + n;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Three By Seven Grid",
                new Input(3, 7),
                28
            ),
            new TestCase<>(
                "Three By Two Grid",
                new Input(3, 2),
                3
            ),
            new TestCase<>(
                "Single Cell Grid",
                new Input(1, 1),
                1
            ),
            new TestCase<>(
                "Single Row Five Columns",
                new Input(1, 5),
                1
            ),
            new TestCase<>(
                "Five Rows Single Column",
                new Input(5, 1),
                1
            ),
            new TestCase<>(
                "Two By Two Square Grid",
                new Input(2, 2),
                2
            ),
            new TestCase<>(
                "Three By Three Square Grid",
                new Input(3, 3),
                6
            ),
            new TestCase<>(
                "Four By Four Square Grid",
                new Input(4, 4),
                20
            ),
            new TestCase<>(
                "Five By Five Square Grid",
                new Input(5, 5),
                70
            ),
            new TestCase<>(
                "Seven By Three Symmetrical Grid",
                new Input(7, 3),
                28
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Unique Paths",
            testCases,
            input -> UniquePaths.solve(input.m, input.n),
            true
        );
    }
}

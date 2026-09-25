// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.BarChart.dsa;

import java.util.*;
import com.csrgo.util.*;

public class BarChartTest {

    public static void main(String[] args) {

        List<TestCase<int[], String>> testCases = List.of(
            new TestCase<>(
                "Five Elements Classic",
                new int[]{3, 1, 0, 7, 5},
                "\t\t\t*\t\t\n\t\t\t*\t\t\n\t\t\t*\t*\t\n\t\t\t*\t*\t\n*\t\t\t*\t*\t\n*\t\t\t*\t*\t\n*\t*\t\t*\t*\t\n"
            ),
            new TestCase<>(
                "Three Elements Simple",
                new int[]{2, 3, 1},
                "\t*\t\t\n*\t*\t\t\n*\t*\t*\t\n"
            ),
            new TestCase<>(
                "Single Element Unit",
                new int[]{1},
                "*\t\n"
            ),
            new TestCase<>(
                "Single Element Zero",
                new int[]{0},
                ""
            ),
            new TestCase<>(
                "Equal Heights",
                new int[]{2, 2, 2},
                "*\t*\t*\t\n*\t*\t*\t\n"
            ),
            new TestCase<>(
                "Ascending Stairs",
                new int[]{1, 2, 3, 4},
                "\t\t\t*\t\n\t\t*\t*\t\n\t*\t*\t*\t\n*\t*\t*\t*\t\n"
            ),
            new TestCase<>(
                "Descending Stairs",
                new int[]{4, 3, 2, 1},
                "*\t\t\t\t\n*\t*\t\t\t\n*\t*\t*\t\t\n*\t*\t*\t*\t\n"
            ),
            new TestCase<>(
                "All Zeros",
                new int[]{0, 0, 0},
                ""
            ),
            new TestCase<>(
                "Valley Shape",
                new int[]{3, 0, 3},
                "*\t\t*\t\n*\t\t*\t\n*\t\t*\t\n"
            ),
            new TestCase<>(
                "Alternating Peaks",
                new int[]{1, 0, 2, 0, 1},
                "\t\t*\t\t\t\n*\t\t*\t\t*\t\n"
            )
        );

        TestRunner<int[], String> runner = new TestRunner<>();

        runner.runTests(
            "Bar Chart",
            testCases,
            input -> BarChart.solve(input), 
            true 
        );
    }
}

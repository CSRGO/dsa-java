// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.DailyTemperatures.dsa;

import java.util.*;
import com.csrgo.util.*;

public class DailyTemperaturesTest {

    public static void main(String[] args) {

        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Classic Fluctuating Temperatures", new int[]{73, 74, 75, 71, 69, 72, 76, 73}, new int[]{1, 1, 4, 2, 1, 1, 0, 0}),
            new TestCase<>("Strictly Increasing Temperatures", new int[]{30, 40, 50, 60}, new int[]{1, 1, 1, 0}),
            new TestCase<>("Strictly Decreasing Temperatures", new int[]{30, 60, 90}, new int[]{1, 1, 0}),
            new TestCase<>("Flat Equal Temperatures", new int[]{50, 50, 50, 50}, new int[]{0, 0, 0, 0}),
            new TestCase<>("Single Day Temperature", new int[]{80}, new int[]{0}),
            new TestCase<>("Steep Final Day Surge", new int[]{89, 62, 70, 58, 47, 47, 46, 76, 100, 70}, new int[]{8, 1, 5, 4, 3, 2, 1, 1, 0, 0}),
            new TestCase<>("Alternating Rise And Fall", new int[]{70, 75, 71, 75, 72, 75}, new int[]{1, 0, 1, 0, 1, 0}),
            new TestCase<>("Two Days Ascending", new int[]{35, 45}, new int[]{1, 0}),
            new TestCase<>("Two Days Descending", new int[]{45, 35}, new int[]{0, 0}),
            new TestCase<>("Late Jump Warmer", new int[]{55, 38, 53, 81, 61, 93, 97, 32, 43, 78}, new int[]{3, 1, 1, 2, 1, 1, 0, 1, 1, 0})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Daily Temperatures",
            testCases,
            input -> DailyTemperatures.solve(input),
            true
        );
    }
}

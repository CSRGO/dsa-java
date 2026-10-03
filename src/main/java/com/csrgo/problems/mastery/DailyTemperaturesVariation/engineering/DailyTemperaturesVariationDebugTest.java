// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DailyTemperaturesVariation.engineering;

import java.util.*;
import com.csrgo.util.*;

public class DailyTemperaturesVariationDebugTest {

    public static void main(String[] args) {

        List<TestCase<int[], int[]>> testCases = List.of(
            new TestCase<>("Circular Overlap End To Start", new int[]{73, 74, 75, 71, 69, 72, 76, 73}, new int[]{1, 1, 4, 2, 1, 1, 0, 2}),
            new TestCase<>("Strictly Increasing Circular", new int[]{30, 40, 50, 60}, new int[]{1, 1, 1, 0}),
            new TestCase<>("Strictly Decreasing Wrap Around", new int[]{60, 50, 40, 30}, new int[]{0, 3, 2, 1}),
            new TestCase<>("Single Element", new int[]{70}, new int[]{0}),
            new TestCase<>("All Identical Temperatures", new int[]{50, 50, 50}, new int[]{0, 0, 0}),
            new TestCase<>("Dip And Rebound Circular", new int[]{80, 70, 75}, new int[]{0, 1, 1}),
            new TestCase<>("Two Elements Inverted", new int[]{90, 80}, new int[]{0, 1}),
            new TestCase<>("Two Elements Ascending", new int[]{80, 90}, new int[]{1, 0}),
            new TestCase<>("Peak In Middle Circular", new int[]{70, 90, 80}, new int[]{1, 0, 2}),
            new TestCase<>("Alternating Warm Cold", new int[]{65, 75, 65, 75}, new int[]{1, 0, 1, 0})
        );

        TestRunner<int[], int[]> runner = new TestRunner<>();

        runner.runTests(
            "Daily Temperatures (Variation) (DEBUG)",
            testCases,
            temperatures -> DailyTemperaturesVariationDebug.solve(temperatures),
            false
        );
    }
}

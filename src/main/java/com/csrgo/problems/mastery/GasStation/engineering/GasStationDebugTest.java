// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.GasStation.engineering;

import java.util.*;
import com.csrgo.util.*;

public class GasStationDebugTest {

    static class Input {
        final int[] gas;
        final int[] cost;

        Input(int[] gas, int[] cost) {
            this.gas = gas;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "gas=" + Arrays.toString(gas) + ", cost=" + Arrays.toString(cost);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Five Stations Starting At Index Three",
                new Input(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}),
                3
            ),
            new TestCase<>(
                "Three Stations Insufficient Total Gas",
                new Input(new int[]{2, 3, 4}, new int[]{3, 4, 3}),
                -1
            ),
            new TestCase<>(
                "Five Stations Starting At Last Station",
                new Input(new int[]{5, 1, 2, 3, 4}, new int[]{4, 4, 1, 5, 1}),
                4
            ),
            new TestCase<>(
                "Single Station Exact Match",
                new Input(new int[]{2}, new int[]{2}),
                0
            ),
            new TestCase<>(
                "Single Station Deficit",
                new Input(new int[]{1}, new int[]{2}),
                -1
            ),
            new TestCase<>(
                "Uniform Surplus All Stations",
                new Input(new int[]{3, 3, 3}, new int[]{2, 2, 2}),
                0
            ),
            new TestCase<>(
                "Large Surplus Reservoir At End",
                new Input(new int[]{1, 1, 10}, new int[]{3, 3, 2}),
                2
            ),
            new TestCase<>(
                "Exact Total Balance Front Heavy",
                new Input(new int[]{3, 1, 1}, new int[]{1, 2, 2}),
                0
            ),
            new TestCase<>(
                "Zero Initial Gas With Late Reservoir",
                new Input(new int[]{0, 0, 5}, new int[]{1, 1, 2}),
                2
            ),
            new TestCase<>(
                "Six Stations Slight Overall Deficit",
                new Input(new int[]{4, 5, 2, 6, 5, 3}, new int[]{3, 2, 7, 3, 2, 9}),
                -1
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Gas Station (Debug)",
            testCases,
            input -> GasStationDebug.solve(input.gas.clone(), input.cost.clone()),
            false
        );
    }
}

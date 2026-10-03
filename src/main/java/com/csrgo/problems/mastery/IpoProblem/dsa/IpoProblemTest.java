// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.IpoProblem.dsa;

import java.util.*;
import com.csrgo.util.*;

public class IpoProblemTest {

    static class Input {
        final int k;
        final int w;
        final int[] profits;
        final int[] capital;

        Input(int k, int w, int[] profits, int[] capital) {
            this.k = k;
            this.w = w;
            this.profits = profits;
            this.capital = capital;
        }

        @Override
        public String toString() {
            return "k=" + k
                + ", w=" + w
                + ", profits=" + Arrays.toString(profits)
                + ", capital=" + Arrays.toString(capital);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Classic Three Projects K Two",
                new Input(2, 0, new int[]{1, 2, 3}, new int[]{0, 1, 1}),
                4
            ),
            new TestCase<>(
                "Three Projects All Affordable",
                new Input(3, 0, new int[]{1, 2, 3}, new int[]{0, 1, 2}),
                6
            ),
            new TestCase<>(
                "Insufficient Initial Capital Zero",
                new Input(1, 0, new int[]{1, 2, 3}, new int[]{1, 1, 2}),
                0
            ),
            new TestCase<>(
                "Initial Capital Two Large Profit",
                new Input(1, 2, new int[]{1, 2, 3}, new int[]{0, 1, 2}),
                5
            ),
            new TestCase<>(
                "High K Value Pick All Projects",
                new Input(10, 0, new int[]{1, 2, 3}, new int[]{0, 1, 2}),
                6
            ),
            new TestCase<>(
                "Cascading Capital Thresholds",
                new Input(2, 2, new int[]{2, 3, 5}, new int[]{1, 2, 5}),
                10
            ),
            new TestCase<>(
                "Four Projects Multiple Choices",
                new Input(3, 1, new int[]{2, 4, 6, 8}, new int[]{1, 2, 3, 10}),
                13
            ),
            new TestCase<>(
                "Abundant Capital Pick Single Best",
                new Input(1, 10, new int[]{5, 10, 15}, new int[]{1, 2, 3}),
                25
            ),
            new TestCase<>(
                "Greedy Tie Breaking",
                new Input(2, 1, new int[]{1, 2, 3}, new int[]{0, 1, 2}),
                6
            ),
            new TestCase<>(
                "Chain Of Four Projects Zero Start",
                new Input(4, 0, new int[]{1, 3, 5, 7}, new int[]{0, 1, 2, 3}),
                16
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "IPO Problem",
            testCases,
            input -> IpoProblem.solve(input.k, input.w, input.profits.clone(), input.capital.clone()),
            true
        );
    }
}

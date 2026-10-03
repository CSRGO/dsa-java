// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.CoinChangeMinimumCoins.engineering;

import java.util.*;
import com.csrgo.util.*;

public class CoinChangeMinimumCoinsDebugTest {

    static class Input {
        final int[] coins;
        final int amount;

        Input(int[] coins, int amount) {
            this.coins = coins;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "coins=" + Arrays.toString(coins) + ", amount=" + amount;
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>(
                "Standard Case Three Coins",
                new Input(new int[]{1, 2, 5}, 11),
                3
            ),
            new TestCase<>(
                "Impossible Single Denomination",
                new Input(new int[]{2}, 3),
                -1
            ),
            new TestCase<>(
                "Zero Amount Zero Coins",
                new Input(new int[]{1}, 0),
                0
            ),
            new TestCase<>(
                "Exact Match Single Coin",
                new Input(new int[]{1}, 1),
                1
            ),
            new TestCase<>(
                "Two Coins Needed",
                new Input(new int[]{1}, 2),
                2
            ),
            new TestCase<>(
                "Greedy Suboptimal Choice",
                new Input(new int[]{1, 3, 4}, 6),
                2
            ),
            new TestCase<>(
                "Unsorted Coin Array",
                new Input(new int[]{10, 25, 1, 5}, 30),
                2
            ),
            new TestCase<>(
                "Multiple Mixed Denominations",
                new Input(new int[]{2, 5, 10, 1}, 27),
                4
            ),
            new TestCase<>(
                "Prime Coins Impossible Target",
                new Input(new int[]{3, 5}, 7),
                -1
            ),
            new TestCase<>(
                "All Coins Exceed Target Amount",
                new Input(new int[]{5, 10}, 3),
                -1
            )
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Coin Change (Minimum Coins) Debug",
            testCases,
            input -> CoinChangeMinimumCoinsDebug.solve(input.coins.clone(), input.amount),
            false
        );
    }
}

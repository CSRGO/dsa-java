// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CoinChangeCombination.dsa;

import java.util.*;
import com.csrgo.util.*;

public class CoinChangeCombinationTest {

    static class Input {
        final int[] coins;
        final int amount;

        Input(int[] coins, int amount) {
            this.coins = coins;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>("Classic Prime Coins Target Seven", new Input(new int[]{2, 3, 5}, 7), 2),
            new TestCase<>("Three Denominations Target Five", new Input(new int[]{1, 2, 5}, 5), 4),
            new TestCase<>("Single Coin Impossible Odd Target", new Input(new int[]{2}, 3), 0),
            new TestCase<>("Single Coin Exact Match", new Input(new int[]{10}, 10), 1),
            new TestCase<>("Zero Target Base Case", new Input(new int[]{1}, 0), 1),
            new TestCase<>("Unit Coin Arbitrary Target", new Input(new int[]{1}, 4), 1),
            new TestCase<>("Even Coins Impossible Target", new Input(new int[]{2, 4}, 7), 0),
            new TestCase<>("Even Coins Reachable Target", new Input(new int[]{2, 4}, 6), 2),
            new TestCase<>("Two Small Coins Target Four", new Input(new int[]{1, 2}, 4), 3),
            new TestCase<>("Specific Combination Single Route", new Input(new int[]{3, 5}, 11), 1)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Coin Change Combination",
            testCases,
            input -> CoinChangeCombination.solve(input.coins, input.amount),
            true
        );
    }
}

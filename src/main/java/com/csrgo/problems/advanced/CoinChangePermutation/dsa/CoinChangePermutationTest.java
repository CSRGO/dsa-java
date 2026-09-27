// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.CoinChangePermutation.dsa;

import java.util.*;
import com.csrgo.util.*;

public class CoinChangePermutationTest {

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
            new TestCase<>("Classic Prime Coins Permutations Target Seven", new Input(new int[]{2, 3, 5}, 7), 5),
            new TestCase<>("Small Coins Permutations Target Three", new Input(new int[]{1, 2}, 3), 3),
            new TestCase<>("Single Coin Impossible Odd Target", new Input(new int[]{2}, 3), 0),
            new TestCase<>("Single Coin Exact Match", new Input(new int[]{10}, 10), 1),
            new TestCase<>("Zero Target Base Case", new Input(new int[]{1}, 0), 1),
            new TestCase<>("Three Consecutive Coins Target Four", new Input(new int[]{1, 2, 3}, 4), 7),
            new TestCase<>("Even Coins Impossible Target", new Input(new int[]{2, 4}, 7), 0),
            new TestCase<>("Even Coins Ordered Routes", new Input(new int[]{2, 4}, 6), 3),
            new TestCase<>("Two Coins Target Four Permutations", new Input(new int[]{1, 2}, 4), 5),
            new TestCase<>("Single Repeating Coin Exact Factor", new Input(new int[]{3}, 9), 1)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Coin Change Permutation",
            testCases,
            input -> CoinChangePermutation.solve(input.coins, input.amount),
            true
        );
    }
}

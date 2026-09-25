// All rights reserved to CSRGO DSA
package com.csrgo.problems.basic.BestTimeToBuyAndSellStock.dsa;

import java.util.*;
import com.csrgo.util.*;

public class BestTimeToBuyAndSellStockTest {

    static class Input {
        final int[] prices;

        Input(int[] prices) {
            this.prices = prices;
        }

        @Override
        public String toString() {
            return "prices=" + Arrays.toString(prices);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, Integer>> testCases = List.of(
            new TestCase<>("Classic Profit", new Input(new int[]{7, 1, 5, 3, 6, 4}), 5),
            new TestCase<>("Monotonically Decreasing", new Input(new int[]{7, 6, 4, 3, 1}), 0),
            new TestCase<>("Monotonically Increasing", new Input(new int[]{1, 2, 3, 4, 5}), 4),
            new TestCase<>("Single Day Price", new Input(new int[]{5}), 0),
            new TestCase<>("Two Days Profit", new Input(new int[]{2, 4}), 2),
            new TestCase<>("Two Days Loss", new Input(new int[]{4, 2}), 0),
            new TestCase<>("Constant Prices", new Input(new int[]{3, 3, 3, 3, 3}), 0),
            new TestCase<>("Valley In Middle Then Peak", new Input(new int[]{3, 2, 6, 5, 0, 3}), 4),
            new TestCase<>("Late Dip No Sell", new Input(new int[]{2, 10, 1}), 8),
            new TestCase<>("Zero Price Point", new Input(new int[]{0, 6, 0, 8}), 8)
        );

        TestRunner<Input, Integer> runner = new TestRunner<>();

        runner.runTests(
            "Best Time to Buy and Sell Stock",
            testCases,
            input -> BestTimeToBuyAndSellStock.solve(input.prices), 
            true 
        );
    }
}

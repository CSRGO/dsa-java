// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.DesignHitCounter.dsa;

import java.util.*;
import com.csrgo.util.*;

public class DesignHitCounterTest {

    static class Input {
        final String[] operations;
        final int[] timestamps;

        Input(String[] operations, int[] timestamps) {
            this.operations = operations;
            this.timestamps = timestamps;
        }

        @Override
        public String toString() {
            return "ops=" + Arrays.toString(operations) + ", times=" + Arrays.toString(timestamps);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, int[]>> testCases = List.of(
            new TestCase<>("Classic Sequence", new Input(new String[]{"hit", "hit", "hit", "getHits", "hit", "getHits", "getHits"}, new int[]{1, 2, 3, 4, 300, 300, 301}), new int[]{3, 4, 3}),
            new TestCase<>("Single Hit And Query", new Input(new String[]{"hit", "getHits"}, new int[]{1, 300}), new int[]{1}),
            new TestCase<>("Hits Expire Boundary", new Input(new String[]{"hit", "getHits"}, new int[]{1, 301}), new int[]{0}),
            new TestCase<>("Multiple Hits Same Timestamp", new Input(new String[]{"hit", "hit", "hit", "getHits"}, new int[]{10, 10, 10, 10}), new int[]{3}),
            new TestCase<>("Empty Query Initial", new Input(new String[]{"getHits"}, new int[]{100}), new int[]{0}),
            new TestCase<>("Wrap Around Buckets", new Input(new String[]{"hit", "hit", "getHits"}, new int[]{1, 301, 302}), new int[]{1}),
            new TestCase<>("Consecutive Seconds Continuous", new Input(new String[]{"hit", "hit", "hit", "getHits"}, new int[]{1, 2, 3, 3}), new int[]{3}),
            new TestCase<>("Long Delay Between Hits", new Input(new String[]{"hit", "getHits", "hit", "getHits"}, new int[]{10, 20, 1000, 1005}), new int[]{1, 1}),
            new TestCase<>("Two Hits At Same Second Expire", new Input(new String[]{"hit", "hit", "getHits"}, new int[]{50, 50, 350}), new int[]{0}),
            new TestCase<>("High Volume Same Second", new Input(new String[]{"hit", "hit", "hit", "hit", "hit", "getHits"}, new int[]{5, 5, 5, 5, 5, 6}), new int[]{5})
        );

        TestRunner<Input, int[]> runner = new TestRunner<>();

        runner.runTests(
            "Design Hit Counter",
            testCases,
            input -> DesignHitCounter.solve(input.operations, input.timestamps),
            true
        );
    }
}

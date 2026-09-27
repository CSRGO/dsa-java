// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LFUCache.engineering;

import java.util.*;
import com.csrgo.util.*;

public class LFUCacheDebugTest {

    static class Input {
        final int capacity;
        final String[] operations;

        Input(int capacity, String[] operations) {
            this.capacity = capacity;
            this.operations = operations;
        }

        @Override
        public String toString() {
            return "capacity=" + capacity + ", operations=" + Arrays.toString(operations);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, List<Integer>>> testCases = List.of(
            new TestCase<>("Classic LeetCode LFU Sequence", new Input(2, new String[]{"put 1 1", "put 2 2", "get 1", "put 3 3", "get 2", "get 3", "put 4 4", "get 1", "get 3", "get 4"}), Arrays.asList(null, null, 1, null, -1, 3, null, -1, 3, 4)),
            new TestCase<>("Zero Capacity Cache", new Input(0, new String[]{"put 0 0", "get 0"}), Arrays.asList(null, -1)),
            new TestCase<>("Capacity One Replacement", new Input(1, new String[]{"put 2 1", "get 2", "put 3 2", "get 2", "get 3"}), Arrays.asList(null, 1, null, -1, 2)),
            new TestCase<>("Key Value Overwrite Updates Frequency", new Input(2, new String[]{"put 1 1", "put 1 2", "get 1"}), Arrays.asList(null, null, 2)),
            new TestCase<>("Tie In Frequency Resolved By LRU", new Input(2, new String[]{"put 1 1", "put 2 2", "put 3 3", "get 1", "get 2", "get 3"}), Arrays.asList(null, null, null, -1, 2, 3)),
            new TestCase<>("Multiple Gets Elevate Frequency", new Input(2, new String[]{"put 1 10", "put 2 20", "get 1", "get 1", "put 3 30", "get 2", "get 1"}), Arrays.asList(null, null, 10, 10, null, -1, 10)),
            new TestCase<>("Get Missing Key", new Input(2, new String[]{"get 10"}), Arrays.asList(-1)),
            new TestCase<>("Capacity Three Frequency Diversity", new Input(3, new String[]{"put 1 1", "put 2 2", "put 3 3", "get 1", "get 2", "put 4 4", "get 3", "get 4"}), Arrays.asList(null, null, null, 1, 2, null, -1, 4)),
            new TestCase<>("Consecutive Overwrites", new Input(2, new String[]{"put 1 5", "put 1 15", "put 1 25", "get 1"}), Arrays.asList(null, null, null, 25)),
            new TestCase<>("Eviction Cascade", new Input(2, new String[]{"put 1 1", "put 2 2", "put 3 3", "put 4 4", "get 1", "get 2", "get 3", "get 4"}), Arrays.asList(null, null, null, null, -1, -1, 3, 4))
        );

        TestRunner<Input, List<Integer>> runner = new TestRunner<>();

        runner.runTests(
            "LFU Cache (DEBUG)",
            testCases,
            input -> LFUCacheDebug.solve(input.capacity, input.operations),
            false
        );
    }
}

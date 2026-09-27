// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.LRUCache.engineering;

import java.util.*;
import com.csrgo.util.*;

public class LRUCacheDebugTest {

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
            new TestCase<>("Classic Sequence With Eviction", new Input(2, new String[]{"put 1 1", "put 2 2", "get 1", "put 3 3", "get 2", "put 4 4", "get 1", "get 3", "get 4"}), Arrays.asList(null, null, 1, null, -1, null, -1, 3, 4)),
            new TestCase<>("Capacity One Single Eviction", new Input(1, new String[]{"put 2 1", "get 2", "put 3 2", "get 2", "get 3"}), Arrays.asList(null, 1, null, -1, 2)),
            new TestCase<>("Key Overwrite Does Not Evict", new Input(2, new String[]{"put 1 10", "put 1 20", "get 1"}), Arrays.asList(null, null, 20)),
            new TestCase<>("Get Miss Returns Negative One", new Input(2, new String[]{"get 5"}), Arrays.asList(-1)),
            new TestCase<>("Access Order Preservation", new Input(2, new String[]{"put 1 1", "put 2 2", "get 1", "put 3 3", "get 2"}), Arrays.asList(null, null, 1, null, -1)),
            new TestCase<>("Multiple Consecutive Puts", new Input(3, new String[]{"put 1 1", "put 2 2", "put 3 3", "get 1", "get 2", "get 3"}), Arrays.asList(null, null, null, 1, 2, 3)),
            new TestCase<>("Capacity Three Eviction", new Input(3, new String[]{"put 1 1", "put 2 2", "put 3 3", "put 4 4", "get 1"}), Arrays.asList(null, null, null, null, -1)),
            new TestCase<>("Update Value Refreshes Recency", new Input(2, new String[]{"put 1 1", "put 2 2", "put 1 10", "put 3 3", "get 2", "get 1"}), Arrays.asList(null, null, null, null, -1, 10)),
            new TestCase<>("Repeated Get On Same Key", new Input(2, new String[]{"put 1 5", "get 1", "get 1", "get 1"}), Arrays.asList(null, 5, 5, 5)),
            new TestCase<>("Eviction Cascade", new Input(2, new String[]{"put 1 1", "put 2 2", "put 3 3", "put 4 4", "get 1", "get 2", "get 3", "get 4"}), Arrays.asList(null, null, null, null, -1, -1, 3, 4))
        );

        TestRunner<Input, List<Integer>> runner = new TestRunner<>();

        runner.runTests(
            "LRU Cache (DEBUG)",
            testCases,
            input -> LRUCacheDebug.solve(input.capacity, input.operations),
            false
        );
    }
}

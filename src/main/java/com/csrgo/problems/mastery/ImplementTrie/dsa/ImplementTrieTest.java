// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ImplementTrie.dsa;

import java.util.*;
import com.csrgo.util.*;

public class ImplementTrieTest {

    static class Input {
        final String[] operations;
        final String[] words;

        Input(String[] operations, String[] words) {
            this.operations = operations;
            this.words = words;
        }

        @Override
        public String toString() {
            return "ops=" + Arrays.toString(operations) + ", words=" + Arrays.toString(words);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, boolean[]>> testCases = List.of(
            new TestCase<>("Classic Apple Sequence", new Input(new String[]{"insert", "search", "search", "startsWith", "insert", "search"}, new String[]{"apple", "apple", "app", "app", "app", "app"}), new boolean[]{true, false, true, true}),
            new TestCase<>("Simple Prefix Query", new Input(new String[]{"insert", "startsWith"}, new String[]{"hello", "hell"}), new boolean[]{true}),
            new TestCase<>("Word Absent", new Input(new String[]{"insert", "search"}, new String[]{"car", "cat"}), new boolean[]{false}),
            new TestCase<>("Multiple Inserts Same Prefix", new Input(new String[]{"insert", "insert", "search", "search"}, new String[]{"a", "ab", "a", "ab"}), new boolean[]{true, true}),
            new TestCase<>("Prefix Without Full Word", new Input(new String[]{"insert", "search", "startsWith"}, new String[]{"banana", "ban", "ban"}), new boolean[]{false, true}),
            new TestCase<>("Empty Search On Empty Trie", new Input(new String[]{"search"}, new String[]{"empty"}), new boolean[]{false}),
            new TestCase<>("Long String Insert And Search", new Input(new String[]{"insert", "search"}, new String[]{"supercalifragilisticexpialidocious", "supercalifragilisticexpialidocious"}), new boolean[]{true}),
            new TestCase<>("Single Character Operations", new Input(new String[]{"insert", "search", "search"}, new String[]{"z", "z", "y"}), new boolean[]{true, false}),
            new TestCase<>("Prefix Equal To Inserted Word", new Input(new String[]{"insert", "startsWith"}, new String[]{"code", "code"}), new boolean[]{true}),
            new TestCase<>("Sequential Prefix Check", new Input(new String[]{"insert", "startsWith", "startsWith", "startsWith"}, new String[]{"network", "net", "netw", "not"}), new boolean[]{true, true, false})
        );

        TestRunner<Input, boolean[]> runner = new TestRunner<>();

        runner.runTests(
            "Implement Trie",
            testCases,
            input -> ImplementTrie.solve(input.operations, input.words),
            true
        );
    }
}

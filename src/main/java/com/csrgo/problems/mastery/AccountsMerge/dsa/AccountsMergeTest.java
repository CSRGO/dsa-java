// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.AccountsMerge.dsa;

import java.util.*;
import com.csrgo.util.*;

public class AccountsMergeTest {

    static class Input {
        List<List<String>> accounts;

        Input(List<List<String>> accounts) {
            this.accounts = accounts;
        }

        @Override
        public String toString() {
            return "accounts=" + accounts;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, List<List<String>>>> testCases = List.of(
            new TestCase<>(
                "Multiple Accounts Partial Overlap Two Distinct Persons",
                new Input(List.of(
                    List.of("John", "johnsmith@mail.com", "john_newyork@mail.com"),
                    List.of("John", "johnsmith@mail.com", "john00@mail.com"),
                    List.of("Mary", "mary@mail.com"),
                    List.of("John", "johnnybravo@mail.com")
                )),
                List.of(
                    List.of("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"),
                    List.of("John", "johnnybravo@mail.com"),
                    List.of("Mary", "mary@mail.com")
                )
            ),
            new TestCase<>(
                "Multiple Disjoint People Ordered Output",
                new Input(List.of(
                    List.of("Gabe", "Gabe0@m.co", "Gabe3@m.co", "Gabe1@m.co"),
                    List.of("Kevin", "Kevin3@m.co", "Kevin5@m.co", "Kevin0@m.co"),
                    List.of("Ethan", "Ethan5@m.co", "Ethan4@m.co", "Ethan0@m.co"),
                    List.of("Hanzo", "Hanzo3@m.co", "Hanzo1@m.co", "Hanzo0@m.co"),
                    List.of("Fern", "Fern5@m.co", "Fern1@m.co", "Fern0@m.co")
                )),
                List.of(
                    List.of("Ethan", "Ethan0@m.co", "Ethan4@m.co", "Ethan5@m.co"),
                    List.of("Fern", "Fern0@m.co", "Fern1@m.co", "Fern5@m.co"),
                    List.of("Gabe", "Gabe0@m.co", "Gabe1@m.co", "Gabe3@m.co"),
                    List.of("Hanzo", "Hanzo0@m.co", "Hanzo1@m.co", "Hanzo3@m.co"),
                    List.of("Kevin", "Kevin0@m.co", "Kevin3@m.co", "Kevin5@m.co")
                )
            ),
            new TestCase<>(
                "Single Account Single Email",
                new Input(List.of(
                    List.of("Alex", "alex@m.co")
                )),
                List.of(
                    List.of("Alex", "alex@m.co")
                )
            ),
            new TestCase<>(
                "Duplicate Identical Accounts Merged",
                new Input(List.of(
                    List.of("Alex", "alex@m.co"),
                    List.of("Alex", "alex@m.co")
                )),
                List.of(
                    List.of("Alex", "alex@m.co")
                )
            ),
            new TestCase<>(
                "Transitive Chain Across Four Accounts",
                new Input(List.of(
                    List.of("David", "david0@m.co", "david1@m.co"),
                    List.of("David", "david1@m.co", "david2@m.co"),
                    List.of("David", "david2@m.co", "david3@m.co")
                )),
                List.of(
                    List.of("David", "david0@m.co", "david1@m.co", "david2@m.co", "david3@m.co")
                )
            ),
            new TestCase<>(
                "Empty Account List",
                new Input(List.of()),
                List.of()
            ),
            new TestCase<>(
                "Alphabetical Order Between Independent Accounts",
                new Input(List.of(
                    List.of("Bob", "bob@m.co"),
                    List.of("Alice", "alice@m.co")
                )),
                List.of(
                    List.of("Alice", "alice@m.co"),
                    List.of("Bob", "bob@m.co")
                )
            ),
            new TestCase<>(
                "Cycle Transitive Emails Same Individual",
                new Input(List.of(
                    List.of("John", "a@m.co", "b@m.co"),
                    List.of("John", "c@m.co", "d@m.co"),
                    List.of("John", "a@m.co", "d@m.co")
                )),
                List.of(
                    List.of("John", "a@m.co", "b@m.co", "c@m.co", "d@m.co")
                )
            ),
            new TestCase<>(
                "Unsorted Emails Within Single Account",
                new Input(List.of(
                    List.of("User", "z@m.co", "a@m.co")
                )),
                List.of(
                    List.of("User", "a@m.co", "z@m.co")
                )
            ),
            new TestCase<>(
                "Same Name Different Disconnected Emails",
                new Input(List.of(
                    List.of("Sam", "s1@m.co"),
                    List.of("Sam", "s2@m.co")
                )),
                List.of(
                    List.of("Sam", "s1@m.co"),
                    List.of("Sam", "s2@m.co")
                )
            )
        );

        TestRunner<Input, List<List<String>>> runner = new TestRunner<>();

        runner.runTests(
            "Accounts Merge",
            testCases,
            input -> AccountsMerge.solve(input.accounts),
            true
        );
    }
}

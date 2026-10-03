// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.ReconstructItinerary.engineering;

import java.util.*;
import com.csrgo.util.*;

public class ReconstructItineraryDebugTest {

    static class Input {
        final String[][] tickets;

        Input(String[][] tickets) {
            this.tickets = tickets;
        }

        @Override
        public String toString() {
            return Arrays.deepToString(tickets);
        }
    }

    public static void main(String[] args) {

        List<TestCase<Input, String[]>> testCases = List.of(
            new TestCase<>(
                "Standard Four Ticket Path",
                new Input(new String[][]{{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}}),
                new String[]{"JFK", "MUC", "LHR", "SFO", "SJC"}
            ),
            new TestCase<>(
                "Lexicographical Tie Break",
                new Input(new String[][]{{"JFK", "SFO"}, {"JFK", "ATL"}, {"SFO", "ATL"}, {"ATL", "JFK"}, {"ATL", "SFO"}}),
                new String[]{"JFK", "ATL", "JFK", "SFO", "ATL", "SFO"}
            ),
            new TestCase<>(
                "Single Ticket Journey",
                new Input(new String[][]{{"JFK", "KUL"}}),
                new String[]{"JFK", "KUL"}
            ),
            new TestCase<>(
                "Round Trip To Tokyo",
                new Input(new String[][]{{"JFK", "NRT"}, {"NRT", "JFK"}}),
                new String[]{"JFK", "NRT", "JFK"}
            ),
            new TestCase<>(
                "Multiple Star Out and Backs",
                new Input(new String[][]{{"JFK", "AAA"}, {"AAA", "JFK"}, {"JFK", "BBB"}, {"BBB", "JFK"}}),
                new String[]{"JFK", "AAA", "JFK", "BBB", "JFK"}
            ),
            new TestCase<>(
                "Dead End Avoidance Via Eulerian Trail",
                new Input(new String[][]{{"JFK", "KUL"}, {"JFK", "NRT"}, {"NRT", "JFK"}}),
                new String[]{"JFK", "NRT", "JFK", "KUL"}
            ),
            new TestCase<>(
                "Two Separate Loops Starting and Ending At JFK",
                new Input(new String[][]{{"JFK", "A"}, {"A", "B"}, {"B", "JFK"}, {"JFK", "C"}, {"C", "JFK"}}),
                new String[]{"JFK", "A", "B", "JFK", "C", "JFK"}
            ),
            new TestCase<>(
                "Linear Multi Hop Coast To Coast",
                new Input(new String[][]{{"JFK", "BOS"}, {"BOS", "MIA"}, {"MIA", "ORD"}}),
                new String[]{"JFK", "BOS", "MIA", "ORD"}
            ),
            new TestCase<>(
                "Branching With Cycle And Destination",
                new Input(new String[][]{{"JFK", "DXB"}, {"DXB", "SIN"}, {"SIN", "JFK"}, {"JFK", "HND"}}),
                new String[]{"JFK", "DXB", "SIN", "JFK", "HND"}
            ),
            new TestCase<>(
                "Triangle Loop Then Detour",
                new Input(new String[][]{{"JFK", "LHR"}, {"LHR", "CDG"}, {"CDG", "JFK"}, {"JFK", "SYD"}}),
                new String[]{"JFK", "LHR", "CDG", "JFK", "SYD"}
            )
        );

        TestRunner<Input, String[]> runner = new TestRunner<>();

        runner.runTests(
            "Reconstruct Itinerary Debug",
            testCases,
            input -> ReconstructItineraryDebug.solve(deepCopy(input.tickets)),
            false
        );
    }

    private static String[][] deepCopy(String[][] original) {
        String[][] copy = new String[original.length][];
        for (int i = 0; i < original.length; i = i + 1) {
            copy[i] = original[i].clone();
        }
        return copy;
    }
}

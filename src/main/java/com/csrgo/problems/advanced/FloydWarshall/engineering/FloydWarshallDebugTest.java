// All rights reserved to CSRGO DSA
package com.csrgo.problems.advanced.FloydWarshall.engineering;

import com.csrgo.util.TestCase;
import com.csrgo.util.TestRunner;
import java.util.List;

public class FloydWarshallDebugTest {

    static class Input {
        int[][] matrix;

        Input(int[][] matrix) {
            this.matrix = matrix;
        }
    }

    public static void main(String[] args) {
        List<TestCase<Input, int[][]>> testCases = List.of(
            new TestCase<>(
                "Standard 4x4 Graph with Updates",
                new Input(new int[][]{
                    {0, 2, -1, -1},
                    {1, 0, 3, -1},
                    {-1, -1, 0, -1},
                    {3, 5, 4, 0}
                }),
                new int[][]{
                    {0, 2, 5, -1},
                    {1, 0, 3, -1},
                    {-1, -1, 0, -1},
                    {3, 5, 4, 0}
                }
            ),
            new TestCase<>(
                "2x2 Single Directed Edge",
                new Input(new int[][]{
                    {0, 25},
                    {-1, 0}
                }),
                new int[][]{
                    {0, 25},
                    {-1, 0}
                }
            ),
            new TestCase<>(
                "1x1 Trivial Matrix",
                new Input(new int[][]{
                    {0}
                }),
                new int[][]{
                    {0}
                }
            ),
            new TestCase<>(
                "2x2 Disconnected Vertices",
                new Input(new int[][]{
                    {0, -1},
                    {-1, 0}
                }),
                new int[][]{
                    {0, -1},
                    {-1, 0}
                }
            ),
            new TestCase<>(
                "3x3 Linear Chain",
                new Input(new int[][]{
                    {0, 3, -1},
                    {-1, 0, 4},
                    {-1, -1, 0}
                }),
                new int[][]{
                    {0, 3, 7},
                    {-1, 0, 4},
                    {-1, -1, 0}
                }
            ),
            new TestCase<>(
                "3x3 Full Cycle",
                new Input(new int[][]{
                    {0, 2, -1},
                    {-1, 0, 3},
                    {4, -1, 0}
                }),
                new int[][]{
                    {0, 2, 5},
                    {7, 0, 3},
                    {4, 6, 0}
                }
            ),
            new TestCase<>(
                "Shortcut Through Intermediate Vertex",
                new Input(new int[][]{
                    {0, 10, 3},
                    {-1, 0, -1},
                    {-1, 2, 0}
                }),
                new int[][]{
                    {0, 5, 3},
                    {-1, 0, -1},
                    {-1, 2, 0}
                }
            ),
            new TestCase<>(
                "2x2 Symmetric Edges",
                new Input(new int[][]{
                    {0, 5},
                    {5, 0}
                }),
                new int[][]{
                    {0, 5},
                    {5, 0}
                }
            ),
            new TestCase<>(
                "4x4 Directed Line",
                new Input(new int[][]{
                    {0, 1, -1, -1},
                    {-1, 0, 1, -1},
                    {-1, -1, 0, 1},
                    {-1, -1, -1, 0}
                }),
                new int[][]{
                    {0, 1, 2, 3},
                    {-1, 0, 1, 2},
                    {-1, -1, 0, 1},
                    {-1, -1, -1, 0}
                }
            ),
            new TestCase<>(
                "3x3 Completely Disconnected",
                new Input(new int[][]{
                    {0, -1, -1},
                    {-1, 0, -1},
                    {-1, -1, 0}
                }),
                new int[][]{
                    {0, -1, -1},
                    {-1, 0, -1},
                    {-1, -1, 0}
                }
            )
        );

        TestRunner<Input, int[][]> runner = new TestRunner<>();
        runner.runTests(
            "Floyd Warshall (DEBUG)",
            testCases,
            input -> FloydWarshallDebug.solve(input.matrix),
            false
        );
    }
}

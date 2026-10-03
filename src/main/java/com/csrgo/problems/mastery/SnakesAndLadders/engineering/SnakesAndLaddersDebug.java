// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.SnakesAndLadders.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/snakes-and-ladders/
public class SnakesAndLaddersDebug {

    // TODO: debug this method to fix it
    public static int solve(int[][] board) {
        if (board == null || board.length <= 2) {
            return 0;
        }

        int n = board.length;
        int target = n * n;
        boolean[] visited = new boolean[target + 1];

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        visited[1] = true;

        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int s = 0; s < size; s = s + 1) {
                int curr = queue.poll();
                if (curr == target) {
                    return moves;
                }

                for (int dice = 1; dice <= 5; dice = dice + 1) {
                    int next = curr + dice;
                    if (next > target) {
                        break;
                    }

                    int[] pos = getCoordinates(next, n);
                    int r = pos[0];
                    int c = pos[1];

                    int dest = board[r][c] != -1 ? board[r][c] : next;
                    if (!visited[dest]) {
                        visited[dest] = true;
                        queue.offer(dest);
                    }
                }
            }
            moves = moves + 1;
        }

        return -1;
    }

    private static int[] getCoordinates(int square, int n) {
        int rowFromBottom = (square - 1) / n;
        int r = n - 1 - rowFromBottom;
        int c = (square - 1) % n;
        return new int[]{r, c};
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Snakes and Ladders (Debug) ====");
        System.out.print("Enter board dimension n: ");
        int n = sc.nextInt();
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i = i + 1) {
            for (int j = 0; j < n; j = j + 1) {
                System.out.print("Enter cell (" + i + ", " + j + ") value (-1 if empty): ");
                board[i][j] = sc.nextInt();
            }
        }

        int result = solve(board);

        System.out.println("------------------------");
        System.out.println("Board         : " + Arrays.deepToString(board));
        System.out.println("Minimum Moves : " + result);
        System.out.println("========================");

        sc.close();
    }
}

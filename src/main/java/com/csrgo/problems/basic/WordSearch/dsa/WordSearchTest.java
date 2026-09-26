// All rights reserved to CSRGO DSA

package com.csrgo.problems.basic.WordSearch.dsa;

public class WordSearchTest {

    private static int totalPassed = 0;
    private static int totalFailed = 0;

    private static boolean dfs(char[][] b, String w, int r, int c, int idx) {
        if (idx == w.length()) return true;
        if (r < 0 || c < 0 || r >= b.length || c >= b[0].length || b[r][c] != w.charAt(idx)) return false;
        char temp = b[r][c];
        b[r][c] = '#';
        boolean found = dfs(b, w, r - 1, c, idx + 1)
                     || dfs(b, w, r + 1, c, idx + 1)
                     || dfs(b, w, r, c - 1, idx + 1)
                     || dfs(b, w, r, c + 1, idx + 1);
        b[r][c] = temp;
        return found;
    }

    private static boolean expected(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null) return false;
        char[][] copy = new char[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) copy[i] = board[i].clone();
        for (int r = 0; r < copy.length; r++) {
            for (int c = 0; c < copy[0].length; c++) {
                if (copy[r][c] == word.charAt(0)) {
                    if (dfs(copy, word, r, c, 0)) return true;
                }
            }
        }
        return false;
    }

    private static void runTestCase(int testNumber, char[][] board, String word) {
        boolean expectedResult = expected(board, word);
        boolean actualResult = WordSearch.solve(board, word);

        if (expectedResult == actualResult) {
            System.out.println("Test " + testNumber + " PASSED: word=\"" + word + "\", result=" + actualResult);
            totalPassed++;
        } else {
            System.out.println("Test " + testNumber + " FAILED: word=\"" + word + "\", expected=" + expectedResult + ", actual=" + actualResult);
            totalFailed++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Running WordSearch tests...");

        char[][] board1 = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };

        runTestCase(1, board1, "ABCCED");
        runTestCase(2, board1, "SEE");
        runTestCase(3, board1, "ABCB");
        runTestCase(4, board1, "A");
        runTestCase(5, board1, "Z");
        runTestCase(6, new char[][]{{'a'}}, "a");
        runTestCase(7, new char[][]{{'a'}}, "b");
        runTestCase(8, new char[][]{{'a', 'b'}, {'c', 'd'}}, "acdb");
        runTestCase(9, new char[][]{{'a', 'b'}, {'c', 'd'}}, "abcd");
        runTestCase(10, board1, "ESCE");

        System.out.println("\nTests completed: " + totalPassed + " passed, " + totalFailed + " failed.");
        if (totalFailed > 0) {
            System.exit(1);
        }
    }
}

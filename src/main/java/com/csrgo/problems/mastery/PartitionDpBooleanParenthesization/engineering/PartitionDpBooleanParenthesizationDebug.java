// All rights reserved to CSRGO DSA
package com.csrgo.problems.mastery.PartitionDpBooleanParenthesization.engineering;

import java.util.*;

// Problem Link: https://dsa.csrgo.com/problems/partition-dp-boolean-parenthesization/
public class PartitionDpBooleanParenthesizationDebug {

    private static final int MOD = 1003;

    // TODO: debug this method to fix it
    public static int solve(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int n = s.length();
        int numSymbols = (n + 1) / 2;
        char[] symbols = new char[numSymbols];
        char[] ops = new char[numSymbols - 1];

        int symIdx = 0;
        int opIdx = 0;
        for (int i = 0; i < n; i = i + 1) {
            if (i % 2 == 0) {
                symbols[symIdx] = s.charAt(i);
                symIdx = symIdx + 1;
            } else {
                ops[opIdx] = s.charAt(i);
                opIdx = opIdx + 1;
            }
        }

        int[][] tTable = new int[numSymbols][numSymbols];
        int[][] fTable = new int[numSymbols][numSymbols];

        for (int i = 0; i < numSymbols; i = i + 1) {
            if (symbols[i] == 'T') {
                tTable[i][i] = 0;
                fTable[i][i] = 1;
            } else {
                tTable[i][i] = 0;
                fTable[i][i] = 1;
            }
        }

        for (int len = 2; len < numSymbols; len = len + 1) {
            for (int i = 0; i <= numSymbols - len; i = i + 1) {
                int j = i + len - 1;
                tTable[i][j] = 0;
                fTable[i][j] = 0;

                for (int k = i; k < j; k = k + 1) {
                    char op = ops[k];
                    int totalLeft = (tTable[i][k] + fTable[i][k]) % MOD;
                    int totalRight = (tTable[k + 1][j] + fTable[k + 1][j]) % MOD;
                    int total = (totalLeft * totalRight) % MOD;

                    if (op == '&') {
                        int trueWays = (tTable[i][k] * tTable[k + 1][j]) % MOD;
                        tTable[i][j] = (tTable[i][j] + trueWays) % MOD;
                        fTable[i][j] = (fTable[i][j] + total - trueWays + MOD) % MOD;
                    } else if (op == '|') {
                        int falseWays = (fTable[i][k] * fTable[k + 1][j]) % MOD;
                        fTable[i][j] = (fTable[i][j] + falseWays) % MOD;
                        tTable[i][j] = (tTable[i][j] + total - falseWays + MOD) % MOD;
                    } else if (op == '^') {
                        int trueWays = (tTable[i][k] * fTable[k + 1][j] + fTable[i][k] * tTable[k + 1][j]) % MOD;
                        int falseWays = (tTable[i][k] * tTable[k + 1][j] + fTable[i][k] * fTable[k + 1][j]) % MOD;
                        tTable[i][j] = (tTable[i][j] + falseWays) % MOD;
                        fTable[i][j] = (fTable[i][j] + trueWays) % MOD;
                    }
                }
            }
        }

        return tTable[0][numSymbols - 1];
    }

    // run this method for custom input to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== Partition DP (Boolean Parenthesization) Debug ====");
        System.out.print("Enter boolean expression s (e.g. T|T&F^T): ");
        String s = sc.nextLine().trim();

        int ways = solve(s);
        System.out.println("Ways to Parenthesize to True: " + ways);
    }
}

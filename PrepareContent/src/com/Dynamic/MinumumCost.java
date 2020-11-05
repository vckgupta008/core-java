package com.Dynamic;

import java.util.*;

public class MinumumCost {
    private static int minCost(int cost[][], int m, int n) {
        int minCost[][] = new int[m + 1][n + 1];
        minCost[0][0] = cost[0][0];
        for(int i = 1; i <= m; i++) {
            minCost[i][0] = cost[i][0] + minCost[i - 1][0];
        }

        for(int i = 1; i <= n; i++) {
            minCost[0][i] = cost[0][i] + minCost[0][i - 1];
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int leftCost = minCost[i][j - 1];
                int diagCost = minCost[i - 1][j - 1];
                int topCost = minCost[i - 1][j];
                minCost[i][j] = cost[i][j] + Math.min(Math.min(leftCost, diagCost), topCost);
            }
        }
        return minCost[m][n];

        // converting each row as string
        // and then printing in a separate line
        /* Initialise the first column of the minimum cost (table) array */
        /* Initialise the first row of the table array */
        /* Construct the rest of the table array from the recursion relation */
//        return minCost[m][n];
    }

    public static void main(String args[]) {
        int cost[][] = {{1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}};
        Scanner scan = new Scanner(System.in);
        int xCoordinate = scan.nextInt();
        int yCoordinate = scan.nextInt();
        System.out.print(minCost(cost, xCoordinate, yCoordinate));
    }
}

package com.Dynamic;

public class MinCoins2 {
    public static void main(String[] args) {
        int amount = 20;
        int[] d = {1,5,7,10};
        System.out.print(count(d, amount));

    }
    public static int count(int[] d, int amount) {
        int[][] V = new int[amount + 1][d.length+1];

        int n = d.length;

        int T[][] = new int[n + 1][amount + 1];

        for (int i = 0 ; i <= n; i++) {
            T[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (d[i - 1] > j) {
                    T[i][j] = T[i - 1][j];
                }
                else {
                    T[i][j] = T[i - 1][j] + T[i][j - d[i - 1]];
                }
            }
        }

        return T[n][amount];

//        for (int j = 0; j < d.length; j++) {
//            V[0][j] = 0;
//        }
//        for (int i = 0; i <= amount; i++) {
//            V[i][0] = i;
//        }
//
//        for (int j = 1; j < d.length; j++) {
//            for (int i = 1; i <= amount; i++) {
//                if((d[j - 1] <= i && V[i][j - 1] > V[i - d[j - 1]][j] + 1)){
//                    V[i][j] = V[i][j-1] + V[i - d[j - 1]][j];
//                }
//            }
//        }
//        System.out.println("Minimum number of coins used is :" + V[amount][d.length-1]);

    }
}

package com.Algo1;
import java.lang.String;
import java.util.Scanner;


public class Source1 {
    public static int fun(int a) {
        //write your code here


        if (a > 100)
            return a - 10;
        return fun(fun(a + 11));
//        if (b == 0)
//            return 0;
//        if (b % 2 == 0)
//            return fun(a + a, b / 2);
//        return fun(a + a, b / 2) + a;

//        if (a % 2 == 1)
//            return a++;
//        else
//            return fun(fun(a - 1));

//        if(x>0){
//            fun(x-1);
//            System.out.print(x-1+" ");
//            fun(x-1);
//        }

//        if(n>1){
//           func(n-1);
//        }

//        for (int i = 0; i < n; i++) {
//            System.out.print("*");
//        }
//            System.out.println();

//
//        static boolean check(int p1, int s1, int p2, int s2) {
//            int max = Integer.MAX_VALUE;
//            while (p1 <= max && p2 <= max) {
//                if (p1 == p2)
//                    return true;
//                p1 += s1;
//                p2 += s2;
//            }
//            return false;
//        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
//        int n2  = in.nextInt();
        System.out.print(fun(n));
    }
}

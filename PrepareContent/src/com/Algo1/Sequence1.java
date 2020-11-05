package com.Algo1;

import java.util.Scanner;

public class Sequence1 {
    //    public int fibonacci(int n) {
//        if (n == 1)
//            return n;
//        else
//            return fibonacci(n-1);
//    }
    public static void print(int n) {
//        if(n<1) print(n-1);
//
//        for(int i=0;i<n;i++){
//            System.out.print('*');
//        }
//        System.out.println();

        if(n<1) return;

        for(int i=0;i<n;i++){
            System.out.print('*');
        }
        System.out.println();
        print(n-1);
    }

    public static int sumOfDigit(int n) {
        if(n<10){
            return n;
        }

        return n%10 + sumOfDigit(n/10);
    }


    private static int evenSum(int n) {
        return (n / 2) * (1 + n / 2);
    }

    public static void main(String args[]) {
        System.out.println("Enter the fibonacci number to be generated : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sequence1 sequence = new Sequence1();
        int number = sequence.evenSum(n);
        System.out.println("Fibonacci number:  " + number);

        print(5);
        System.out.println("sum number:  " + sumOfDigit(492));

    }
}

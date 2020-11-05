package com.Algo1;
import java.util.Scanner;

public class SumOfDigit {
    public static int sum(int n) {
        //write the logic here
        if(n<10){
            return n;
        }
        return n%10 + sum(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
}

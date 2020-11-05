package com.Algo1;
import java.util.Scanner;

public class palindrom {
    public static boolean palindrome(int[] num, int index) {
        //write the logic here
        int last=(num.length-1)-index;
        if(index>=last)
            return true;
        else if(num[index]==num[last]){
            return palindrome(num,index+1);
        }
        else
            return false;

    }
    public static int func(int n) {
        if (n == 1)
            return 0;
        else
            return 1 + func(n/2);
    }



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[5];
        for(int i=0; i< 5;i++)
            num[i]=sc.nextInt();
        boolean answer =palindrome(num, 0);
        System.out.println(answer);
        System.out.println(func(12));
    }
}

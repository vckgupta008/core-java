package com.Dynamic;

import com.test.Main;

import java.util.*;

public class SuperHero {
    public static int minJump(int n) {
//        int f[] = new int[n+1];
//        /* Declare an array to store the minimum jumps. */
//        /* Initialise th    e base condition */
//        /* Fill in the array to find Minimum Jumps from a certain distance */
//        return f[n];
        int jumps1=n,jumps2=n,jumps3=n;
        if (n == 1) {
            return 1;
            // return jumps - you don't need to recurse here
        } else {
            // find at what all places you can jump
            jumps1 = minJump(n - 1) + 1;
            if (n % 2 == 0) {
                jumps2 = minJump(n / 2) + 1;
            }
            if (n % 3 == 0) {
                jumps3 = minJump(n / 3) + 1;
            }
            return Math.min(Math.min(jumps1, jumps2), jumps3); // takes jump2 and jump3 only if they are valid
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();
        if (distance > 0) {
            System.out.println(minJump(distance)-1);
        } else {
            System.out.println("Distance should be a positive integer");
        }

    }
}

package com.Stacks;
import java.util.*;

public class Source1 {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        printFifthElementFromStart(stack);
    }

    // Method to print the fifth element from the bottom of the stack
    static void printFifthElementFromStart(Stack<Integer> stack) {
        // Write your code here

        if(stack.size()-5>=0){
            System.out.print(stack.get(1));
        }
        else{
            System.out.print("There are not enough elements in the stack");
        }

    }
}

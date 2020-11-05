package com.Stacks;
import java.util.*;

public class ReverseHalf {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        reverseSecondHalf(stack);
    }

    // Method to reverse the last half of the elements from the bottom of the stack
    static void reverseSecondHalf(Stack<Integer> stack) {
        // Write your code here

        double half = Math.floor(stack.size()/2);
        while(half!=stack.size()){
            stack.insertElementAt(stack.pop(),(int)half);
            half++;
        }
        System.out.print(stack);
    }
}

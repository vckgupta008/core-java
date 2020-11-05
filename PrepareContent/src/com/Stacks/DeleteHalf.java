package com.Stacks;
import java.util.*;

public class DeleteHalf {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        deleteFirstHalf(stack);
    }

    // Method to delete the first half of the elements from the bottom of the stackand print the remaining elements
    static void deleteFirstHalf(Stack<Integer> stack) {
        // Write your code here
        double half = Math.floor(stack.size()/2)-1;
        while(half>=0){
            System.out.println(stack.get((int)half));
            stack.removeElementAt((int)half);
            half--;
        }
        System.out.print(stack);
    }
}

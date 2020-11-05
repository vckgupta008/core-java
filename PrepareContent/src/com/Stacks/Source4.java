package com.Stacks;
//import java.util.*;
import java.lang.*;
import java.util.Stack;

public class Source4 {
    public static void main(String arg[]) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(2);
        stack.push(14);
        stack.push(23);
        stack.pop();
        stack.push(12);

        stack.setElementAt(45,1);
        stack.insertElementAt(53,2);
        stack.insertElementAt(54,3);


        //Write your code here. Your stack should finally look like this: [2, 45, 53, 54, 12].
        System.out.print(stack);


    }
}

package com.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(1);
        queue.add(1);queue.add(1);queue.add(1);
        queue.add(1);
        queue.add(1);
        queue.add(1);queue.add(1);queue.add(1);
        Stack<Integer> stack = new Stack<Integer>();
        int counter=0;
        while (!queue.isEmpty()){
            System.out.print(++counter);
            if(stack.isEmpty() || stack.peek()>queue.peek()){
                int x=queue.remove();
                stack.push(x);

            }
            else
            {
                stack.pop();
            }
        }
    }
}

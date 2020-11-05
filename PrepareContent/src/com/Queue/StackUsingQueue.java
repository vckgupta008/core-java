package com.Queue;

import java.util.*;

public class StackUsingQueue {
    /*implementing queue using linked list */
    Queue<Integer> q = new LinkedList<Integer>();

    /* Push operation of stack using queue*/
    void push(int x) {
        //write your code here
        q.add(x);
        int c = 1;
        while (c <= q.size() - 1) {
            q.add(q.remove());
            c++;
        }
    }

    /*Removes the top element of the stack*/

    int pop() {
        return q.remove();
        //write your code here
    }


    /*Returns the element at the top of the stack */
    int top() {
        return q.peek();
        //write your code here
    }


    public static void main(String[] args) {
        StackUsingQueue obj = new StackUsingQueue();
        Scanner in = new Scanner(System.in);

        /*Enter the number of elements you want to add in the stack */

        int n = in.nextInt();

        /*Enter the elements of the stack */
        for (int i = 0; i < n; i++) {
            obj.push(in.nextInt());
            System.out.println(obj + " " + i);
        }

        try {
            System.out.println(obj.top());
            obj.pop();

            System.out.println(obj.top());

        } catch (Exception e) {
            System.out.println("Stack is empty");
        }

    }
}

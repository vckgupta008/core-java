package com.Queue;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Queue;


public class Source22 {
    public static void main(String[] args) {
        Queue numbers = new LinkedList();
//        List(numbers);
//        while(!numbers.isEmpty()){
//            numbers.remove();
//        }
        numbers.add(1);
        numbers.add(4);
        numbers.add(9);
        numbers.add(14);
        numbers.add(15);

        numbers.remove(9);
        System.out.println(numbers);

        // Write your code here
        // You should only add some numbers, dequeue, or peek to change the elements in the queue
        // so that the queue becomes [1,4,9,14,15]

    }

    public static void List(Queue numbers) {
        int i = 0;
        while(i <= 12) {
            if(i%2==0) {
                numbers.add(i);
            }
            i++;
        }
    }
}

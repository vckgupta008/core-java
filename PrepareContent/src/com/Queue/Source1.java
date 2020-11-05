package com.Queue;
import java.util.*;

public class Source1 {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        printFifthElementFromEnd(queue);
    }

    // Method to print the fifth element from the tail of the queue
    static void printFifthElementFromEnd(Queue<Integer> queue) {
        // Write your code here
        if(queue.size()>=5){
            int size = queue.size()-5;
            System.out.print(queue.size()-5);
            int counter=0;
            while(counter<size){
                queue.remove();
                System.out.println(counter+" "+queue);
                counter++;
            }
            System.out.print(queue.peek());
        }
        else {
            System.out.print("There are not enough elements in the queue");
        }
    }
}

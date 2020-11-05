package com.Queue;
import java.util.*;

public class DeleteHalf {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        deleteSecondHalf(queue);
    }

    // Method to delete the second half of the elements and print the remaining elements
    static void deleteSecondHalf(Queue<Integer> queue) {
        // Write your code here
        Queue<Integer> queue2 = new LinkedList<Integer>();
        double size = Math.floor(queue.size()/2);
//        System.out.print(size);
        for(int i=0;i<(int)size;i++){

//            System.out.println(i+" "+queue.remove());
            queue2.add(queue.remove());
        }
        System.out.print(queue2);
    }
}

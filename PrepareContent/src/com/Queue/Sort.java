package com.Queue;
import java.util.*;

public class Sort {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        sort(queue);
    }

    // Method to sort the queue
    static void sort(Queue<Integer> queue) {
        // Write your code here
        List<Integer> listInteger = new ArrayList<Integer>();
        listInteger.addAll(queue);
        Collections.sort(listInteger);
        Iterator<Integer> iter = listInteger.iterator();
        Queue<Integer> queue2 = new LinkedList<Integer>();
        while (iter.hasNext()) {
           queue2.add(iter.next());
        }
        System.out.print(queue2);

    }
}

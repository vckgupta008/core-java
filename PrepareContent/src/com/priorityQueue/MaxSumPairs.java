package com.priorityQueue;
import java.util.ArrayList;
import java.util.*;

public class MaxSumPairs {
    public static void main(String args[]) {
        //below two ArrayList are used to store the given input
        ArrayList<Integer> ArrayL1 = new ArrayList<Integer>();
        ArrayList<Integer> ArrayL2 = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);
        int n, i;

        // size of ArrayL1 = size of ArrayL2 = n
        n = in.nextInt();

        for (i = 0; i < n; i++) {
            ArrayL1.add(in.nextInt());
        }
        for (i = 0; i < n; i++) {
            ArrayL2.add(in.nextInt());
        }

        PriorityQueue<Integer> sumPairs = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });

        for(Integer first:ArrayL1){
            for(Integer second: ArrayL2){
                sumPairs.add(first+second);
            }
        }
        while(n>=1){
            System.out.println(sumPairs.poll());
            n--;
        }


        //write your code here

    }
}

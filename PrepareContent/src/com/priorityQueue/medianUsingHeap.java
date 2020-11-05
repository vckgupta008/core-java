package com.priorityQueue;

import java.util.*;

public class medianUsingHeap {

    public static void addNumber(int number, PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        if (lowers.size() == 0 || number < lowers.peek()) {
            lowers.add(number);
        } else {
            highers.add(number);
        }
    }

    public static void rebalance(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers) {
        PriorityQueue<Integer> biggerHeap=lowers.size()>highers.size()?lowers:highers;
        PriorityQueue<Integer> smallerHeap=lowers.size()>highers.size()?highers:lowers;

        if(biggerHeap.size()-smallerHeap.size()>=2){
            smallerHeap.add(biggerHeap.poll());
        }
    }

    public static double getMedians(PriorityQueue<Integer> lowers, PriorityQueue<Integer> highers){
        PriorityQueue<Integer> biggerHeap=lowers.size()>highers.size()?lowers:highers;
        PriorityQueue<Integer> smallerHeap=lowers.size()>highers.size()?highers:lowers;
        if(biggerHeap.size()==smallerHeap.size()){
            return (biggerHeap.peek()+smallerHeap.peek())/2;
        }
        else{
            return biggerHeap.peek();
        }
    }



    public static void main(String args[]) {

        medianUsingHeap obj = new medianUsingHeap();

        Scanner in = new Scanner(System.in);
        int array[] = new int[100];
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        //write your code here
        PriorityQueue<Integer> lowers = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });
        PriorityQueue<Integer> highers = new PriorityQueue<Integer>();
        double[] medians = new double[array.length];
        for (int i = 0; i < n; i++) {
            int number = array[i];
            addNumber(number, lowers, highers);
            rebalance(lowers, highers);
            medians[i] = getMedians(lowers, highers);
        }

        for(int i=0;i<n;i++){
            System.out.println(medians[i]);
        }


    }
}

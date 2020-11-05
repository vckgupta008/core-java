package com.Array;

import java.util.*;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> numlist = new ArrayList<Integer>();
        numlist.add(1);
        numlist.add(2);
        numlist.add(3);
        numlist.add(4);
        numlist.add(5);
        numlist.add(6);
        ListIterator<Integer> it = numlist.listIterator(3);
        System.out.print(it.next());
        System.out.print(it.next());
//        process(numlist);
    }
    public static void process(List<Integer> numberList){
        ListIterator<Integer> it = numberList.listIterator(numberList.size());
        while(it.hasPrevious()) {
            if(it.hasPrevious()) {
                System.out.println(it.previous());
            }
            it.previous();
        }
    }
}

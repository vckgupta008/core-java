package com.Array;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.io.IOException;
public class Source {

    public static void main(String[] args) {ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);

        System.out.println(random.contains(5.0f));
//        List<Float> random = new ArrayList<Float>();
//        random.add(2f);
//        random.add(4f);
//        random.add(5f);
//        random.add(10f);
//        random.add(99.9f);
//        random.add(101f);
//
//        iterateAltn(random);
//        fun1();
//        System.out.print("A");
    }
    static void fun1() {
        try {
            fun2();
            System.out.print("B");
        } catch (Exception e) {
            System.out.print("C");
        }
    }

    static void fun2() throws IOException {
        fun3();
        System.out.print("D");
    }

    static void fun3() throws IOException {
        throw new IOException();
    }


//    public static void iterateAltn(List<Float> num) {
//        ListIterator<Float> it = num.listIterator();
//        while(it.hasNext()) {
//            if(it.nextIndex()%2==0){
//                System.out.println(it.next());
//            }
//               else{
//                   it.next();
//            }
//        }
//    }
}

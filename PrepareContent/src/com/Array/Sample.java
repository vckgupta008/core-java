package com.Array;
import java.util.ArrayList;
public class Sample {
    public static void main(String arg[]){
        Object[] arr = new Object[6];
        arr[0] = new String("First Pair");
        arr[1] = 1;
        arr[2] = new String("Second Pair");
        arr[3] = 2;
        arr[4] = new String("Third Pair");
        arr[5] = 3;
        //System.out.print(arr[0]+" "+arr[1]);
//        printMixList(arr);
//        ArrayList mix = new ArrayList();
//        mix.add("Hari");
//        mix.add(2);
//        System.out.println("hihjlkjjl");
//        printMixList(mix);

//        ArrayList<String> list = new ArrayList<String>( );
    }
    public static void printMixList(ArrayList elements) {
        for(Object o : elements) {
            System.out.println(o);
        }
    }
}

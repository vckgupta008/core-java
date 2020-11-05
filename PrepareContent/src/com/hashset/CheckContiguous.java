package com.hashset;
import java.util.*;

public class CheckContiguous {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();

        //array to store the input elements
        int[] array = new int[n];

        //storing the elements to the array
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);

        for (int i = 1; i < n; i++)
            if (array[i] - array[i-1] > 1)
                System.out.print(false);
                return;

//       System.out.print(true);
//        TreeSet<Integer> num=new TreeSet<Integer>();
//        for(int i=0;i<array.length;i++){
//            num.add(array[i]);
//        }
//        Iterator<Integer> itr=num.iterator();
//        int currentElement=-1;
//        while(itr.hasNext()){
//
//            System.out.println(itr.next());
//        }
        // Write your code here

    }
}

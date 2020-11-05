package com.hashset;

import java.util.*;

class Source1 {

    public static void main(String arg[]) {
        Scanner in = new Scanner(System.in);

        //number of pairs in the array
        int n = in.nextInt();
        int arr[][] = new int[n][2];

        // store the input pairs to an array "arr"
        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        // Write your code here
        boolean flag= false;
        for (int i = 0; i < n; i++) {
           int first1 = arr[i][0];
           int second1 = arr[i][1];
           Integer data = pairs.get(second1);
           if(data!=null && data == first1){
               System.out.print(second1+" "+first1);
               flag=true;
           }
           else {
               pairs.put(first1, second1);
           }
        }
        if(!flag){
            System.out.print("No Symmetric pair");

        }
    }
}



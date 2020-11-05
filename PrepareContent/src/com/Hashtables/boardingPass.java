package com.Hashtables;

import java.util.*;
import java.util.Scanner;

class boardingPass {
    public static void main(String[] args)
    {
        Hashtable<Integer,String> boardingPass= new Hashtable<Integer,String>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int arr[]=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i:arr)
        {
//            System.out.print(i);
            if(boardingPass.containsKey(i)) {
                System.out.print(i);
            }
            else{
                boardingPass.put(i,i+"");
            }
            //Check whether the pass already exists in the hash table or not. If it doesn’t, add it to the table; otherwise, print the duplicate pass number.
        }
    }
}


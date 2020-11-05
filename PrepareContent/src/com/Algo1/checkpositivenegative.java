package com.Algo1;
import java.util.*;

public class checkpositivenegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.print(5^7);
        partitionNegativeAndPositive(n, arr);
    }

    // Method to partition negative and positive numbers without comparing with 0
    static void partitionNegativeAndPositive(int n, int arr[]) {
        // Write your code here
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
         list1.add(arr[0]);

         for(int i =1;i<arr.length;i++){
             if((arr[0]^arr[i])<0){
                 list2.add(arr[i]);
             }
             else{
                 list1.add(arr[i]);
             }
         }
         if(list1.size()>0){
             print(list1);
             if(list2.size()>0){
                 print(list2);
             }
             else{
                 if((arr[0]^ 1) <0){
                    System.out.print("Array doesn't have positive numbers");
                 }
                 else{
                     System.out.print("Array doesn't have negative numbers");
                 }
             }
         }

    }
    static void print(ArrayList<Integer> arr){
        Iterator itr=arr.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
    }
}

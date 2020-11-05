package com.Sort;
import java.util.*;

public class NameSort {
    public static void SortAndDisplay(String arr[], String mode){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1].compareTo(arr[j])>0 && mode=="asc") {
                    //swap elements
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                if (arr[j - 1].compareTo(arr[j])<0 && mode=="des") {
                    //swap elements
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
    }
    public static void print(String arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String firstNames[] = new String[size];
        String lastNames[] = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
//        for (int i = 0; i < size; i++) {
//            lastNames[i] = scanner.next().toLowerCase();
//        }
        SortAndDisplay(firstNames, "asc");
//        SortAndDisplay(lastNames, "des");
        //Write your code here
    }
}

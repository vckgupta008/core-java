package com.Sort;
import java.util.*;

public class Source {
    static int totalBubbleSortSwaps(int[] array, int M) {
        int size = array.length;
        int var = 0;
        int totalSwaps = 0;

        //Write your code here
        for(int i =0;i<M;i++){
            for(int j=1;j<size-i;j++){
                if(array[j-1]<array[j]){
                    var = array[j-1];
                    array[j-1]=array[j];
                    array[j]=var;
                    totalSwaps++;
                }
            }
        }
        return totalSwaps;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int size = sc.nextInt();
        int array[]= new int[size];
        for(int i=0;i<size;i++){
            array[i]= sc.nextInt();
        }
        System.out.print(totalBubbleSortSwaps(array, M));
    }
}

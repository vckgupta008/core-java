package com.Sort;
import java.util.Scanner;
import java.util.Arrays;

public class SourceMergeSort {
    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sizeArray2 = scanner.nextInt();
        int sortedArray1[] = getArrayInput(sizeArray1, scanner);
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);
//        System.out.print(Arrays.toString(sortedArray1));
//        System.out.print(Arrays.toString(sortedArray2));
        int descendingMerge[]=mergeBothInDescendingOrder(sortedArray1, sortedArray2);

        print(descendingMerge);
        //Write your code here
    }

    public static int[] getArrayInput(int size, Scanner s){
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            array[i]=s.nextInt();
        }
        return array;

    }

    public static void print(int array[]){
        for(int i=array.length-1;i>=0;i--){
            System.out.println(array[i]);
        }
    }
    public static int[] mergeBothInDescendingOrder(int left[], int right[]){

        int i=0,j=0, k =0;

        int array[]= new int[left.length+right.length];

        while (i < left.length && j < right.length) {
            array[k++] = left[i] < right[j] ? left[i++]: right[j++];
        }

        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }


        return array;
    }
}

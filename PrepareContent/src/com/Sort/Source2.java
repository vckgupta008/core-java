package com.Sort;
import java.util.Scanner;

public class Source2 {
    public static void insertionSort(int arr[], int n)
    {

        for (int i=1; i<n; ++i)
        {
            int j = i;

            while (j > 0 && arr[j-1] < arr[j])
            {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j = j-1;
            }
        }
        print(arr);
    }
    static void print(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i]);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[]= new int[size];
        for(int i=0;i<size;i++){
            array[i]= sc.nextInt();
        }
        insertionSort(array, size);
    }
}

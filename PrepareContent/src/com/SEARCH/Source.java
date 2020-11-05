package com.SEARCH;

import java.util.Scanner;
class Source{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //Declare the array here


        int count = input.nextInt();
        int array[] = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = input.nextInt();
        }
        int key = input.nextInt();
        input.close();
        int pos=0;
        for(int i =0;i<=count-1;i++){
            System.out.println(array[i]+ " "+ key);
            if(array[i]==key){
                pos=i;
                System.out.println(pos);
            }
        }
        if(pos>0){
            System.out.print(count-1-pos);
        }
        //write your code here

    }
}




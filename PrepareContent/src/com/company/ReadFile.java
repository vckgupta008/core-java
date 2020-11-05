package com.company;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile {
    public static void main(String args[]) throws FileNotFoundException {

        File inputfile = new File("/Users/vicky.gupta/Documents/UpGrad/PrepareContent/src/com/company/alice.txt"); // specify the path of your file -  Note that C:\\ is used instead of C:\ to specify path
        // Create a scanner
        Scanner scan = new Scanner(inputfile);
        // scan lines from the file
        int lineNo=1;

//        while(scan.hasNextLine()==true){
//            String Line =scan.nextLine();
//        System.out.println(Line+" "+lineNo);
//        lineNo++;
//
//        }
//        while(scan.hasNext()==true){
//            String word =scan.next(); // incase of words use scan.nextInt()
//            System.out.println(word+" "+lineNo);
//            lineNo++;
//
//        }

        File inputfile1 = new File("/Users/vicky.gupta/Documents/UpGrad/PrepareContent/src/com/company/number.txt"); // specify the path of your file -  Note that C:\\ is used instead of C:\ to specify path
        Scanner scan1 = new Scanner(inputfile1);
        int sum=0,counter=1;
        while(scan1.hasNext()){
            int num = scan1.nextInt();
            sum+=num;
            System.out.println(num+" "+ counter);
            counter++;
        }
    System.out.print(sum/counter);
    }
}

package com.hashset;

import java.util.*;
import java.util.Scanner;

public class CheckUnique {
    public static void main(String arg[]) {

        Scanner in = new Scanner(System.in);

        //storing the input string to String variable "str"
        String str = in.nextLine();
        //write your code here


        HashMap<Character, Integer> h = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (h.containsKey(ch) == false) {
                h.put(ch, 1);
            } else {
                h.put(ch, h.get(ch) + 1);
            }
        }
        boolean flag=false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (h.get(ch) == 1) {
                System.out.println(ch);
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println(-1);
        }
    }
}


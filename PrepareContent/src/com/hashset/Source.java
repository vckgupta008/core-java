package com.hashset;

import java.util.*;
public class Source{
    //Method to check if two strings are anagram of each other or not
    public static boolean check(String str1, String str2){
        char[] ch1 = str1.toLowerCase().toCharArray();
        char[] ch2 = str2.toLowerCase().toCharArray();
        //Write your code here
//        System.out.println(arrange(ch1).earrange(ch2));
        if(arrange(ch1).equals(arrange(ch2))) {
            return true;
        }
        else return false;

    }
    //Method to sort the character array
    public static String arrange(char[] ch){
        //Write your code here
        Arrays.sort(ch);
        return new String(ch);
    }

    public static void main(String[] x){
        Map<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.next();
            value = sc.next();
            map.put(key,value);
        }
       for(Map.Entry<String, String> word: map.entrySet()){
//           System.out.println(word.getKey()+":"+word.getValue());
           if(check(word.getKey(),word.getValue())){
               System.out.println(word.getKey()+":"+word.getValue());
           }
       }
        //Write your code here
    }
}


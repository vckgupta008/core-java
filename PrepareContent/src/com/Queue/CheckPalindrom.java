package com.Queue;
import java.util.*;

public class CheckPalindrom {
    public void checkPalindrome(String input) {
        Queue<Character> reverse = new LinkedList<>();

        for(int i=input.length()-1;i>=0;i--){
            reverse.add(input.charAt(i));
        }
        String reverseStr="";
        while(!reverse.isEmpty()){
            reverseStr+=reverse.remove();
        }
        if(input.equals(reverseStr)){
            System.out.print("The given input is a palindrome.");
        }
        else {
            System.out.print("The given input is not a palindrome.");
        }
        //Write your code here
    }
    public static void main(String[] args) {
        CheckPalindrom obj = new CheckPalindrom();
        Scanner in = new Scanner(System.in);
        String inputString = in .nextLine();
        obj.checkPalindrome(inputString);

    }
}

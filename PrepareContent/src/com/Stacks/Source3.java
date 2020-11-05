package com.Stacks;
import java.util.*;

public class Source3 {
    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        //write your code here
        char[] charArr = data.toCharArray();
        int size = charArr.length;

        for(int i = 0; i < size; ++i) {
            s.push(charArr[i]);
        }

        for(int i = 0; i < size; ++i) {
            charArr[i] = s.pop();
        }

       System.out.print(String.valueOf(charArr));


    }
}

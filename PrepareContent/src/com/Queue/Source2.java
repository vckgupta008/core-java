package com.Queue;
import java.util.*;

public class Source2 {
    public static String findDuplicateParenthesis(String inputString) {
        //write your code here
        Stack<Character> q = new Stack<Character>();
        int flag=0;
        for(int i=0;i<inputString.length();i++){
            if(inputString.charAt(i)==')'){
                System.out.println(q);
                while(q.peek()!='('){
                    q.pop();
                }
                if(!q.isEmpty()){
                    q.pop();
                }
                if(!q.isEmpty() && q.peek()=='(' && inputString.charAt(i+1)==')'){
                    flag=1;
                    break;
                }
            }
            else {
                q.push(inputString.charAt(i));
            }
        }
        if(flag==0){
            return ("Input string does not contains duplicate parenthesis");
        }
        else{
            return ("Input string contains duplicate parenthesis");
        }
    }


    public static void main(String[] args){
        Source2 obj = new Source2();
        String inputString = new String();
        Scanner in = new Scanner(System.in);
        inputString = in.nextLine();
        System.out.println(obj.findDuplicateParenthesis(inputString));

    }
}

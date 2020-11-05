package com.Stacks;

import java.util.*;

public class MERGE {

    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();
        Scanner in=new Scanner(System.in);
        String inputString=in.nextLine();
        for(int k=1;k<inputString.length()-1;k++) {
            stack.push(inputString.charAt(k+1));
            if(inputString.charAt(k+1)==')'&& !stack.isEmpty())
                stack.pop();
            if(inputString.charAt(k-1)=='(' && !stack.isEmpty())
                stack.pop();
        }
        while (!stack.isEmpty()){
            System.out.print(stack.peek());
            stack.pop();
        }
//        Stack<Character> new_stack=new Stack<>();
//        Scanner in=new Scanner(System.in);
//        String inputString=in.nextLine();
//        for(int k=0;k<inputString.length();k++) {
//            if (inputString.charAt(k) == ')') {
//                new_stack.push(inputString.charAt(k));
//            }
//            if (inputString.charAt(k) == '(') {
//                if (new_stack.isEmpty()) {
//                    break;  // this statement breaks the control and make it go out of loop
//                } else {
//                    new_stack.pop();
//                }
//            }
//        }
//        if(new_stack.isEmpty())
//            System.out.println("balanced");
//        else
//            System.out.println("unbalanced");

    }
}

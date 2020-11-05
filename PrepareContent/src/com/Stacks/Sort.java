package com.Stacks;
import java.util.*;

public class Sort {
    public static int sortstack(Stack<Integer>
                                                   input, int k)
    {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty())
        {
            // pop out the first element
            int tmp = input.pop();

            // while temporary stack is not empty and
            // top of stack is greater than temp
            while(!tmpStack.isEmpty() && tmpStack.peek()
                    > tmp)
            {
                // pop from temporary stack and
                // push it to the input stack
                input.push(tmpStack.pop());
            }

            // push temp in tempory of stack
            tmpStack.push(tmp);
        }
        int counter=1;
        System.out.print(tmpStack);
        while(counter<k){
            tmpStack.pop();
            counter++;
        }

        return tmpStack.peek();
    }

    // Driver Code
    public static void main(String args[])
    {
        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        // This is the temporary stack
        int tmpStack=sortstack(input, 5);
        System.out.println("Sorted numbers are:"+ tmpStack);

//        while (!tmpStack.empty())
//        {
//            System.out.print(tmpStack.pop()+" ");
//        }
    }
}

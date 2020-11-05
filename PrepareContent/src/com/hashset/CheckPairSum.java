package com.hashset;
import java.util.*;

public class CheckPairSum {
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        // number of the elements
        int n = in.nextInt();

        int array[] = new int[n];

        //storing the input integers to an array
        for(int i =0;i<n;i++){
            array[i] = in.nextInt();
        }

        // getting the target sum from input
        int targetSum = in.nextInt();

        //write your code here
        HashSet<Integer> num=new HashSet<Integer>();
        for(int i =0;i<n;i++){
            num.add(array[i]);
        }
        Iterator<Integer> itr=num.iterator();
        boolean flag=false;
        while(itr.hasNext()){
            int curr= itr.next();
            int diff = targetSum-curr;
            if(num.contains(diff)){
                flag=true;
                break;
            }
        }

        System.out.println(flag);
    }
}

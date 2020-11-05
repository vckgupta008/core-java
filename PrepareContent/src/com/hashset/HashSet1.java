package com.hashset;
import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // creating a HashSet named "hashSet"
        Set<Integer> hashSet = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            // fill the switch cases below
            switch (a) {
                case 1:

                    hashSet.add(b);

                    // Write your code to add the input value b to the hashSet

                    break;

                case 2:
                    if(hashSet.contains(b))  System.out.print(true);
                    else  System.out.print(false);
                    // If hashSet contains b, then print true. Otherwise, print false

                    break;

                case 3:
                    hashSet.remove(b);
                    // Write your code here to remove the element b from the hashSet

                    break;
            }
        }
    }
}

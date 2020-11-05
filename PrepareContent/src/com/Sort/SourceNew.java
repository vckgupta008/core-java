package com.Sort;
import java.util.Scanner;

class SourceNew {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n1 = s.nextInt();
        int[] array1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            array1[i] = s.nextInt();
        }

        int n2 = s.nextInt();
        int[] array2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            array2[i] = s.nextInt();
        }

        if(array2.length==0){
            System.out.print("Not Possible");
        }
        else{
            int wrongIndex = 0;
            for (int i = 1; i < array1.length; i++)
            {
                if (array1[i] < array1[i - 1])
                {
                    wrongIndex = i;
                }
            }
            int maximum = 0;
            int flag = 0;

            for (int i = 0; i < array2.length; i++)
            {
                if (array2[i] > maximum &&
                        array2[i] >= array1[wrongIndex - 1])
                {
                    if (wrongIndex + 1 <= array1.length-1 &&
                            array2[i] <= array1[wrongIndex + 1])
                    {
                        maximum = array2[i];
                        flag = 1;
                    }
                }
            }

            if (flag==1)
            {
                System.out.print(maximum);
            }
            else {
                System.out.print("Not Possible");
            }
        }

    }
}

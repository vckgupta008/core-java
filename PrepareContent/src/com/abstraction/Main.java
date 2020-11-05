package com.abstraction;

public class Main{
    public static float radius = 10.0f;
    public static void main(String[] a){
        System.out.println(area(radius));
        int i=-10;
        i=-i;
        System.out.print(i);
    }

    public static float area(float radius){
        return 3.141f * radius * radius;
    }
}

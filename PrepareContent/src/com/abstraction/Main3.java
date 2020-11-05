package com.abstraction;

public class Main3{
    public static float radius = 10.0f;
    public static float length = 20.0f;
    public static void main(String[] a){
        System.out.println("area of circle = " + Circle1.area(radius));
        System.out.println("area of square = " + Square.area(length));
    }
}

class Circle1{
    public static float area(float radius){
        return 3.141f * radius * radius;
    }
}

class Square{
    public static float area(float length){
        return length * length;
    }
}






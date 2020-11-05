package com.abstraction2;

public class Main{
    public static void main(String[] a){
        Circle c1 = new Circle(10f);
        System.out.println("area of circle = " + c1.area());

        Circle c2 = new Circle(20f);
        System.out.println("area of circle = " + c2.area());

        Circle c3 = new Circle(15f);
        System.out.println("area of circle = " + c3.area());
    }
}

class Circle{
    public float radius;

    public Circle(float radius) {// if r instead of radius then can use radius instead of this.radius
        this.radius = radius;
    }

    public float area(){
        return 3.141f * this.radius * this.radius;
    }
}

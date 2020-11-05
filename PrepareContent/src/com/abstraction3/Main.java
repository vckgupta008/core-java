package com.abstraction3;
public class Main {
    public static void main(String[] args) {

        TestClass c1 = new TestClass(2, 5.2);
        TestClass c2 = new TestClass(3, 7.5);
        System.out.println(c1.a + ", " + c1.b);
    }
}

class TestClass {

    public int a;
    public double b;

    public TestClass(int first, double second) {

        this.a = first;
        this.b = second;
    }
}
//public class Main{
//    public static void main(String[] a){
//        Circle c1 = new Circle(10f);
//        System.out.println("area of circle = " + c1.area());
//
//        Circle c2 = new Circle(20f);
//        System.out.println("area of circle = " + c2.area());
//        System.out.println("circumference of circle = " + c2.circumference());
//
//        Circle c3 = new Circle(15f);
////        c3.PI=2.1f;
//        System.out.println("area of circle = " + c3.area());
//        System.out.println("circumference of circle = " + c3.circumference());
//    }
//}
//
//class Circle{
//    public float radius;
//    public static final float PI = 3.1414f;
//
//    public Circle(){
//    }
//
//    public Circle(float radius) {
//        this.radius = radius;
//    }
//
//    public float area(){
//        return PI * this.radius * this.radius;
//    }
//
//    public float circumference(){
//        return 2 * PI * this.radius;
//    }
//}







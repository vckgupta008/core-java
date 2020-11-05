package com.test;

abstract class Parent {

    abstract int display(int i);

    int returnValue(int i) {
        return display(++i);
    }
}

class Child extends Parent {
    int display(int i) {
        return ++i;
    }
}

public class Source {
    public static void main(String[] args) {
        Child myObj = new Child();
        System.out.println(myObj.returnValue(1011));
//        HomeLoan obj = new Bank1();
//        obj.numbers();
//        Display obj = new Display();
//        obj.Display();
    }
}
//class Display {
//    public Display(int i) {
//        System.out.println("ONE");
//    }
//
//    public Display() {
//        this(1);
//
//        System.out.println("TWO");
//    }
//
//    void Display() {
//        Display(1);
//
//        System.out.println("THREE");
//    }
//
//    void Display(int i) {
//        System.out.println("FOUR");
//    }
//}


//abstract class HomeLoan {
//    public HomeLoan() {
//        System.out.println("House 1");
//    }
//
//    abstract void numbers();
//}
//
//class Bank1 extends HomeLoan {
//    public Bank1() {
//        System.out.println("Bank1");
//    }
//
//    void numbers() {
//        System.out.println("Rate of interest is 7.2");
//    }
//}

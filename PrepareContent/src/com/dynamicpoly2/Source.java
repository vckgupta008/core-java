package com.dynamicpoly2;


import java.util.*;

//class First {
//    static void display() {
//        System.out.println("ONE");
//    }
//}
//
//class Second extends First {
//    static void display() {
//        System.out.println("TWO");
//    }
//}
class Base {
    public void display() {
        System.out.println("This is the display function of the base class.");
    }
}

interface BaseInterface {
    default public void display() {
        System.out.println("This is the display function of the interface class.");
    }
}

public class Source extends Base implements BaseInterface{
    public static void main(String[] args) {
//        First obj = new Second();
//
//        obj.display();// should call display of second but since it is static so no override hence first
//        //is called
        Source obj = new Source();
        obj.display(); // preference will be given to the class and not interface
    }
}



package com.dynamicPoly1;

class First {
    int d=1;

    public void display() {
        System.out.println("ONE");
    }
}

class Second extends First {
    int d=2;
    public void display() {
        System.out.println("TWO");
    }
}



public class Spource {
    public static void main(String[] args) {
        Second obj = new Second();
        System.out.print(obj.d);
        obj.display();
    }
}

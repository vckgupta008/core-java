package com.polymorphism;

public class Area {
    public static void main(String[] a) {

    Rectangle s = new Square(2.5);
//    System.out.print(s.area());
        s.area();
    }
}


class Rectangle {
    private double width;
    private double height;
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void area() {
        System.out.println("Area of Rectangle is: " +  width * height) ;
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle is: " + ( (2* width) +
                (2* height) )) ;
    }
}

class Square extends Rectangle {
//    private double side;
//    final double side;
    Square(double side){
        super(side, side);
    }

    public void area() {
        System.out.println("Area of Rectangle is: " +   super.getHeight()* super.getWidth() ) ;
    }

    public void perimeter() {
        System.out.println("Perimeter of Rectangle is: "+ (2* (super.getHeight()+ super.getWidth()))) ;
    }
}
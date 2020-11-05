package com.abstraction;

public class CalulateArea {
    public static void main(String []args){
        Square1 s1=new Square1();
        s1.len=2;
        System.out.println("the area for length "+s1.len+" is "+s1.area());

        Square1 s2=new Square1();
        s2.len=3;
        System.out.println("the area for length "+s2.len+" is "+s2.area());
    }
}

class Square1{
    public float len;
    public float area(){
        return len*len;
    }
}
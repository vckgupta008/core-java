package com.dynamicPoly1;

public class Demo
{
    public static class superclass
    {
       static void print()
        {
            System.out.println("superclass.");
        }
    }

    public static class subclass extends superclass
    {

        static void print()
        {
            System.out.println("subclass.");
        }
    }

    public static void main(String[] args)
    {
        superclass A = new superclass();
        superclass B = new subclass();
        A.print();// since static cant be override therefore its superclass and superclass
        B.print();// if not static then superclass subclass
    }
}

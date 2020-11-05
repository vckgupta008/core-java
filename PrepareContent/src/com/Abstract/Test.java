package com.Abstract;

abstract class demo
{
    public int a;
    demo()
    {
        a = 10;
    }

    abstract public void set(int a);

//    abstract final public void get(); // final cant be override

}

class Test extends demo
{

    public void set(int a)
    {
        this.a = a;
    }

    final public void get()
    {
        System.out.println("a = " + a);
    }

    public static void main(String[] args)
    {
        System.out.println(1/2);
        Test obj = new Test();
        obj.set(2);
        obj.get();
    }
}

package com.test;

public class Test {
    public static void main(String[] args) {
//        Ball.spinAndBounce();
//        Ball b = new Ball();
//        b.spinAndBounce();
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

//class Ball {
//    public String state;
//
//
//    public  void bounce() {
//        state = "bouncing";
//        System.out.println("Ball is bouncing");
//    }
//
//    public  void spin() {
//        state = "spinning";
//        System.out.println("Ball is spinning");
//    }
//
//    public  void spinAndBounce() {
//        spin();
//        bounce();
//    }
//}

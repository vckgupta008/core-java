//package com.inheritance;
//
//public class IandP2 {
//    public static void main(String[] a) {
//        Student s1 = new Student("Sujit", 2);
//        System.out.println(s1.getDetails());
//        ResearchStudent s2 = new ResearchStudent("siddharth", 3, "Software Engineering");
//        System.out.println(s2.getDetails()+" "+s2.getResearchArea());
//    }
//}
//
//class Student {
//    protected final String name;
//    private int year;
//    private static final int annualFees = 10000;
//
//    public Student(String name, int year) {
//        this.name       = name;
//        this.year       = year;
//    }
//
//    public String getDetails() {
//        return "Name : "        + name           + '\n' +
//                "Fees : "        + computeFees() ;
//    }
//
//    public int computeFees () {
//
//        return Student.annualFees * year;
//    }
//}
//
//class   ResearchStudent extends Student {
//    private String researchArea;
//    public ResearchStudent(String name, int year, String researchArea) {
//        super(name, year);
//        this.researchArea = researchArea;
//    }
//    public String getResearchArea(){
//        return this.researchArea +" " +this.name;// name is protected in student class hence can be accessible by subclass
//        //researchStudent this.year wont work
//    }
//}

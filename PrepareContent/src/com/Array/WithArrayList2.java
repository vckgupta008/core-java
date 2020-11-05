package com.Array;

import java.util.*;

public class WithArrayList2 {

    public static void main (String[] args) {
        ArrayList<Student> studentList = new ArrayList<Student>(); // type safety

        studentList.add(new Student("Sujit", 1));
        studentList.add(new Student("Siddharth", 2));
        studentList.add( new Student("Karanpreet", 3));
        studentList.add(new Student("Hari", 4));
        studentList.add( new Student("Tricha", 5));
//        studentList.remove(3);
        System.out.print(studentList.get(2).getDetails());
        printStudentList(studentList);
        backward(studentList);
        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        Collections.reverse(random);// reverse the collection
        System.out.println(random.contains(5f));
    }

    public static void printStudentList(ArrayList<Student> students) {
        for(Student o : students) {
//            Student s = (Student) o;
            System.out.println(o.getDetails());
        }

        ListIterator<Student> it = students.listIterator();//ListIterator<Student> it = students.listIterator(2);// 2 is the position it starts when next()
        while(it.hasNext()){
            System.out.println(it.next().getDetails());
        }
    }
    public static void backward(ArrayList<Student> students){
        ListIterator<Student> it = students.listIterator(students.size());
        while(it.hasPrevious()){
            System.out.println(it.previous().getDetails());
        }
    }
}

class Student {
    private final String name;
    private final int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getDetails() {
        return
                "name = " + this.name + '\n' +
                        "roll number = " + this.rollNumber + '\n';
    }
}




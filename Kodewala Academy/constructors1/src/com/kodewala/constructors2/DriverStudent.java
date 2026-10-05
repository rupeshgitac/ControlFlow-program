package com.kodewala.constructors2;
// Practice
class Student {

    static String collegeName = "IISc Bengaluru";

    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        super();
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

public class DriverStudent {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Rahul", 85);
        Student s2 = new Student(102, "Amit", 90);

        System.out.println(s1.name + ", " + s1.rollNo + ", " + s1.marks + ", " + s1.collegeName);
        System.out.println(s2.name + ", " + s2.rollNo + ", " + s2.marks + ", " + s2.collegeName);
    }
}

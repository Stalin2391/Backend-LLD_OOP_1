package com.stalin.introduction;

public class Student {
    String name;
    int rno;
    float marks;

    Student(String name, int rno, float marks) {
        this.name = name;
        this.rno = rno;
        this.marks = marks;
    }
    // Copy constructor
    Student(Student otherStudent){
        this.name = otherStudent.name;
        this.rno = otherStudent.rno;
        this.marks = otherStudent.marks;
    }
}

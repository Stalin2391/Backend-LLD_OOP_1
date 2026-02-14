package com.stalin.introduction;

public class Client {
    public static void main(String[] args) {
        // new(keyword) - Dynamically(when your program is running) allocate memory
        // and returns a reference to it.
        // ex: [ compile time ----> Student student ] = [ new Student() ---> runtime ];

//        Student student = new Student(); 
//        This will throw an error because
//        the Student constructor requires three arguments.
//
//        student.name = "Stalin";  -->  this is bad practice
//        student.rno = 44;
//        student.marks = 96.5f;

        Student student = new Student("Stalin", 44, 97.4f);

        Student student1 = new Student("Deepthi", 45, 90.3f);

        Student student2 = new Student(student1);

        System.out.println(student.name);
        System.out.println(student.rno);
        System.out.println(student.marks);
    }
}

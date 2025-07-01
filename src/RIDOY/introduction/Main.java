package RIDOY.introduction;

import java.lang.ref.Cleaner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Creating student object
        Student[] students = new Student[5];
        Student prite = new Student(3, "Prite", 95.0f);
        System.out.println(prite.marks);

        final Student ridoy = new Student(prite);
        ridoy.name = "Ridoy";
        System.out.println(ridoy.marks);
        System.out.println(ridoy.name);

    }
}

// create a class
class Student{
    int rno;
    String name;
    float marks;
    Student(){

    }

    Student(Student other){
        this.rno = other.rno;
        this.name  = other.name;
        this.marks = other.marks;
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
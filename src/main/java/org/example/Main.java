package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // builds with no args
        Student emptyStudent = Student.builder().build();
        Teacher emptyTeacher = Teacher.builder().build();
        Course emptyCourse = Course.builder().build();

        // builds with all args
        Student fullStudent = Student.builder()
                .name("Hakan")
                .address("Beispielstreet 123")
                .grade("B")
                .id("3")
                .build();

        Teacher fullTeacher = Teacher.builder()
                .id("2")
                .name("Mrs James")
                .subject("Astronomy")
                .build();

        Course fullCourse = Course.builder()
                .teacher(fullTeacher)
                .id("1")
                .name("Astronomy 101")
                .students(Map.of(fullStudent.getId(), fullStudent))
                .build();


        // prints object with empty fields,
        // object with all fields filled,
        // and that object's name
        System.out.println(emptyStudent);
        System.out.println(fullStudent);
        System.out.println(fullStudent.getName());

        System.out.println(emptyTeacher);
        System.out.println(fullTeacher);
        System.out.println(fullTeacher.name());

        System.out.println(emptyCourse);
        System.out.println(fullCourse.getName());

        // changes teacher's name via wither, and prints new name
        fullTeacher = fullTeacher.withName("Mrs New Name");
        System.out.println(fullTeacher.name());

    }
}
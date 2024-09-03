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
                .grade(2)
                .id("3")
                .build();

        Student fullStudent2 = Student.builder()
                .name("Thea")
                .address("Beispielstreet 456")
                .grade(3)
                .id("4")
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
                .studentList(List.of(fullStudent, fullStudent2))
                .build();

        // creates a new university and university service
        University uni = University.builder()
                .courseList(List.of(fullCourse))
                .build();
        UniversityService uniService = UniversityService.builder()
                .university(uni)
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

        // bonus: calculates grade total for course
        System.out.println(uniService.calculateAverageCourseGrade(fullCourse));

        // bonus: calculates grade total for uni (it's the same since we just have the one course)
        System.out.println(uniService.calculateAverageUniGrade());

        // bonus: prints out list of students with grade 2 or better (it's just the one)
        System.out.println(uniService.getAllStudentsWithBOrBetter());
    }
}
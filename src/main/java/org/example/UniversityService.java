package org.example;

import lombok.*;

@Data
@Builder
public class UniversityService {
    private University university;

    // bonus:
    public double calculateAverageCourseGrade(Course course){
        // creates a stream from the student list
        double sum = course.getStudentList().stream()
                // changes each student to their grade (as int)
                .mapToInt(Student::getGrade)
                // sums up each of those ints
                .sum();
        // divides sum of grades by number of students to get average
        return sum / course.getStudentList().size();
    }

    // bonus:
    public double calculateAverageUniGrade(){
        // creates a stream from the course list
        double sum =  this.university.courseList().stream()
                // changes each course to its average grade
                .map(this::calculateAverageCourseGrade)
                // sums up each grade
                .reduce(0D, Double::sum);
        // divides sum of grades by number of courses to get average
        return sum / this.university.courseList().size();
    }

}

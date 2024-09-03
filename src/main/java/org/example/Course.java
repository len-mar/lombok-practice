package org.example;

import lombok.*;
import java.util.*;

@Value
@Builder
@AllArgsConstructor
@Data
public class Course {
    // all fields private and final via @Value
    String id, name;
    Teacher teacher;
    List<Student> studentList;
}

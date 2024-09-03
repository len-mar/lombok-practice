package org.example;

import lombok.*;
import java.util.Map;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Course {
    private String id, name;
    private Teacher teacher;
    private Map<String, Student> students;
}

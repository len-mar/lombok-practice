package org.example;

import lombok.*;
import java.util.Map;

@Value
@Builder
@AllArgsConstructor
@Data
public class Course {
    // all fields private and final via @Value
    String id, name;
    Teacher teacher;
    Map<String, Student> studentMap;
}

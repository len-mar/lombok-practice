package org.example;
import lombok.*;

import java.util.*;

@Builder
@With
public record University(String id, String name, List<Course> courseList) {
}

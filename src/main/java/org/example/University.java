package org.example;
import lombok.*;

import java.util.*;

@With
public record University(String id, String name, List<Course> courseList) {
}

package org.example;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {
    private String id, name, address, grade;
}

package org.example;

import lombok.*;

@Builder
@With
public record Teacher(String id, String name, String subject) {
}

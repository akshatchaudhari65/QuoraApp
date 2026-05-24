package com.example.QuoraApp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnswerResopnseDTO {
    private String id;

    private String content;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}

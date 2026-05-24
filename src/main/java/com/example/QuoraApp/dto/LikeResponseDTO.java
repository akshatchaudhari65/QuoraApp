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
public class LikeResponseDTO {

    private String id;

    private String targetId;

    private String targetType;

    private boolean isType;

    private LocalDateTime createdAt;
}

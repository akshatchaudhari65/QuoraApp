package com.example.QuoraApp.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LikeRequestDTO {

    @NotBlank(message = "Target ID is required")
    private String targetId;

    @NotBlank(message = "Target type is required")
    private String targetType;

    @NotBlank(message = "Like status is required")
    private boolean isLike;
}

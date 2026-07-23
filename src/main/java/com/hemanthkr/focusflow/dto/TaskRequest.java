package com.hemanthkr.focusflow.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Getter
@Setter
public class TaskRequest {

    @NotBlank(message = "Title cannot be blank")
    private String title;

    @NotNull(message = "Task date is required")
    private LocalDate taskDate;

    @Min(value = 1, message = "Weight must be at least 1")
    @Max(value = 100, message = "Weight cannot exceed 100")
    private int weight;
}

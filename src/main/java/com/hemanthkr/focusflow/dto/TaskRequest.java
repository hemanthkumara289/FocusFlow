package com.hemanthkr.focusflow.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TaskRequest {

    private String title;

    private LocalDate taskDate;

    private int weight;

    //Getters and Setters
}

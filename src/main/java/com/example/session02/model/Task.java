package com.example.session02.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    private Long id;
    private String title;
    private String description;
    private String priority;
    private Long assignedTo; // id của User được giao (khóa ngoại)
}
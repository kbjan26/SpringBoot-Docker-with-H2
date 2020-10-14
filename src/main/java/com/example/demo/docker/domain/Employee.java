package com.example.demo.docker.domain;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private String firstName;
    private String lastName;
}

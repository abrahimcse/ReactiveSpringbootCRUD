package com.task.ReactiveSpringbootCRUD.entities;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "employees")
public class Employee {

    @Id
    private int id;
    private String name;
    private String designation;
    private int salary;
}

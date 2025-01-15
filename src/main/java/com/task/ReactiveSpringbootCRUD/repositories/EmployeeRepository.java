package com.task.ReactiveSpringbootCRUD.repositories;

import com.task.ReactiveSpringbootCRUD.entities.Employee;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Integer> {
}

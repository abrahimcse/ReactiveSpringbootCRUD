package com.task.ReactiveSpringbootCRUD.services;

import com.task.ReactiveSpringbootCRUD.employeesDTO.EmployeeDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

    public Mono<EmployeeDTO> create(EmployeeDTO employeeDTO);

    public Flux<EmployeeDTO> getAll();

    public Mono<EmployeeDTO> get(int id);

    public Mono<EmployeeDTO> update(EmployeeDTO employeeDTO, int id);

    public Mono<Void> delete(int id);


}

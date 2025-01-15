package com.task.ReactiveSpringbootCRUD.services.impl;

import com.task.ReactiveSpringbootCRUD.employeesDTO.EmployeeDTO;
import com.task.ReactiveSpringbootCRUD.entities.Employee;
import com.task.ReactiveSpringbootCRUD.repositories.EmployeeRepository;
import com.task.ReactiveSpringbootCRUD.services.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    @Override
    public Mono<EmployeeDTO> create(EmployeeDTO employeeDTO) {
        Employee employee = modelMapper.map(employeeDTO, Employee.class);
        return employeeRepository.save(employee).map(emp -> modelMapper.map(emp, EmployeeDTO.class));
    }

    @Override
    public Flux<EmployeeDTO> getAll() {
        return employeeRepository.findAll()
                .map(employee -> modelMapper.map(employee, EmployeeDTO.class));
    }

    @Override
    public Mono<EmployeeDTO> get(int id) {
        return employeeRepository.findById(id)
                .map(employee -> modelMapper.map(employee, EmployeeDTO.class));
    }

    @Override
    public Mono<EmployeeDTO> update(EmployeeDTO employeeDTO, int id) {
        return employeeRepository.findById(id)
                .flatMap(existing -> {
                    existing.setName(employeeDTO.getName());
                    existing.setDesignation(employeeDTO.getDesignation());
                    existing.setSalary(employeeDTO.getSalary());
                    return employeeRepository.save(existing);
                })
                .map(updated -> modelMapper.map(updated, EmployeeDTO.class));
    }

    @Override
    public Mono<Void> delete(int id) {
        return employeeRepository.deleteById(id);
    }


}

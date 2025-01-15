package com.task.ReactiveSpringbootCRUD.controller;

import com.task.ReactiveSpringbootCRUD.employeesDTO.EmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.task.ReactiveSpringbootCRUD.services.EmployeeService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @PostMapping
    public Mono<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.create(employeeDTO);
    }

    @GetMapping
    public Flux<EmployeeDTO> getAllEmployee() {
        return employeeService.getAll();
    }

    @GetMapping("/{id}")
    public Mono<EmployeeDTO> getEmployeeById(@PathVariable int id) {
        return employeeService.get(id);
    }

    @PutMapping("/{id}")
    public Mono<EmployeeDTO> updateEmployee(@PathVariable int id, @RequestBody EmployeeDTO employeeDTO) {
        return employeeService.update(employeeDTO, id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteEmployee(@PathVariable int id) {
        return employeeService.delete(id);
    }

}

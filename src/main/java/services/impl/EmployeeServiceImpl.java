package services.impl;

import employeesDTO.EmployeeDTO;
import entities.Employee;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import repositories.EmployeeRepository;
import services.EmployeeService;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    @Override
    public Mono<EmployeeDTO> create(EmployeeDTO employeeDTO) {
        Employee employee=modelMapper.map(employeeDTO, Employee.class);
        return employeeRepository.save(employee)
                .map(saved -> modelMapper.map(saved, EmployeeDTO.class));
    }

    @Override
    public Flux<EmployeeDTO> getAll() {
        return employeeRepository.findAll()
                .map(employee -> modelMapper.map(employee,EmployeeDTO.class));
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
                .map(updated -> modelMapper.map(updated,EmployeeDTO.class));
    }

    @Override
    public Mono<Void> delete(int id) {
        return employeeRepository.deleteById(id);
    }


}

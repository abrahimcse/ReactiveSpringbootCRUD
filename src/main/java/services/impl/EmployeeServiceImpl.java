package services.impl;

import employeesDTO.EmployeeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import repositories.EmployeeRepository;
import services.EmployeeService;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {


    private final EmployeeRepository employeeRepository;

    @Override
    public Mono<EmployeeDTO> create(EmployeeDTO employeeDTO) {
        return null;
    }

    @Override
    public Flux<EmployeeDTO> getAll() {
        return null;
    }

    @Override
    public Mono<EmployeeDTO> get(int id) {
        return null;
    }

    @Override
    public Mono<EmployeeDTO> update(EmployeeDTO employeeDTO, int id) {
        return null;
    }

    @Override
    public Mono<EmployeeDTO> delete(int id) {
        return null;
    }

    @Override
    public Flux<EmployeeDTO> search(String query) {
        return null;
    }
}

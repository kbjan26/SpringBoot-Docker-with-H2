package com.example.demo.docker.service;

import com.example.demo.docker.domain.Employee;
import com.example.demo.docker.mapper.EmployeeMapper;
import com.example.demo.docker.persistence.EmployeeEntity;
import com.example.demo.docker.persistence.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll().stream()
                .map(employeeMapper::entity2Model)
                .collect(Collectors.toList());
    }


    public Employee addEmployee(Employee employee) {
        EmployeeEntity employeeEntity = employeeRepository.save(employeeMapper.model2Entity(employee));
        return employeeMapper.entity2Model(employeeRepository
                .findById(employeeEntity.getId()).get());
    }

}

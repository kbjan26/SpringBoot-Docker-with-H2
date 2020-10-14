package com.example.demo.docker.web;

import com.example.demo.docker.domain.Employee;
import com.example.demo.docker.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
}

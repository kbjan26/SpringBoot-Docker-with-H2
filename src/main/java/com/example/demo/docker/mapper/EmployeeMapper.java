package com.example.demo.docker.mapper;

import com.example.demo.docker.domain.Employee;
import com.example.demo.docker.persistence.EmployeeEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    Employee entity2Model(EmployeeEntity employeeEntity);

    EmployeeEntity model2Entity(Employee employee);
}

package com.springboot.app.service;

import com.springboot.app.model.Employee;

import java.util.List;


public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long id);
    Employee updateEmployee(Employee employee, long id);

}

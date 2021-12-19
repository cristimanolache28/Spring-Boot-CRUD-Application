package com.springboot.app.service.impl;

import com.springboot.app.exception.ResourceNotFoundException;
import com.springboot.app.model.Employee;
import com.springboot.app.repository.EmployeeRepository;
import com.springboot.app.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // Build Delete Employee REST API
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Build Get All Employees REST API
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Build Get Employee By Id REST API
    @Override
    public Employee getEmployeeById(long id) {
//        Optional<Employee> employee = employeeRepository.findById(id);
//        if (employee.isPresent()) {
//            return employee.get();
//        } else {
//            throw new ResourceNotFoundException("Employee", "Id", id);
//        }
        return employeeRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("Employee", "Id", id));
    }

    // Build Update Employee REST API
    @Override
    public Employee updateEmployee(Employee employee, long id) {
        // we need to check whether employee with given id is exist in Db or not
        Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Employee", "Id", id));

        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());

        // save existing employee to DB
        employeeRepository.save(existingEmployee);
        return existingEmployee;

    }

    // build Delete Employee REST API
    @Override
    public void deleteEmployee(long id) {
        // check whether a employee exist in a DB or not
        Employee deleteEmployee = employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Employee", "Id", id));
        // delete employee from DB
        employeeRepository.delete(deleteEmployee);
//        employeeRepository.deleteById(id);
    }
}

package com.zaurtregulov.spring.mvc_hibernate_aop.service;

import java.util.List;

import com.zaurtregulov.spring.mvc_hibernate_aop.entity.Employee;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}

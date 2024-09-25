package com.mrshohan.springboot.crud_employee.service;

import com.mrshohan.springboot.crud_employee.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);

}

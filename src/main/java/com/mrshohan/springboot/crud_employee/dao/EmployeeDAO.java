package com.mrshohan.springboot.crud_employee.dao;

import com.mrshohan.springboot.crud_employee.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}

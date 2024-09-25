package com.mrshohan.springboot.crud_employee.rest;

import com.mrshohan.springboot.crud_employee.dao.EmployeeDAO;
import com.mrshohan.springboot.crud_employee.entity.Employee;
import com.mrshohan.springboot.crud_employee.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

}

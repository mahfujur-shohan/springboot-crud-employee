package com.mrshohan.springboot.crud_employee.service;

import com.mrshohan.springboot.crud_employee.entity.Employee;
import com.mrshohan.springboot.crud_employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }


    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);

        Employee employeeToReturn = null;

        if (employee.isPresent()) {
            employeeToReturn = employee.get();
        }
        else {
            throw new RuntimeException("Did not find employee with id: " + id);
        }

        return employeeToReturn;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }
}

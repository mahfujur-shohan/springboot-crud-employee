package com.mrshohan.springboot.crud_employee.repository;

import com.mrshohan.springboot.crud_employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // no code required

}

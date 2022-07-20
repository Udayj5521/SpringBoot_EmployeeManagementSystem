package com.Employee.employeeapp;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositry extends JpaRepository<Employee, Integer> {

}

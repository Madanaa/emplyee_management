package com.database.emp.service;

import com.database.emp.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
}

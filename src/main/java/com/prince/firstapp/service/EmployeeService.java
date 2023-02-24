package com.prince.firstapp.service;

import com.prince.firstapp.entities.Employee;

public interface EmployeeService {
	
	Employee getEmployee(Long employeeId);
	Employee saveEmployee(Employee employee);
	
}

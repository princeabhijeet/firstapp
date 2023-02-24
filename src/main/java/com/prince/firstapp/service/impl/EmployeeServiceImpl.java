package com.prince.firstapp.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prince.firstapp.entities.Employee;
import com.prince.firstapp.repository.EmployeeRepository;
import com.prince.firstapp.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee getEmployee(Long employeeId) {
		log.info("Fetching employee details for EmployeeId {}", employeeId);
		Optional<Employee> employee = employeeRepository.findById(employeeId);
		return employee.isPresent() ? employee.get() : null;
		
	}

}

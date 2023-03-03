package com.prince.firstapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prince.firstapp.entities.Employee;
import com.prince.firstapp.service.EmployeeService;

@RestController("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee/{employeeId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("employeeId") Long employeeId) {
		Employee employee = employeeService.getEmployee(employeeId);
		return employee!=null ? ResponseEntity.ok(employee) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Employee savedEmployee = employeeService.saveEmployee(employee);
		return ResponseEntity.ok(savedEmployee);
	}
	
	
	
}

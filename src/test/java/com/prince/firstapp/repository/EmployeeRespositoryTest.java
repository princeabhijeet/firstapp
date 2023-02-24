package com.prince.firstapp.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.prince.firstapp.entities.Employee;

@DataJpaTest
public class EmployeeRespositoryTest {

	@Autowired
	private EmployeeRepository employeeRepositry;
	
	@Test
	public void givenEmployee_whenSave_thenReturnSavedEmployee() {
		//given
		Employee employee = Employee.builder()
				.employeeId(500).firstName("TestFirstName").lastName("TestLastName").email("testemail.gmail.com").build();
		//when
		Employee savedEmployee = employeeRepositry.save(employee);
		
		//then
		assertThat(savedEmployee).isNotNull();
	}
	
}

package com.codeclan.example.employeeservice;

import com.codeclan.example.employeeservice.models.Employee;
import com.codeclan.example.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee(){
		employeeRepository.deleteAll();
		Employee jazzy = new Employee("Jazz", 25, "548JZS", "jazz@email.com");
		Employee sandy = new Employee("San", 30, "856yhu", "San@email.com");
		employeeRepository.save(jazzy);
		employeeRepository.save(sandy);
	}

}

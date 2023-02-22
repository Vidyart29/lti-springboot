package com.lti.demo.service;

import java.util.ArrayList;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.lti.demo.model.Employee;

@Service
public class EmployeeService {
	
	private final Logger LOG = LoggerFactory.getLogger(this.getClass());

	public List<Employee> getAllEmployees() {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(101, "Sonu", 90000));
		empList.add(new Employee(102, "Monu", 99000));
		empList.add(new Employee(103, "Tonu", 95000));
		empList.add(new Employee(104, "Ponu", 98000));
		empList.forEach(e -> System.out.println(e.toString()));
		return empList;
	}

	public Employee getEmployeeById(int employeeId) {
		Employee emp = new Employee(employeeId, "Sonu", 90000);
		System.out.println(emp.toString());
		return emp;
	}

	public Employee addEmployee(Employee employee) {
		System.out.println(employee.toString());
		return employee;
	}

//	getEmployeesByFirstName(String firstName);
//
//
//	updateEmployee(Employee employee);
//
//	deleteEmployee(int employeeId);	

}
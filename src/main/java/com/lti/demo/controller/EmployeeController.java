package com.lti.demo.controller;

import java.net.http.HttpHeaders;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.demo.model.Employee;
import com.lti.demo.service.EmployeeService;

@RestController
public class EmployeeController {

//	EmployeeService empService = new EmployeeService(); // not required 

	@Autowired
	EmployeeService empService;

	
//@GetMapping("/get-all-emps")
//	@RequestMapping("get-all-emps")
	
	@RequestMapping(value = "/get-all-emps", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> empList = empService.getAllEmployees();
		HttpStatus status = HttpStatus.OK;
		HttpHeaders headers = new HttpHeaders();
		headers.add("Message", "Employee were found successfully!");
		ResponseEntity<List<Employee>> response = new ResponseEntity<>(empList, headers, status);
		return response;
	}
	
	
	@RequestMapping(value = "/get-emp-by-id/{eid}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Employee> getEmpById(@PathVariable(name = "eid") int employeeId) {
		Employee emp = empService.getEmployeeById(employeeId);
		HttpStatus status = HttpStatus.OK;
		HttpHeaders headers = new HttpHeaders();
		headers.add("Message", "Employee found successfully!");
		ResponseEntity<Employee> response = new ResponseEntity<>(emp, headers, status);
		return response;
	}

//	http://localhost:8080/get-emp-by-id/101
//	@RequestMapping("/get-emp-by-id/{eid}")
//	public Employee getEmpById(@PathVariable(name = "eid") int empId) {
//		return empService.getEmployeeById(empId);
//	}
//	@RequestMapping(value="/add-emp", method=RequestMethod.POST, produces="application/json", consumes="application/json")
//	@RequestMapping("/add-emp")
//	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee ) {
//spring boot shld generate proper http status code in order to know dev it worked.
//		HttpStatus status= HttpStatus.OK;
		
//		generic response
//		ResponseEntity<Employee> response= new ResponseEntity<>(emp, headers, status);
				
//		return empService.addEmployee(employee);
//		return response;
	}


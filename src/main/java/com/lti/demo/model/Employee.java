package com.lti.demo.model;

public class Employee {
	
	private int empId;
	private String fname;
	private double salary;

	public Employee() {
		super();
	}
	

	public Employee(int employeeId, String firstName, double salary) {
		super();
		this.empId = employeeId;
		this.fname = firstName;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return empId;
	}

	public void setEmployeeId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return fname;
	}

	public void setFirstName(String firstName) {
		this.fname = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + empId + ", firstName=" + fname + ", salary=" + salary + "]";
	}
}

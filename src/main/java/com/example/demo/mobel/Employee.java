package com.example.demo.mobel;

import javax.swing.Spring;

public class Employee {
	
	private Integer employeeId;
	private String firstname;
	private String lastname;
	private Integer salary;
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Employee(Integer employeeId, String firstname, String lastname, Integer salary) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}

	

}

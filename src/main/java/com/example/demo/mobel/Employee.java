package com.example.demo.mobel;

import javax.swing.Spring;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="employee")

public class Employee {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
		
	private Integer id;
	public Employee() {
	super();
}
	private Integer employeeId;
	private String firstname;
	private String lastname;
	private Integer salary;
	@ManyToOne
	@JoinColumn(name = "role_id")
		private Role role;

	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String string) {
		this.firstname = string;
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
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Employee(Integer employeeId, String firstname, String lastname, Integer salary) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}
	public static boolean isPresent() {
		// TODO Auto-generated method stub
		return false;
	}

	

}

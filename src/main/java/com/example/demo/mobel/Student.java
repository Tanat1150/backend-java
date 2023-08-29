package com.example.demo.mobel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="employee")

public class Student {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
		
	private Integer id;
	public Student() {
	super();
}

	private Integer studentId;
	private String firstname;
	private String lastname;
	private String email;
	@ManyToOne
	@JoinColumn(name = "role_id")
		private Role role;
	
	
	
	
	
	public Integer getId() {
		return id;
	}





	public void setId(Integer id) {
		this.id = id;
	}





	public Integer getStudentId() {
		return studentId;
	}





	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
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





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public Role getRole() {
		return role;
	}





	public void setRole(Role role) {
		this.role = role;
	}





	public Student( Integer studentId, String firstname, String lastname, String email) {
		super();
		this.studentId = studentId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		
	}
	
}

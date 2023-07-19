package com.example.demo.Employeecontroller;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.type.filter.AbstractClassTestingTypeFilter;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mobel.Employee;

@RestController

public class Employeecontroller {
	
	private List<Employee> data= new ArrayList<Employee>();
	
	@GetMapping("/employee")
	public List<Employee> getEmployees() {
		return data;
	}
	
@PostMapping("/employee")

public Employee addEmployee(@RequestBody Employee body) {
	
	for (int i=0; i < data.size(); i++) {
		if(body.getEmployeeId() == data.get(i).getEmployeeId()) {
			return null;
			
		}
			
		
	}
   data.add(body);
   return body;	
 }
 @GetMapping("/employee/{EmployeeId}")
 public Employee gatEmployeeDetail(@PathVariable Integer EmployeeId ) {
	
	 for (int i=0; i < data.size(); i++) {
			if( EmployeeId == data.get(i).getEmployeeId()) {
				return data.get(i);
			}
	 }	
	 return null;
 }
 @PutMapping("/employee/{EmployeeId}")
 public Employee updatEmployee(@PathVariable Integer EmployeeId,@RequestBody Employee body ) {
	 for (int i=0; i < data.size(); i++) {
			if( EmployeeId == data.get(i).getEmployeeId()) {
				data.get(i).setFirstname(body.getFirstname());
				data.get(i).setLastname(body.getLastname());
				data.get(i).setSalary(body.getSalary());
				return data.get(i);
				
				
			
			}
	 }	
	 return null;
 }
 
 @DeleteMapping("/employee/{EmployeeId}")
 public String deletEmployee (@PathVariable Integer EmployeeId ) {
	 for (int i=0; i < data.size(); i++) {
			if( EmployeeId == data.get(i).getEmployeeId()) {
			   data.remove(i);
			   
				return"delete sucess";
			}
          
	 }
	 return "employee not font";
 }
}
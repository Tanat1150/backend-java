package com.example.demo.Employeecontroller;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.type.filter.AbstractClassTestingTypeFilter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mobel.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
public class Employeecontroller {
	@Autowired
	EmployeeRepository employeeRepository;
	
	private List<Employee> data= new ArrayList<Employee>();
	
	@GetMapping("/employee")
	public ResponseEntity<Object> getEmployee() {
		
		try {
			
			List<Employee> employees =employeeRepository.findAll();
			
		return new ResponseEntity<>(employees,HttpStatus.OK);
	}catch (Exception e) {
		System.out.println("ERROR");
		return new ResponseEntity<>("Internal servser error",HttpStatus.OK);
	}
}
@PostMapping("/employee")

public ResponseEntity<Object> addEmployee(@RequestBody Employee body) {
	try {
		
		Employee employee = employeeRepository.save(body);
		
		
		return new ResponseEntity<>(employee,HttpStatus.CREATED);
	} catch (Exception e) {
		return new ResponseEntity<>("Internal servser error",HttpStatus.INTERNAL_SERVER_ERROR);
	}	
 }
 @GetMapping("/employee/{EmployeeId}")
 public ResponseEntity<Object> gatEmployeeDetail(@PathVariable Integer EmployeeId ) {
	 try {
		 
		 Optional<Employee> employee = employeeRepository.findById(EmployeeId);
		 if (employee.isPresent()) {
			 return new ResponseEntity<>(employee,HttpStatus.OK);
		 }else {
			 return new ResponseEntity<>("Employee not found",HttpStatus.BAD_REQUEST); 
		 }
		
	} catch (Exception e) {
		return new ResponseEntity<>("Internal servser error",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

	 	
	 
 }
 @PutMapping("/employee/{EmployeeId}")
 public ResponseEntity<Object> updatEmployee(@PathVariable Integer EmployeeId,@RequestBody Employee body ) {
	 try {
		 Optional<Employee> employee =  employeeRepository.findById(EmployeeId);
		 
		 if(employee.isPresent()) {
			 employee.get().setFirstname(body.getFirstname());
			 employee.get().setLastname(body.getLastname());
			 employee.get().setFirstname(body.getLastname());
			 employee.get().setSalary(body.getSalary());
			 employee.get().setEmployeeId(body.getEmployeeId());
			 employeeRepository.save(employee.get());
			 return new ResponseEntity<>(employee,HttpStatus.OK);
				 }else {
					 return new ResponseEntity<>("Employee not found",HttpStatus.BAD_REQUEST);
			 }
		
	} catch (Exception e) {
		return new ResponseEntity<>("Internal servser error",HttpStatus.INTERNAL_SERVER_ERROR);

	 	
  }
 }
 
 @DeleteMapping("/employee/{EmployeeId}")
 public ResponseEntity<Object> deletEmployee (@PathVariable Integer EmployeeId ) {
	 
	 try {
		 Optional<Employee> employee = employeeRepository.findById(EmployeeId);
		 if (employee.isPresent()) {
			 employeeRepository.delete(employee.get());
			 return new ResponseEntity<>("DELETE SUCSESS",HttpStatus.OK);
		 }else {
			 return new ResponseEntity<>("Employee not found",HttpStatus.BAD_REQUEST); 
		 }
		
	} catch (Exception e) {
		return new ResponseEntity<>("Internal servser error",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
 }
}
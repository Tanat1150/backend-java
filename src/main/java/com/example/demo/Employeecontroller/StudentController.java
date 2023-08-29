package com.example.demo.Employeecontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mobel.Student;


@RestController
public class StudentController {

	private List<Student> data = new ArrayList<Student>();

	@GetMapping("/student")
	public List<Student> getStudent() {
		return data;
	}

	@PostMapping("/student")
	public Student addStudent(@RequestBody Student body) {

		for (int i = 0; i < data.size(); i++) {
			if (body.getStudentId() == data.get(i).getStudentId()) {
				return null;
			}
		}
		data.add(body);
		return body;
	}

	@PutMapping("/student/{StudentId}")
	public Student updatStudent(@PathVariable Integer ProductId, @RequestBody Student body) {
		for (int i = 0; i < data.size(); i++) {
			if (ProductId == data.get(i).getStudentId()) {
				data.get(i).setFirstname(body.getFirstname());
				data.get(i).setLastname(body.getLastname());
				data.get(i).setEmail(body.getEmail());
				
				return data.get(i);
			}
		}
		return null;
	}

	@DeleteMapping("/student/{StudentId}")
	public String deletstudent(@PathVariable Integer StudentId) {
		 for (int i=0; i < data.size(); i++) {
				if(StudentId == data.get(i).getStudentId()) {
				   data.remove(i);
				   
				   return"delete sucess";
		
	      }
		 
 }
		 return "product not font";
}
	
}
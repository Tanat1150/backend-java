package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.mobel.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}

package com.nagp.quotes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.quotes.db.StudentRepository;
import com.nagp.quotes.db.table.Student;

@RestController
@RequestMapping("/quotes")
public class QuotesController {

//	private StudentRepository studentRepository;
//	
//	public QuotesController(StudentRepository repository) {
//		this.studentRepository = repository;
//	}

	@GetMapping("/all")
	public List<Student> getQuotes() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "Neeraj", "N@nagarro.com"));
		return students;
	}

	@GetMapping("/error")
	public String onError() {
		return "Error occured";
	}
}

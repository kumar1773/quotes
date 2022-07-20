package com.nagp.quotes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagp.quotes.db.table.Student;

@SpringBootApplication
@RestController
public class QuotesApplication {
	
	
	@RequestMapping(value= "/")
	public List<Student> getSingleQuotes() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "Neeraj", "N@nagarro.com"));
		return students;
	}

	
	@GetMapping("/all")
	public List<Student> getQuotes() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "Neeraj", "N@nagarro.com"));
		students.add(new Student(2, "Dheeraj", "D@nagarro.com"));
		students.add(new Student(3, "Ajay", "A@nagarro.com"));

		return students;
	}


	public static void main(String[] args) {
		SpringApplication.run(QuotesApplication.class, args);
	}

}

package com.nagp.quotes.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagp.quotes.db.table.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}

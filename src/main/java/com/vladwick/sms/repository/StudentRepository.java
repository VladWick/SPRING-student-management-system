package com.vladwick.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vladwick.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}

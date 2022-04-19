package com.vladwick.sms.service;

import java.util.List;

import com.vladwick.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student updateStudent(Student student);
	Student getStudentById(Long id);
	void deleteStudentById(Long id);
}

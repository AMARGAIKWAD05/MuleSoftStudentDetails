package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	
	public Student addStudent(Student s);
	public List<Student > getAllStudents();
	public Student getStudentById(int id);
	public String deleteStudent(int id);
	public Student updateStudent(Student s);

}

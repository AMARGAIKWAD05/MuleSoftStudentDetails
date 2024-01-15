package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

public class StudentServiceImpl  implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public Student addStudent(Student s) {
		// TODO Auto-generated method stub
		return studentRepository.save(s);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return "Student deleted..";
	}

	@Override
	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		Student stud1=studentRepository.findById(s.getSid()).get();
		stud1.setSName(s.getSName());
		stud1.setContact(s.getContact());
		
		
		return studentRepository.save(stud1);
	}

}

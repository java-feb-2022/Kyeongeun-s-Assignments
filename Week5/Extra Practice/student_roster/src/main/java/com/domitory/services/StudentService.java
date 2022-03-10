package com.domitory.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.domitory.models.Student;
import com.domitory.repositories.StudentRepository;

@Service
public class StudentService {
	private final StudentRepository studentRepo;
	
	public StudentService(StudentRepository studentRepo) {
		this.studentRepo = studentRepo;
	}
	public List<Student> allStudents(){
		return studentRepo.findAll();
	}
	public Student createStudent(Student s) {
		return studentRepo.save(s);
	}
	public Student findById(Long id) {
		Optional<Student> d = studentRepo.findById(id);
		return d.isPresent()?d.get():null;
	}
	public List<Student> findByDormIsNull(){
		return studentRepo.findByDormIsNull();
	}
}

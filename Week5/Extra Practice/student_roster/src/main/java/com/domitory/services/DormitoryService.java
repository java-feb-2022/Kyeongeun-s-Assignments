package com.domitory.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.domitory.models.Dormitory;
import com.domitory.models.Student;
import com.domitory.repositories.DormitoryRepository;
import com.domitory.repositories.StudentRepository;

@Service
public class DormitoryService {
	private final DormitoryRepository dormRepo;
	private final StudentRepository studentRepo;
	
	public DormitoryService(DormitoryRepository dormRepo, StudentRepository studentRepo) {
		this.dormRepo = dormRepo;
		this.studentRepo = studentRepo;
	}
	public List<Dormitory> allDorms(){
		return dormRepo.findAll();
	}

	public Dormitory createDormitory(Dormitory dorm) {
		return dormRepo.save(dorm);
	}
	public void deleteDormitory(Long id) {
		dormRepo.deleteById(id);
	}
	public Dormitory findById(Long id) {
		Optional<Dormitory> d = dormRepo.findById(id);
		return d.isPresent()?d.get():null;
	}
	public void addStudent(Dormitory dorm, Student s) {
		s.setDorm(dorm);
		studentRepo.save(s);
	}
	public void removeStudent(Student s) {
		s.setDorm(null);
		studentRepo.save(s);
	}
}

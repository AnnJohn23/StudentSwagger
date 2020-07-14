package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentImplementation implements StudentService{
	
	@Autowired
	StudentRepository res;

	//ADD
	public StudentEntity addStudent(StudentEntity s) {
		
		return res.save(s);
	}

	//GET ALL DETAILS
	public List<StudentEntity> getAllDetails() {
		
		return (List<StudentEntity>) res.findAll();
	}

	//UPDATE
	public StudentEntity StudentUpdate(StudentEntity s, Integer studId) {
		Optional<StudentEntity>optStud=res.findById(studId);
		if(optStud.isPresent())
		{
			return res.save(s);
		}
		
		return null;
	}

	//GET BY ID
	public StudentEntity getById(Integer studId) {
		Optional<StudentEntity>optStud=res.findById(studId);
		System.out.println("Implementation");
		System.out.println(studId);
		return optStud.get();
	}

	//DELETE
	public void deleteStudent(Integer studId) {
		
		  res.deleteById(studId);;
	}
	
	

}
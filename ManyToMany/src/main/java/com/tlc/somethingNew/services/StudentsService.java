package com.tlc.somethingNew.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.tlc.somethingNew.models.Students;
import com.tlc.somethingNew.repositories.StudentsRepository;

@Service

public class StudentsService {
	private StudentsRepository studentsRepository;
	
	public StudentsService(StudentsRepository studentsRepository) {
		this.studentsRepository = studentsRepository;
	}

	
	public void createStudent(Students student) {
		studentsRepository.save(student);
	}
	
	public void destroyStudent(Students student) {
		studentsRepository.delete(student);
	}
	
	public Students findById(long id) {
		return studentsRepository.findById(id);
	}
	
	public ArrayList<Students> findAll(){
		return (ArrayList<Students>) studentsRepository.findAll();
	}
}

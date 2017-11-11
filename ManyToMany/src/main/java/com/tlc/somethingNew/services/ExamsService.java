package com.tlc.somethingNew.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.tlc.somethingNew.models.Exams;
import com.tlc.somethingNew.models.Students;
import com.tlc.somethingNew.repositories.ExamsRepository;
import com.tlc.somethingNew.repositories.StudentsRepository;

@Service

public class ExamsService {
	private ExamsRepository examsRepository;
	
	public ExamsService(ExamsRepository examsRepository) {
		this.examsRepository = examsRepository;
	}
		
		public void createExam(Exams exam) {
			examsRepository.save(exam);
		}
		
		public void destroyExams(Exams exam) {
			examsRepository.delete(exam);
		}
		
		public Exams findById(long id) {
			return examsRepository.findById(id);
		}
		
		public ArrayList<Exams> findAll(){
			return (ArrayList<Exams>) examsRepository.findAll();
		}
}


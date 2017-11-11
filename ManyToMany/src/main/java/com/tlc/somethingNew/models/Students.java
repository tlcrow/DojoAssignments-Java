package com.tlc.somethingNew.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity

public class Students {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String studentName;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "students_exams",
			joinColumns = @JoinColumn(name = "students_id"),
			inverseJoinColumns = @ JoinColumn(name = "exams_id")
			)
	private List<Exams> exams;
	
	public Students() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Exams> getExams() {
		return exams;
	}

	public void setExams(List<Exams> exams) {
		this.exams = exams;
	}
	
	
}

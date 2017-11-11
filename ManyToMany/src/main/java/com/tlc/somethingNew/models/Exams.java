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

public class Exams {
	@Id
	@GeneratedValue
	private Long id;
	
	private String examName;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name = "students_exams",
			joinColumns = @JoinColumn(name = "exams_id"),
			inverseJoinColumns = @JoinColumn(name = "students_id")
			)
	private List<Students> students;
	
	public Exams() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public List<Students> getStudents() {
		return students;
	}

	public void setStudents(List<Students> students) {
		this.students = students;
	}
	

}

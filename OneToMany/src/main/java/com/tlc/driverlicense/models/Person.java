package com.tlc.driverlicense.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity

public class Person {
	@Id
	@GeneratedValue
	private Long id;
	private String first;
	private String last;
	
	@Column
	@DateTimeFormat(pattern="MM/dd/yyyy HH:mm")
	private Date created_at;
	
	@Column
	@DateTimeFormat(pattern="MM/dd/yyyy HH:mm")
	private Date updated_at;
	
	@OneToMany(mappedBy="person", fetch=FetchType.LAZY)
	private List<License> license;
	
	@PrePersist
    protected void onCreate(){
        this.created_at = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updated_at = new Date();
    }
	
	public Person() {
	}
	
	public Person(String first, String last) {
		this.first = first;
		this.last = last;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

}

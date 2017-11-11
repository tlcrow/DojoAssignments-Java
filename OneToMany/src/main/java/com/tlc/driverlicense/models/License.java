package com.tlc.driverlicense.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity

public class License {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String number;
	private String date;
	
	@Column
	@Size(min=2, max=3, message="State must be abbriviated.")
	private String state;
	
	@Column
	@DateTimeFormat(pattern="MM/dd/yyyy HH:mm")
	private Date created_at;
	
	@Column
	@DateTimeFormat(pattern="MM/dd/yyyy HH:mm")
	private Date updated_at;
	
	@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="person_id")
    private Person person;
	
	@PrePersist
    protected void onCreate(){
        this.created_at = new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.updated_at = new Date();
    }
    
    public License() {
    	
    }
	
	public License(String number, String date, String state, Person person) {
		this.number = number;
		this.date = date;
		this.state = state;
		this.person = person;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String String) {
		this.number = String;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}


}

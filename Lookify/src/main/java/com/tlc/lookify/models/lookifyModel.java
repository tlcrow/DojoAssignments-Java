package com.tlc.lookify.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class lookifyModel {
	
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	@Size(min=2, message="Title must be more than 2 characters")
	private String title;
	
	@Column
	@Size(min=2, message="Artist must be more than 2 characters")
	private String artist;
	
	@Column
	private int rating;
	
	@Column
	@DateTimeFormat(pattern="MM/dd/yyyy HH:mm")
	private Date created_at;
	
	@Column
	@DateTimeFormat(pattern="MM/dd/yyyy HH:mm")
	private Date updated_at;
	
	@PrePersist
	protected void onCreated() {this.created_at = new Date();}
	
	@PreUpdate
	protected void onUpdate() {this.created_at = new Date();}
	
	public lookifyModel() {}
	
	public lookifyModel(String title, String artist, int rating) {
		this.title = title;
		this.artist = artist;
		this.rating = rating;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}

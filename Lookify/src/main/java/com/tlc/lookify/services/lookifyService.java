package com.tlc.lookify.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tlc.lookify.models.lookifyModel;
import com.tlc.lookify.repositories.lookifyRepository;

@Service
public class lookifyService {
	@Autowired
	private lookifyRepository lookifyrepository;
	
	public lookifyService(lookifyRepository lookifyrepository) {
		this.lookifyrepository = lookifyrepository;
	}
	
	public ArrayList<lookifyModel> all(){
		return (ArrayList<lookifyModel>) lookifyrepository.findAll();
	}
	
	public double count() {
		return lookifyrepository.count();
	}
	
	public lookifyModel getByIndex(long id) {
		
		if(id < lookifyrepository.count()) {
			return lookifyrepository.findOne(id);
		}
		else {
			return null;
		}
	}
	
	public ArrayList<lookifyModel> findByArtist(String artist) {
		ArrayList<lookifyModel> temp = (ArrayList<lookifyModel>) lookifyrepository.findByArtist(artist);
		if(temp != null) {
			return temp;
		}
		else {
			return null;
		}
	}
	
	public void create(lookifyModel lookifymodel) {
		lookifyrepository.save(lookifymodel);
	}
	
	public void destroy(long id) {
		lookifyrepository.delete(id);
	}
	
	public ArrayList<lookifyModel> top(){
		ArrayList<lookifyModel> songs = (ArrayList<lookifyModel>) lookifyrepository.OrderByRatingDesc();
		for(int i = 1; i < songs.size(); i++) {
			if(i > 9) {
				songs.remove(i);
			}
		}
		return songs;
	}
	
}

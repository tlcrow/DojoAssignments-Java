package com.tlc.lookify.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tlc.lookify.models.lookifyModel;

@Repository
public interface lookifyRepository extends CrudRepository<lookifyModel, Long>{
	ArrayList<lookifyModel> findByArtist(String artist);

	ArrayList<lookifyModel> OrderByRatingDesc();
	
}

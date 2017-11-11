package com.tlc.somethingNew.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tlc.somethingNew.models.Students;

@Repository

public interface StudentsRepository extends CrudRepository<Students, Long>{
	
	Students findById(Long id);

}

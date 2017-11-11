package com.tlc.somethingNew.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tlc.somethingNew.models.Exams;
import com.tlc.somethingNew.models.Students;

@Repository

public interface ExamsRepository extends CrudRepository<Exams, Long>{

	Exams findById(long id);

}

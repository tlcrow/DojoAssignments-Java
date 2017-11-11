package com.tlc.driverlicense.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tlc.driverlicense.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{

}

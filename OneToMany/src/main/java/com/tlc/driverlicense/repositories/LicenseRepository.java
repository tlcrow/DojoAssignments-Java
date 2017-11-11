package com.tlc.driverlicense.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.tlc.driverlicense.models.License;

public interface LicenseRepository extends CrudRepository<License, Long>{
	ArrayList<License>findByPersonId(long id);
}

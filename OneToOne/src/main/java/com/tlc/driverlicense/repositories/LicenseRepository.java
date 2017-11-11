package com.tlc.driverlicense.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tlc.driverlicense.models.License;

public interface LicenseRepository extends CrudRepository<License, Long>{

}

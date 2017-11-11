package com.tlc.driverlicense.services;

import org.springframework.stereotype.Service;

import com.tlc.driverlicense.models.License;
import com.tlc.driverlicense.models.Person;
import com.tlc.driverlicense.repositories.LicenseRepository;
import com.tlc.driverlicense.repositories.PersonRepository;

@Service
public class LicenseService {
	private PersonService personService;
	private LicenseRepository licenseRepository;
	
	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	public License getlById(long id) {
		System.out.println(id);
		return licenseRepository.findOne(id);
	}

	public void createLicense(License license) {
		licenseRepository.save(license);
	}
}

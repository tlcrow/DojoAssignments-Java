package com.tlc.driverlicense.services;

import org.springframework.stereotype.Service;

import com.tlc.driverlicense.models.License;
import com.tlc.driverlicense.models.Person;
import com.tlc.driverlicense.repositories.PersonRepository;

@Service
public class PersonService {
	
	private LicenseService licenseService;
	private PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public Person getpById(long id) {
		return personRepository.findOne(id);
	}

	public void createPerson(Person person) {
		System.out.println("I made it to services");
		personRepository.save(person);
	}
}

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonServiceimpl implements PersonService
   {
	
	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public Person saveData(Person p) {
		// TODO Auto-generated method stub
		Person p1 = personRepository.save(p);
		return p1;
	}

	@Override
	public Person updateData(Person p) {
		// TODO Auto-generated method stub
		Person p1 = personRepository.save(p);
		return p1;
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		personRepository.deleteById(id);
		
	}

	@Override
	public Person getData(int id) {
		// TODO Auto-generated method stub
		Person p = personRepository.findById(id).orElseThrow();
		return p;
	}
}

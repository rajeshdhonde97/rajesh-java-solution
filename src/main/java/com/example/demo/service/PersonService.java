package com.example.demo.service;

import com.example.demo.model.Person;

public interface PersonService 
{

    public Person saveData(Person p);
	
	public Person updateData(Person p);
	
	public void deleteData(int id);
	
	public Person getData(int id);
	
	
}
                                                          
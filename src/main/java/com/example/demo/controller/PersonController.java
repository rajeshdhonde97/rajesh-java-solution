package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Person;
import com.example.demo.service.PersonService;



@RestController
public class PersonController 
  {
	@Autowired
    private PersonService personService;
	
	@PostMapping("/savedata")
	public Person saveData(@RequestBody Person p)
	  {
		Person st = personService.saveData(p);
		return st;
	  }
	
	@PutMapping("/updatedata")
	public Person updateData(@RequestBody Person p)     
	  {
		Person st = personService.updateData(p);
		return st;
	  }
	
	@GetMapping("/getdata/{id}")
	public Person getData(@PathVariable int id)
	  {
		Person st = personService.getData(id);
		return st;
	  }
	
	@DeleteMapping("/deletedata/{id}")
	public void deleteData(@PathVariable int id)
	  {
	     personService.deleteData(id);
	  }

  }

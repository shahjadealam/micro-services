package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	private	CustomerService customerService;
	
	
	
	@RequestMapping(value="/getpersonalinfo/{email}", method=RequestMethod.GET)
	public Customer getPersonalInfo(@PathVariable String email)
	{
		return customerService.getOne(email);
	}
	
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test()
	{
		return "Running!!!";
	}
}

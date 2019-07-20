package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	List<Customer> customerList = new ArrayList<Customer>(Arrays.asList(
			new Customer("101", "Shahjade", "Alam", "shahjade.a@hcl.com", "8889996568", "Indore", "HCT Tech"),
			new Customer("102", "Ashish", "Khatri", "ashish.k@hcl.com", "8269569738", "Kanpur", "HCL Tech")
							));
	
	public Customer getOne(String email)
	{
	
	return customerList.stream().filter(a-> a.getEmail().equals(email)).findFirst().get();
	}
}

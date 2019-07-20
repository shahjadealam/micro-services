package com.subscription.create.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.subscription.create.entity.Product;
import com.subscription.create.service.CreateProductService;

@RestController
public class CreateProductController {

	@Autowired
	CreateProductService createProductService;
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ResponseEntity<String> test()
	{
		return new ResponseEntity<>("You are Welcome",HttpStatus.OK);
	}
	
	@RequestMapping(value="/singlproductupload",method=RequestMethod.POST)
		public ResponseEntity<String> singleUpload(@RequestBody Product product)
		{
		createProductService.createProduct(product);
			return new ResponseEntity<>("Single Upload Done",HttpStatus.OK);
		
	}
}

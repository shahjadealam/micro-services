package com.subscription.create.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subscription.create.entity.Product;
import com.subscription.create.repository.CreateProductRepository;

@Service
public class CreateProductService {

	@Autowired
	CreateProductRepository createProductRepository;
	
	public void createProduct(Product product)
	{
	createProductRepository.saveProduct(product);
	}
	
}

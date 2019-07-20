package com.subscription.create.repository;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.subscription.create.entity.Product;

@Transactional
@Repository
public class CreateProductRepository {

	@Autowired
	SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
public void saveProduct(Product product)
{
this.getSession().save(product)	;
}
}

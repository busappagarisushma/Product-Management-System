package com.example.product.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Repository;

import com.example.product.entity.Product;

@Repository
public class ProductRepository {

	private final EntityManagerFactory entityManagerFactory;

	public ProductRepository(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}


	public Product addProduct(Product product) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		entityManager.persist(product);

		entityTransaction.commit();
		entityManager.close();

		return product;
	}
	
}

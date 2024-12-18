package com.example.product.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

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

	public List<Product> findAllProducts() {
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		TypedQuery<Product> query = entityManager.createQuery("FROM Product", Product.class);

		List<Product> products = query.getResultList();
		entityManager.close();
		return products;
	}

	public void deleteProduct(int productId) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		entityManager.remove(entityManager.find(Product.class, productId));

		entityTransaction.commit();
		entityManager.close();

	}
	
	public Product findProductById(int productId) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        Product product = entityManager.find(Product.class, productId); 
        
        entityManager.close(); 
        return product; 
    }
	
	public void updateProduct(Product product) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        
        entityManager.merge(product); 
        
        entityTransaction.commit();
        entityManager.close();
    }
	
}

package com.vijay.dao;

import java.util.List;

import com.vijay.model.Product;

public interface ProductDAO {

	int add(Product product);

	void update(Product product);

	void deleteById(int pid);

	Product findById(int pid);

	List<Product> findAll();

	// SELECT PNAME FROM PRODUCT;

	List<String> findAllPnames();

	Product findByIdHql(int pid);

}

package com.vijay.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vijay.dao.ProductDAO;
import com.vijay.model.Product;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");

//		Product product = new Product();
//		product.setPid(5);
//		product.setPname("MOTO XP");
//		product.setPcost(75000);
//
//		productDAO.add(product);

		// productDAO.update(product);
		// productDAO.deleteById(5);
		// System.out.println( productDAO.findById(5));
		// System.out.println(productDAO.findAllPnames());
//	List<Product>	pList=productDAO.findAll();
//	for (Product product : pList) {
//		System.out.println(product);
//	}

		System.out.println(productDAO.findByIdHql(5));
	}

}

package com.test;

import java.util.ArrayList;

import com.healtcare.entites.Product;
import com.healthcare.dao.ProductDaoImpl;

public class Demo {

	public static void main(String[] args) {
		
		// get product by id
//		ProductDaoImpl p1 = new ProductDaoImpl();
//		Product product = p1.getProduct(1);
//		System.out.println(product);
		
		
		//update prod
//		Product prod = new Product(2,"Paracetamol","Panadol", "Analgesic", "imageParacetamol","Paracetamol is a widely used over-the-counter medication", 50.0, 18.0, true);
//		ProductDaoImpl p2 = new ProductDaoImpl();
//		p2.updateProduct(prod);
	
		//add product
//		Product prod2= new Product(2,"Paracetamol","Panadol","imageParacetamol"," Analgesic","Paracetamol is a widely used over-the-counter medication",35.0,10.0,true);
//		ProductDaoImpl p3 = new ProductDaoImpl();
//		p3.addProduct(prod2);
		
		
		//make available method 
//		ProductDaoImpl p3 =new ProductDaoImpl();
//		p3.makeProducAvailable(2, true);
		
		
		//viewProduct
//		ProductDaoImpl p4 = new ProductDaoImpl();
//		ArrayList<Product> p=p4.viewProdcut();
//		System.out.println(p);
		
		
		//seach product
		ProductDaoImpl p5 = new ProductDaoImpl();
		Product product = p5.searchProduct("analgesic");
		System.out.println(product);
	}

}

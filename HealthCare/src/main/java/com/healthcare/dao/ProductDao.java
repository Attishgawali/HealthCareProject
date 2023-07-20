package com.healthcare.dao;

import com.healtcare.entites.Product;
import java.util.ArrayList;

public interface ProductDao {
	
	public void addProduct(Product product);
	public Product getProduct(int id);
	public void updateProduct(Product product);
	public void makeProducAvailable(int id,boolean state);
	public ArrayList<Product> viewProdcut();
	public Product searchProduct(String search);
}

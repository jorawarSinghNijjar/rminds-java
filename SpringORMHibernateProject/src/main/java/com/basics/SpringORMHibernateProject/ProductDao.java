package com.basics.SpringORMHibernateProject;

import java.util.List;

public interface ProductDao {
	public int insert(Product product);
	public void update(Product updatedProduct);
	public void delete(Product product);
	public Product findOne(int productId);
	public List<Product> findAll();
}

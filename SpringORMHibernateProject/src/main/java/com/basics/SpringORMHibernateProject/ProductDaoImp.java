package com.basics.SpringORMHibernateProject;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component("dao")
public class ProductDaoImp implements ProductDao{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Product product) {
	 Integer i = (Integer) hibernateTemplate.save(product);
		return i;
	}

	@Transactional
	public void update(Product updatedProduct) {
		hibernateTemplate.update(updatedProduct);
		
	}

	@Transactional
	public void delete(Product product) {
		hibernateTemplate.delete(product);
		
	}

	public Product findOne(int productId) {
		return hibernateTemplate.get(Product.class, productId);
	}

	public List<Product> findAll() {
		return hibernateTemplate.loadAll(Product.class);
	}
}

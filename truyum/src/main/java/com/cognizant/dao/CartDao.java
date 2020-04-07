package com.cognizant.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.model.MenuItem;

@Repository
public interface CartDao {

	List<MenuItem> getCustomerItems();

	List<MenuItem> getMenuItems();

	void addToCart(int id);

	void removeFromCart(int id);

}

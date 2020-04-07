package com.cognizant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cognizant.model.MenuItem;

@Service
public interface CartService {

	List<MenuItem> getCustomerItems();

	List<MenuItem> getMenuItems();

	void addCart(int id);

	void removeCart(int id);

	double checkout();

}

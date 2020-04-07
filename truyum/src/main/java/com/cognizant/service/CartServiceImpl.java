package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.CartDao;
import com.cognizant.model.MenuItem;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartDao cartDao;
	
	@Override
	public List<MenuItem> getCustomerItems() {
		
		List<MenuItem> customerItems = cartDao.getCustomerItems();
		
		
		return customerItems;
	}

	@Override
	public List<MenuItem> getMenuItems() {
		
		List<MenuItem> menuItems = cartDao.getMenuItems();
		
		return menuItems ;
	}

	@Override
	public void addCart(int id) {
		cartDao.addToCart(id);
		
	}

	@Override
	public void removeCart(int id) {
		cartDao.removeFromCart(id);
		
	}

	@Override
	public double checkout() {
		// TODO Auto-generated method stub
		List<MenuItem> list = getCustomerItems();
		
		double total=0.0;
		for(MenuItem m :list)
		{
			total= total+m.getPrice();
		}
		return total;
		
	}


}

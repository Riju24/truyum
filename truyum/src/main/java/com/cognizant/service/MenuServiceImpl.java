package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.MenuItemDao;
import com.cognizant.model.MenuItem;

@Service
public class MenuServiceImpl implements MenuService {

	
	@Autowired 
	MenuItemDao menuItemDao;
	
	
	@Override
	public List<MenuItem> getItems() {
		
		List<MenuItem> list = menuItemDao.getItems();
		return list;
	}


	@Override
	public MenuItem getMenuItem(int id) {
		MenuItem m = menuItemDao.getMenu(id);
		
		return m;
	}


	@Override
	public void updateMenuItem(MenuItem m) {
		
		int x = menuItemDao.getCategoryId(m.getCategory());
		
		menuItemDao.setMenu(m,x);
		
	}


	@Override
	public void deleteItem(int id) {
		menuItemDao.deleteItem(id);
		
	}

	public void insertMenuItem(MenuItem m)
	{
		int x = menuItemDao.getCategoryId(m.getCategory());
		
		menuItemDao.insertMenu(m,x);
		
	}
}

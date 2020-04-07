package com.cognizant.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.model.MenuItem;

@Repository
public interface MenuItemDao {

	List<MenuItem> getItems();

	MenuItem getMenu(int id);

	void setMenu(MenuItem m, int x);
	public int getCategoryId(String s);

	void deleteItem(int id);

	void insertMenu(MenuItem m, int x);

	

}

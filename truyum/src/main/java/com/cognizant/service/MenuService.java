package com.cognizant.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.cognizant.model.*;


@Service
public interface MenuService {

	public List<MenuItem> getItems();

	public MenuItem getMenuItem(int id);

	public void updateMenuItem(MenuItem menuItem);

	public void deleteItem(int id);

	public void insertMenuItem(MenuItem m);




}

package com.cognizant.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuItem {
	int id;
	String name;
	double price;
	boolean active;
	Date dateOfLaunch;
	boolean free;
	String category;
	
	public MenuItem() {
		super();
	}
	public MenuItem(int id, String name, double price, boolean active, Date dateOfLaunch,boolean free, String category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.active = active;
		this.dateOfLaunch = dateOfLaunch;
		this.category = category;
		this.free = free;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}
	public void setDateOfLaunch(String dateOfLaunch) throws ParseException {
		
		
		this.dateOfLaunch = new SimpleDateFormat("yyyy-mm-dd").parse(dateOfLaunch);
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean getFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free = free;
	}
	@Override
	public String toString() {
		return "MenuItem [id=" + id + ", name=" + name + ", price=" + price + ", active=" + active + ", dateOfLaunch="
				+ dateOfLaunch + ", free=" + free + ", category=" + category + "]";
	}


}

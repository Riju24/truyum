package com.cognizant.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cognizant.model.MenuItem;

@Repository
public class CartDaoImpl implements CartDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<MenuItem> getCustomerItems() {
		int id =2;
		String sql="Select * from Menu_items m,Category c where m.Menu_id in (Select Menu_Items_Menu_id from Cart where Customer_Customer_id=?)and m.category_id = c.category_id";
		List<MenuItem> list = jdbcTemplate.query(sql, new Object[] {id},(rs,x)->
		
										new MenuItem(
													rs.getInt(1),
													rs.getString(2),
													rs.getDouble(3),
													rs.getBoolean(4),
													rs.getDate(5),
													rs.getBoolean(7),
													rs.getString(9)
				
													)
				);
		
		return list;
	}

	@Override
	public List<MenuItem> getMenuItems() {
		int id =2;
		String sql="Select * from Menu_items m,Category c where m.Menu_id not in (Select Menu_Items_Menu_id from Cart where Customer_Customer_id=?) and m.category_id = c.category_id";
		List<MenuItem> list = jdbcTemplate.query(sql, new Object[] {id},(rs,x)->
		
										new MenuItem(
													rs.getInt(1),
													rs.getString(2),
													rs.getDouble(3),
													rs.getBoolean(4),
													rs.getDate(5),
													rs.getBoolean(7),
													rs.getString(9)
				
													)
				);
		
		return list;
	}

	@Override
	public void addToCart(int id) {
		
		String sql ="Insert into Cart values (?,?)";
		int q = jdbcTemplate.update(sql,id,2);
	}

	@Override
	public void removeFromCart(int id) {
		
		String sql ="Delete from Cart where Menu_Items_Menu_Id = ? and Customer_Customer_Id =?";
		int q = jdbcTemplate.update(sql,id,2);
	}

}

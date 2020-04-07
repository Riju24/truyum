package com.cognizant.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cognizant.model.MenuItem;

@Repository
public class MenuItemDaoImpl implements MenuItemDao {

	@Autowired 
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<MenuItem> getItems() {
		
		String sql = "Select * from Menu_items m ,Category c where m.category_id = c.category_id";
		
		List<MenuItem> list = jdbcTemplate.query(sql, (rs,x)->
		
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
		System.out.println(list);
		
		return list;
	}

	@Override
	public MenuItem getMenu(int id) {
		
		
		String sql = "Select * from Menu_items m ,Category c where m.category_id = c.category_id and m.menu_id=?";
		
		
		
		List<MenuItem> list = jdbcTemplate.query(sql, new Object[] {id},  (rs,x)->
		
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
		
		
		return list.get(0);
	}

	@Override
	public void setMenu(MenuItem m,int x) {
		String sql ="Update Menu_items set Menu_name=?,Price=? ,Active=? ,Dol=?, Category_id=?, Free=? where menu_id=?";
		
		int q = jdbcTemplate.update(sql, m.getName(),m.getPrice(),m.isActive(),m.getDateOfLaunch(),x,m.getFree(),m.getId());
	}
	
	public int getCategoryId(String s)
	{
		String sql1 ="Select category_id from category where category_name = ? ";
		
		List<Integer>  st = jdbcTemplate.query(sql1,new Object[] {s} ,(rs,x)-> (rs.getInt(1)));
		
		return st.get(0);
		
	}

	@Override
	public void deleteItem(int id) {
		String sql = "Delete from Menu_items where menu_id =?";
		int q = jdbcTemplate.update(sql,id);
		
	}

	@Override
	public void insertMenu(MenuItem m, int x) {
		// TODO Auto-generated method stub
		String sql ="Insert into Menu_Items values(?,?,?,?,?,?,?)";
		
		int q = jdbcTemplate.update(sql,m.getId(),m.getName(),m.getPrice(),m.isActive(),m.getDateOfLaunch(),x,m.getFree());
	}


}

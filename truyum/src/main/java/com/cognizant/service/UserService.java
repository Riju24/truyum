package com.cognizant.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.cognizant.model.Customer;

@Service
public class UserService {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public void putDetails(HttpServletRequest request) {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
		String sql = "Update Customer set Customer_Name=?,Customer_phone=?,Customer_Address=?,Customer_email=?   where Customer_Id = 2";
		
		int q = jdbcTemplate.update(sql,name,phone,address,email);
				
	}
	
	public Customer getDetails()
	{
		String sql = "Select * from Customer where Customer_id=2";
		
		List<Customer> cus = jdbcTemplate.query(sql, (rs,x)->
		
														new Customer(
																	rs.getString(2),
																	rs.getString(3),
																	rs.getString(4),
																    rs.getString(5)
																    )
							
				
												);
		
		return cus.get(0);
		
	}

	public void deleteCart() {
		String sql = "Delete from Cart where Customer_Customer_Id=2";
		int q = jdbcTemplate.update(sql);
		
	}
	

}

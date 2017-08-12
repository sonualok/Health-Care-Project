package com.spring.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.spring.service.User;
import com.spring.xml.UserEnrollmentXml;

import oracle.sql.DATE;
import oracle.sql.TIMESTAMP;

@Repository
public class UserDaoImpl implements UserDao
{
	@Autowired
	private  JdbcTemplate  jt;
	
	static final Logger  logger=Logger.getLogger(UserDaoImpl.class);	
	
	public String enrollUser(UserEnrollmentXml userEnrollmentXml){
	
		int  i = jt.update("insert  into  test.bank_account_main values(?,?,?,?,?,?,?,?)", 
				                                                   userEnrollmentXml.getCustomer_bank_id(),
				                                                   "1",
				                                                   userEnrollmentXml.getBank_name(),
				                                                   userEnrollmentXml.getCustomer_bank_number(),
				                                                   userEnrollmentXml.getCustomer_debit_card_number(),
				                                                   userEnrollmentXml.getCustomer_debit_card_selection(),
				                                                   userEnrollmentXml.getInsurer_client_name(),
				                                                   userEnrollmentXml.getBank_balance());
		
		if(i==1)
		{
			logger.debug("Enrollment Process Completed for " + userEnrollmentXml.getCustomer_bank_id());
		}
		else
		{
			logger.error("Enrollment Process failed for "    + userEnrollmentXml.getCustomer_bank_id());
		}
		return null;
	}
	
	
	public List<User> findAllUsers() 
	{
		List<User>   userList = new  ArrayList<User>();
		List  list=jt.queryForList("select * from  BANK.users");
		System.out.println("connected to database");
		Iterator  it = list.iterator();
		while(it.hasNext())
		{
			Map  map=(Map)it.next();
			User  u = new  User();
			BigDecimal  bd=(BigDecimal)map.get("id");
			int  i = bd.intValue();
			u.setId(i);
			u.setName((String)map.get("name"));
			userList.add(u);
		}
		return userList;
	}

	public User findUserById(int id) 
	{
		Map  map = jt.queryForMap("select  *  from  BANK.users  where  id=?", id);
		System.out.println("connected to database");
		User   u;
		if(map != null)
		{
			u = new  User();
			BigDecimal  bd=(BigDecimal)map.get("id");
			int  i = bd.intValue();
			u.setId(i);
			u.setName((String)map.get("name"));
		}
		else
		{ 
			u=null;
		}
		return  u;
	}

	public String addUser(User obj) 
	{
		String  str;
		int  id = obj.getId();
		String  name=obj.getName();
		System.out.println("inside insert method");
		int  i = jt.update("insert  into  BANK.users values(?,?)", id,name);
		if(i==1)
		{
			str="User  inserted.";
		}
		else
		{
			str="Sorry, User already exist";
		}
		return  str;
		
	}

}

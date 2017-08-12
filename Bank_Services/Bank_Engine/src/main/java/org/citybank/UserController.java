package org.citybank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dao.UserDao;
import com.spring.dao.UserDaoXml;
import com.spring.xml.UserListXml;
import com.spring.xml.UserEnrollmentXml;


@RestController
public class UserController 
{
	@Autowired
	private  UserDao  userDao;
	
	//@Autowired
	//private  UserDaoXml  userDaoXml;
	
	static final Logger  logger=Logger.getLogger(UserController.class);
	
	@RequestMapping(value="/addUser",  method=RequestMethod.POST, produces=MediaType.APPLICATION_XML_VALUE) 
			                                         //consumes=MediaType.APPLICATION_XML_VALUE)
	public   String  EnrollmentProcess(@RequestBody UserEnrollmentXml userEnrollmentXml)
	{	System.out.println("Inside EnrollmentProcess");
	    logger.debug("Inside addUser Resource::::::Request to add the User at bank side");
		
		String  str = userDao.enrollUser(userEnrollmentXml);
		return str;
	}
	
//	@RequestMapping(value="/getUsersXml", method=RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
//	public   @ResponseBody  UserListXml  getAllUsersXml()
//	{	
//		System.out.println("inside getAllusersXml");
//		UserListXml  userList = userDaoXml.findAllUsers();
//		return userList;
//	}
//	
//	@RequestMapping(value="/getUserByIdXml/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_XML_VALUE)
//	public   @ResponseBody  UserEnrollmentXml  getAllUserByIdXml(@PathVariable("id")int  id)
//	{	
//		System.out.println("inside getUserByIdXml");
//		UserEnrollmentXml  userList = userDaoXml.findUserById(id);
//		return userList;
//	}
}

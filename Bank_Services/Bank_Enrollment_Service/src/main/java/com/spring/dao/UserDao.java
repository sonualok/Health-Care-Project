package com.spring.dao;

import java.util.List;

import com.spring.service.User;
import com.spring.xml.UserEnrollmentXml;

public interface UserDao
{
	List<User>   findAllUsers();
	User         findUserById(int  id);
	String       enrollUser(UserEnrollmentXml userEnrollmentXml);
}

package com.Project.dao;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component("UserDao")
public class UserDao implements InitializingBean{
	
	
	public UserDao() {

		System.out.println("User Dao :: Constructor :");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("get Data from database ...");
		System.out.println("store into redis...");
	}
	
	
	

}

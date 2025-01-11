package com.Project.service;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Service;

@Service
@DependsOn("UserDao")
public class UserService {

	
	
	public UserService() {
		System.out.println(" User Service :: Constructor :");
		
		System.out.println("Getting Data From Reddis :");;
	}
}

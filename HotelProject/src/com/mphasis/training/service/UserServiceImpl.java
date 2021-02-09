package com.mphasis.training.service;

import java.util.HashSet;
import java.util.Set;

import com.mphasis.training.pojos.User;

public class UserServiceImpl implements UserService {
	
	static Set<User> users=new HashSet<User>();
	
	static {
		users.add(new User("Shwetha", "1234","admin"));
		users.add(new User("Anil", "7834","customer"));
		users.add(new User("Aayush", "9834","customer"));
		users.add(new User("Swathi", "9634","admin"));
		users.add(new User("Vamshi", "8765","customer"));
	}

	@Override
	public Set<User> getAllUsers() {
		// TODO Auto-generated method stub
		return users;
	}

	@Override
	public String loginUser(String username, String pass) {
		String st=null;
		for(User u:users) {
			if(u.getUsername().equals(username) && 
					u.getPassword().equals(pass)) {
				st= u.getRole();
				break;
			}else {
				st= "invalid credentials";
			}			
		}
		return st;
	}
//		User u= new User(username, pass);
//		System.out.println(u);
//		if(users.contains(u))
//			if(u.getRole().equalsIgnoreCase("admin"))
//				return "admin";
//			else if(u.getRole().equalsIgnoreCase("customer"))
//				return "customer";
//			else
//			return "invalid role";
//		else
//			return "invalid username and password";
		//return pass;
	//}
//		for(User u:users) {
//			if(u.getUsername().equals(username) 
//					&& u.getPassword().equals(pass)) {
//				return true;
//			}else {return false;	
//			}



}

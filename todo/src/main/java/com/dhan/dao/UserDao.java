package com.dhan.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.dhan.model.User;

@Repository
public class UserDao {

	private static List<User> list = null;
	static {
		list = new ArrayList<User>();
		list.add(new User("dhananjay", "dhan@yahoo.com", 20, "India"));
		list.add(new User("dhananjay1", "dhan1@yahoo.com", 201, "India1"));
		list.add(new User("dhananjay2", "dhan2@yahoo.com", 202, "India2"));
		list.add(new User("dhananjay3", "dhan3@yahoo.com", 203, "India3"));
		list.add(new User("dhananjay4", "dhan4@yahoo.com", 204, "India4"));
		list.add(new User("dhananjay5", "dhan5@yahoo.com", 205, "India5"));
		list.add(new User("dhananjay6", "dhan6@yahoo.com", 206, "India6"));
		list.add(new User("dhananjay7", "dhan7@yahoo.com", 207, "India7"));
		list.add(new User("dhananjay8", "dhan8@yahoo.com", 208, "India8"));
		list.add(new User("dhananjay9", "dhan9@yahoo.com", 209, "India9"));

	}

	public List<User> getAllusers() {

		return list;
	}

	public void addUser(User user) {
	list.add(user);
		
	}
	

	
}

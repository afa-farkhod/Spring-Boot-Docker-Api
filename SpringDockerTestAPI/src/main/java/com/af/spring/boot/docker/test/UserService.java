package com.af.spring.boot.docker.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	private List<User> userList;
	
	public UserService() {
		userList = new ArrayList<>();
		
		User user1 = new User(1, "Frank", 32, "af4092@ajou.ac.jr");
		User user2 = new User(2, "July", 33, "july@gmail.com");
		User user3 = new User(3, "Alex", 36, "alex@mail.ru");
		
		userList.addAll(Arrays.asList(user1, user2, user3));
 	}
	
	public Optional<User> getUser(Integer id) {
		Optional optional = Optional.empty();
		for(User user: userList) {
			if(id==user.getId()) {
				optional = Optional.of(user);
				return optional;
			}
		}
		return optional;
	}
}

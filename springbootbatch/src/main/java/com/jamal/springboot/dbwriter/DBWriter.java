package com.jamal.springboot.dbwriter;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jamal.springboot.medel.User;
import com.jamal.springboot.repository.UserService;

@Component
public class DBWriter implements ItemWriter<User> {

	@Autowired
	UserService userService;

	@Override
	public void write(List<? extends User> users) throws Exception {
		System.out.println("Data Saved for Users: " + users);
		userService.usersSave(users);
	}

}

package com.jamal.springboot.repository;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.jamal.springboot.medel.User;

@Service
@EnableTransactionManagement
public class UserService {
	private UserRepository userRepository;
	
	public void usersSave(List<? extends User> items){
		userRepository.save(items);
	}

}

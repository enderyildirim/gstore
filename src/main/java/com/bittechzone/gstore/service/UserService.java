package com.bittechzone.gstore.service;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.bittechzone.gstore.model.User;
import com.bittechzone.gstore.repository.UserRepository;

@Service
public class UserService extends BaseService<User, Long, UserRepository> {
		
	public Iterable<User> getAllFirstNameSorted() {
		Iterable<User> all = findAll();
		return StreamSupport.stream(all.spliterator(), false)
							.sorted((u1, u2) -> u1.getFirstName().compareTo(u2.getFirstName()))
							.collect(Collectors.toList());
	}
}

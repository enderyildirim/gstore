package com.bittechzone.gstore.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.bittechzone.gstore.base.BaseService;
import com.bittechzone.gstore.model.User;
import com.bittechzone.gstore.repository.UserRepository;

@Service
@Transactional
public class UserService extends BaseService<User, Long, UserRepository> {
		
	public Iterable<User> findByLastName(String lastName) {
		return repository.findByLastName(lastName);
	}
	
}

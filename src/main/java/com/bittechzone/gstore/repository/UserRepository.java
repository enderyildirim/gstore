package com.bittechzone.gstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bittechzone.gstore.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}

package com.bittechzone.gstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bittechzone.gstore.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

}

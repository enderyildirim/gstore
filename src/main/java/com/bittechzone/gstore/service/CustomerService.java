package com.bittechzone.gstore.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.bittechzone.gstore.base.BaseService;
import com.bittechzone.gstore.model.Customer;
import com.bittechzone.gstore.repository.CustomerRepository;

@Component
@Transactional
public class CustomerService extends BaseService<Customer, Long, CustomerRepository>{

}

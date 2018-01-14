package com.bittechzone.gstore.config;

import java.math.BigDecimal;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.bittechzone.gstore.model.Customer;
import com.bittechzone.gstore.model.Sale;
import com.bittechzone.gstore.model.User;
import com.bittechzone.gstore.service.CustomerService;
import com.bittechzone.gstore.service.TransactionService;
import com.bittechzone.gstore.service.UserService;

@Configuration
public class DatabaseInitializer {

    @Autowired
    UserService userService;

    @Autowired
    CustomerService customerService;

    @Autowired
    TransactionService operationService;

    @PostConstruct
    private void init() {
	insertUsers();
	insertCustomers();
	initOperations();
    }

    private void insertUsers() {
	User u1 = new User();
	u1.setFirstName("Ender");
	u1.setLastName("Yildirim");
	u1.setUserName("flyingcode");
	u1.setPassword("193782");

	userService.save(u1);
    }

    private void insertCustomers() {
	User u = userService.findByID(1l);

	Customer c1 = new Customer();
	c1.setFirstName("Mehmet");
	c1.setLastName("Özgür");

	c1.setCreatedBy(u);

	customerService.save(c1);
    }

    private void initOperations() {
	User u = userService.findByID(1l);
	Customer c = customerService.findByID(1l);

	for (int i = 1; i < 20; i++) {
	    Sale op = new Sale();
	    op.setAmount(BigDecimal.valueOf(Math.random() * i * 5));
	    op.setCreatedBy(u);
	    op.setPerformedBy(c);
	    operationService.save(op);
	}
    }

}

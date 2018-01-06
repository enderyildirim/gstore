package com.bittechzone.gstore.controller;

import java.util.HashSet;
import java.util.Set;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bittechzone.gstore.dto.OperationDTO;
import com.bittechzone.gstore.model.Customer;
import com.bittechzone.gstore.model.Operation;
import com.bittechzone.gstore.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	ModelMapper modelMapper;

	@Autowired
	CustomerService customerService;

	@GetMapping("/all")
	public @ResponseBody Iterable<Customer> getAllCustomers() {
		return customerService.findAll();
	}

	@GetMapping("/{id}")
	public @ResponseBody Customer getCustomer(@PathVariable Long id) {
		return customerService.findByID(id);
	}
	
	@GetMapping("/{id}/operations")
	public @ResponseBody Set<OperationDTO> getUserOperations(@PathVariable Long id) {
		Set<Operation> operations = customerService.findByID(id).getOperations();
		Set<OperationDTO> operationDTOs = new HashSet<>();
		for (Operation operation : operations) {
			OperationDTO operationDTO = modelMapper.map(operation, OperationDTO.class);
			operationDTOs.add(operationDTO);
		}
		return operationDTOs;
	}

}

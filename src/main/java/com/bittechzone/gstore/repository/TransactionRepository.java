package com.bittechzone.gstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bittechzone.gstore.model.Sale;

public interface TransactionRepository extends CrudRepository<Sale, Long> {

}

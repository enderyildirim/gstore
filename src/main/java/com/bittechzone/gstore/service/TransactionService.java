package com.bittechzone.gstore.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.bittechzone.gstore.base.BaseService;
import com.bittechzone.gstore.model.Sale;
import com.bittechzone.gstore.repository.TransactionRepository;

@Service
@Transactional
public class TransactionService extends BaseService<Sale, Long, TransactionRepository>{

}

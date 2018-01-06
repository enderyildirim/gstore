package com.bittechzone.gstore.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.bittechzone.gstore.base.BaseService;
import com.bittechzone.gstore.model.Operation;
import com.bittechzone.gstore.repository.OperationRepository;

@Service
@Transactional
public class OperationService extends BaseService<Operation, Long, OperationRepository>{

}

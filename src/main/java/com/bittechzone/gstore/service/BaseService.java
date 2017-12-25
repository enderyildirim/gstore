package com.bittechzone.gstore.service;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

public abstract class BaseService<E, ID extends Serializable, R extends CrudRepository<E, ID>> {

	@Autowired
	private R repository;

	public void save(@NotNull E entity) {
		repository.save(entity);
	}

	public void save(@NotNull Iterable<E> entities) {
		repository.save(entities);
	}

	public E findByID(@NotNull ID id) {
		return repository.findOne(id);
	}

	public boolean exists(@NotNull ID id) {
		return repository.exists(id);
	}

	public Iterable<E> findAll() {
		return repository.findAll();
	}

	public Iterable<E> findAll(Iterable<ID> ids) {
		return repository.findAll(ids);
	}

	public long count() {
		return repository.count();
	}

	public void delete(@NotNull ID id) {
		repository.delete(id);
	}

	public void delete(@NotNull E entity) {
		repository.delete(entity);
	}

	public void delete(@NotNull Iterable<E> entities) {
		repository.delete(entities);
	}

	public void deleteAll() {
		repository.deleteAll();
	}
	
}

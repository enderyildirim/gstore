package com.bittechzone.gstore.base;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Ender Yıldırım
 *
 * @param <E>  Entity class
 * @param <ID> Id type(Long, Integer vs.)
 * @param <R>  Repository class
 */
public abstract class BaseService<E, ID extends Serializable, R extends CrudRepository<E, ID>> {

	@Autowired
	protected R repository;

	public E save(@NotNull E entity) {
		return repository.save(entity);
	}

	public Iterable<E> save(@NotNull Iterable<E> entities) {
		return repository.save(entities);
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

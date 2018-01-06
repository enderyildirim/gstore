package com.bittechzone.gstore.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.bittechzone.common.helper.DateHelper;

@Entity
public class Operation {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private BigDecimal amount;

	@OneToOne(optional = false)
	private User createdBy;

	@OneToOne
	private User updatedBy;

	@Column(nullable = false)
	private Date createTime = DateHelper.now();

	private Date updateTime;

	@ManyToOne
	private Customer performedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public User getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(User updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Customer getPerformedBy() {
		return performedBy;
	}

	public void setPerformedBy(Customer performedBy) {
		this.performedBy = performedBy;
	}

}

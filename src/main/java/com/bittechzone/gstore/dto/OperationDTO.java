package com.bittechzone.gstore.dto;

import java.math.BigDecimal;
import java.util.Date;

public class OperationDTO {

	private BigDecimal operationAmount;

	private String createdByFirstName;

	private String createdByLastName;

	private Date operationCreateTime;

	private Date operationUpdateTime;

	private String performedByFirstName;

	private String performedByLastName;

	public BigDecimal getOperationAmount() {
		return operationAmount;
	}

	public void setOperationAmount(BigDecimal operationAmount) {
		this.operationAmount = operationAmount;
	}

	public String getCreatedByFirstName() {
		return createdByFirstName;
	}

	public void setCreatedByFirstName(String createdByFirstName) {
		this.createdByFirstName = createdByFirstName;
	}

	public String getCreatedByLastName() {
		return createdByLastName;
	}

	public void setCreatedByLastName(String createdByLastName) {
		this.createdByLastName = createdByLastName;
	}

	public Date getOperationCreateTime() {
		return operationCreateTime;
	}

	public void setOperationCreateTime(Date operationCreateTime) {
		this.operationCreateTime = operationCreateTime;
	}

	public Date getOperationUpdateTime() {
		return operationUpdateTime;
	}

	public void setOperationUpdateTime(Date operationUpdateTime) {
		this.operationUpdateTime = operationUpdateTime;
	}

	public String getPerformedByFirstName() {
		return performedByFirstName;
	}

	public void setPerformedByFirstName(String performedByFirstName) {
		this.performedByFirstName = performedByFirstName;
	}

	public String getPerformedByLastName() {
		return performedByLastName;
	}

	public void setPerformedByLastName(String performedByLastName) {
		this.performedByLastName = performedByLastName;
	}

}

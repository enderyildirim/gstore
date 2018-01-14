package com.bittechzone.gstore.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Sale {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private BigDecimal amount;

    private String note;

    @NotNull
    @OneToOne
    @JoinColumn(nullable = false)
    private User createdBy;

    @OneToOne
    private User updatedBy;

    @Column(updatable = false)
    @CreationTimestamp
    private Date createdTime;

    @Column(insertable = false, updatable = false)
    @UpdateTimestamp
    private Date updatedTime;

    @ManyToOne
    private Customer performedBy;

    public BigDecimal getAmount() {
	return amount;
    }

    public void setAmount(BigDecimal amount) {
	this.amount = amount;
    }

    public String getNote() {
	return note;
    }

    public void setNote(String note) {
	this.note = note;
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

    public Customer getPerformedBy() {
	return performedBy;
    }

    public void setPerformedBy(Customer performedBy) {
	this.performedBy = performedBy;
    }

    public Long getId() {
	return id;
    }

    public Date getCreatedTime() {
	return createdTime;
    }

    public Date getUpdatedTime() {
	return updatedTime;
    }

}

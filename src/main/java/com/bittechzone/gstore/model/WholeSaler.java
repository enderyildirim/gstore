package com.bittechzone.gstore.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class WholeSaler {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    private String lastName;

    private String phone;

    private String email;

    private String address;

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

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getPhone() {
	return phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
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

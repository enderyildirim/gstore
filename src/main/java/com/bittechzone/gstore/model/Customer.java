package com.bittechzone.gstore.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String firstName;

    @NotNull
    @Column(nullable = false)
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String email;

    private String phone;

    private String address;

    @Column(updatable = false)
    @CreationTimestamp
    private Date createdTime;

    @Column(insertable = false)
    @UpdateTimestamp
    private Date updatedTime;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, updatable = false)
    private User createdBy;

    @OneToOne
    private User updatedBy;

    @OneToMany(mappedBy = "performedBy", fetch = FetchType.LAZY)
    private Set<Sale> sales = new HashSet<>();

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

    public Gender getGender() {
	return gender;
    }

    public void setGender(Gender gender) {
	this.gender = gender;
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

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

    public String getPhone() {
	return phone;
    }

    public void setPhone(String phone) {
	this.phone = phone;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

    public Set<Sale> getSales() {
	return sales;
    }

    public void setSales(Set<Sale> sales) {
	this.sales = sales;
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

package com.bittechzone.gstore.model;

import java.math.BigDecimal;
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

import com.bittechzone.gstore.model.composition.Measurement;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Column(nullable = false)
    private String name;

    private String trademark;

    @NotNull
    @Column(nullable = false)
    private BigDecimal price;

    @NotNull
    @Column(nullable = false)
    private BigDecimal cost;

    private Measurement measurement;

    @NotNull
    @OneToOne
    private WholeSaler wholeSaler;

    @Column(updatable = false)
    @CreationTimestamp
    private Date createdTime;

    @Column(insertable = false)
    @UpdateTimestamp
    private Date updatedTime;

    @NotNull
    @OneToOne
    @JoinColumn(nullable = false, updatable = false)
    private User createdBy;

    @OneToOne
    private User updatedBy;

}

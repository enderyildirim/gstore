package com.bittechzone.gstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    // private Category parent;

    // private Set<Product> products = new HashSet<>();
}

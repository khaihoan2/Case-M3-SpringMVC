package com.chinhpc.model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String SKU;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    private double price;

    private String description;

    private double avgRating;

    private String availability ;

    private String colour;
}
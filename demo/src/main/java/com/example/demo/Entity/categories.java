package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "categories")
public class categories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    @JsonProperty("category_id")
    private int category_id;

    @Column(name = "category_name")
    @JsonProperty("category_name")
    private String category_name;


}

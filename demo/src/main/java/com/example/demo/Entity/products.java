package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "products")
public class products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "products_id")
    @JsonProperty("products_id")
    private int products_id;

    @Column(name = "product_name")
    @JsonProperty("product_name")
    private String product_name;

    @Column(name = "product_description")
    @JsonProperty("product_description")
    private String product_description;

    @Column(name = "stock")
    @JsonProperty("stock")
    private int stock;

    @Column(name = "reviews")
    @JsonProperty("reviews")
    private int reviews;

    @Column(name = "category_id")
    @JsonProperty("category_id")
    private int category_id;

    @Column(name = "price")
    @JsonProperty("price")
    private float price;

    @Column(name = "image_url")
    @JsonProperty("image_url")
    private String image_url;

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public int getProducts_id() {
        return products_id;
    }

    public void setProducts_id(int products_id) {
        this.products_id = products_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public products(int products_id, String product_name, String product_description, int stock, int reviews,
            int category_id, int price, String image_url) {
        this.products_id = products_id;
        this.product_name = product_name;
        this.product_description = product_description;
        this.stock = stock;
        this.reviews = reviews;
        this.category_id = category_id;
        this.price = price;
        this.image_url = image_url;
    }

    public products() {
    }

    
}

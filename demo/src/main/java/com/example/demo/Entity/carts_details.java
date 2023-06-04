package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;



@Entity
@Table(name = "carts_details")
public class carts_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_details_id")
    @JsonProperty("cart_details_id")
    private int cart_details_id;

    @Column(name = "cart_id")
    @JsonProperty("cart_id")
    private int cart_id;

    @Column(name = "products_id")
    @JsonProperty("products_id")
    private int products_id;

    @Column(name = "quantity")
    @JsonProperty("quantity")
    private int quantity;

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public int getProducts_id() {
        return products_id;
    }

    public void setProducts_id(int products_id) {
        this.products_id = products_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public carts_details(int cart_id, int products_id, int quantity) {
        this.cart_id = cart_id;
        this.products_id = products_id;
        this.quantity = quantity;
    }

    public carts_details() {
    }
}

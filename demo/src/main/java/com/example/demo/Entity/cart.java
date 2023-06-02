package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "cart")
public class cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    @JsonProperty("cart_id")
    private int cart_id;

    @Column(name = "user_id")
    @JsonProperty("user_id")
    private int user_id;

    @Column(name = "product_id")
    @JsonProperty("product_id")
    private int product_id;

    @Column(name = "quantity")
    @JsonProperty("quantity")
    private int quantity;

    public int getCart_id() {
        return cart_id;
    }

    public void setCart_id(int cart_id) {
        this.cart_id = cart_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public cart(int cart_id, int user_id, int product_id, int quantity) {
        this.cart_id = cart_id;
        this.user_id = user_id;
        this.product_id = product_id;
        this.quantity = quantity;
    }

    public cart() {
    }

}
